package com.orcchg.domain.model

import com.orcchg.util.BigDecimalSerializer
import com.orcchg.util.CurrencySerializer
import com.orcchg.util.SignSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.NumberFormat
import java.util.Currency

private val exoticCurrency by lazy(LazyThreadSafetyMode.NONE) { "[a-zA-Z]+[€£₽￦¥]+".toRegex() }
private val exoticCurrencyAmount by lazy(LazyThreadSafetyMode.NONE) { ".*\\s+[a-zA-Z]+[$€£₽￦¥]+".toRegex() }

/**
 * Money value.
 *
 * @param amount absolute amount of money with two digits past decimal point
 * @param currency money currency
 * @param sign money sign, represents expense (-) or income (+) operation
 */
@Serializable
data class Money private constructor(
    @SerialName("amount") @Serializable(BigDecimalSerializer::class) val amount: BigDecimal,
    @SerialName("currency") @Serializable(CurrencySerializer::class) val currency: Currency,
    @SerialName("sign") @Serializable(SignSerializer::class) val sign: MoneySign
) {

    /**
     * Retrieves signed amount of money, which is of good fit for arithmetic.
     */
    fun amount(): BigDecimal =
        when (sign) {
            MoneySign.MINUS -> amount.multiply(BigDecimal.valueOf(-1.0))
            MoneySign.PLUS -> amount
        }

    operator fun plus(amount: BigDecimal): Money {
        val balance = amount().plus(amount)
        val sign = deduceSign(balance)
        return Money(amount = balance.abs(), currency = currency, sign = sign)
    }

    operator fun plus(other: Money): Money {
        if (currency.currencyCode != other.currency.currencyCode) {
            throw IllegalArgumentException(EXCEPTION_CURRENCY_EQUAL)
        }

        return plus(other.amount())
    }

    operator fun minus(amount: BigDecimal): Money {
        val balance = amount().minus(amount)
        val sign = deduceSign(balance)
        return Money(amount = balance.abs(), currency = currency, sign = sign)
    }

    operator fun minus(other: Money): Money {
        if (currency.currencyCode != other.currency.currencyCode) {
            throw IllegalArgumentException(EXCEPTION_CURRENCY_EQUAL)
        }

        return minus(other.amount())
    }

    operator fun div(amount: BigDecimal): Money {
        val balance = amount().divide(amount, RoundingMode.HALF_UP)
        val sign = deduceSign(balance)
        return Money(amount = balance.abs(), currency = currency, sign = sign)
    }

    operator fun div(other: Money): Money {
        if (currency.currencyCode != other.currency.currencyCode) {
            throw IllegalArgumentException(EXCEPTION_CURRENCY_EQUAL)
        }

        return div(other.amount())
    }

    operator fun times(amount: BigDecimal): Money {
        val balance = amount().times(amount)
        val sign = deduceSign(balance)
        return Money(amount = balance.abs(), currency = currency, sign = sign)
    }

    operator fun times(other: Money): Money {
        if (currency.currencyCode != other.currency.currencyCode) {
            throw IllegalArgumentException(EXCEPTION_CURRENCY_EQUAL)
        }

        return times(other.amount())
    }

    fun isZero(): Boolean = isZero(amount)

    private fun deduceSign(balance: BigDecimal): MoneySign {
        val signum = balance.signum()
        return when {
            signum < 0 -> MoneySign.MINUS
            signum > 0 -> MoneySign.PLUS
            else -> this.sign
        }
    }

    override fun toString(): String =
        toString(signStrategy = NoSign, locale = currency.getLocale())

    /**
     * Formats amount of money into string like +5 500 $, which is of good fit
     * for displaying. Zero decimal part will be truncated.
     */
    fun toString(signStrategy: SignToStringStrategy, locale: java.util.Locale = Locale.DEFAULT): String {
        val formatter = NumberFormat.getCurrencyInstance(locale)
        formatter.currency = currency

        val amountDecor =
            if (amount.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {
                formatter.maximumFractionDigits = 0
                amount.setScale(0, RoundingMode.DOWN)
            } else {
                formatter.maximumFractionDigits = 2
                amount
            }

        val signDecor = if (amount.compareTo(BigDecimal.ZERO) != 0) signStrategy.getSign(sign) else ""
        val amountFormatted = formatter.format(amountDecor).let {
            if (it.contains(exoticCurrencyAmount)) {
                if (it.contains('$')) {
                    it.replace("$", "D")
                } else {
                    val char = it.last().toString()
                    it.replace(exoticCurrency, char)
                }
            } else it
        }
        return "$signDecor$amountFormatted"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Money

        if (amount.compareTo(other.amount) != 0) return false
        if (currency.currencyCode != other.currency.currencyCode) return false
        return sign == other.sign
    }

    override fun hashCode(): Int {
        var result = amount.hashCode()
        result = 31 * result + currency.hashCode()
        result = 31 * result + sign.hashCode()
        return result
    }

    companion object {
        private const val EXCEPTION_CURRENCY_EQUAL = "Currencies must be equal"

        val ZERO = zero()

        fun by(
            amount: Double,
            currency: Currency = Currency.getInstance(Locale.DEFAULT),
            sign: MoneySign = if (amount >= 0) MoneySign.PLUS else MoneySign.MINUS,
            scale: Int = 2
        ): Money =
            Money(BigDecimal.valueOf(amount).abs().setScale(scale, RoundingMode.HALF_UP), currency, sign)

        fun by(
            amount: BigDecimal,
            currency: Currency = Currency.getInstance(Locale.DEFAULT),
            sign: MoneySign = if (amount.signum() >= 0) MoneySign.PLUS else MoneySign.MINUS
        ): Money =
            Money(amount.abs(), currency, sign)

        fun zero(
            currency: Currency = Currency.getInstance(Locale.DEFAULT),
            scale: Int = 2
        ): Money =
            by(BigDecimal.ZERO.setScale(scale, RoundingMode.HALF_UP), currency, MoneySign.PLUS)

        fun isZero(amount: BigDecimal): Boolean =
            amount.compareTo(BigDecimal.ZERO) == 0

        fun parse(amountAndCurrency: String, currency: Currency? = null): Money {
            val sign = when {
                amountAndCurrency.startsWith('-') -> MoneySign.MINUS
                else -> MoneySign.PLUS
            }
            val afterSign = when (sign) {
                MoneySign.MINUS -> 1
                else -> 0
            }

            val stub = '@'
            val s = amountAndCurrency.indexOfFirst { it.isDigit() }
            val e = amountAndCurrency.indexOfLast { it.isDigit() }
            val interest = amountAndCurrency.substring(s, e + 1).replace("[,.]".toRegex(), "$stub")
            val last = interest.indexOfLast { it == stub }
            val balanceStr = if (last != -1) {
                interest.replaceRange(last..<last + 1, ".")
            } else interest
            val b = balanceStr.replace("[\\s$stub,]".toRegex(), "")
            val balance = b.toBigDecimal()

            val currencyReal = currency ?: run {
                val currencyStr = amountAndCurrency.substring(afterSign, s).trim()
                try {
                    Currency.getInstance(currencyStr)
                } catch (ex: IllegalArgumentException) {
                    val tailCurrencyString = amountAndCurrency.substring(e + 1).trim()
                    try {
                        Currency.getInstance(tailCurrencyString)
                    } catch (exc: IllegalArgumentException) {
                        /**
                         * https://www.xe.com/symbols.php
                         * https://www.fileformat.info/info/unicode/category/Sc/list.htm
                         */
                        val currencyCode = when (currencyStr) {
                            "$" -> "USD"
                            "€" -> "EUR"
                            "£" -> "GBP"
                            "₽", "руб." -> "RUB"
                            "￦" -> "KRW"
                            "CN¥", "¥" -> "CNY"
                            "CA$" -> "CAD"
                            "HK$" -> "HKD"
                            "SG$" -> "SGD"
                            "HKD", "SGD", "CAD" -> currencyStr
                            else -> "RUB"
                        }
                        Currency.getInstance(currencyCode)
                    }
                }
            }

            return Money(amount = balance.abs(), currency = currencyReal, sign = sign)
        }
    }
}

fun Currency.getLocale(): java.util.Locale {
    when (currencyCode) {
        "RUB" -> return Locale.RUSSIA
        else ->
            for (locale in java.util.Locale.getAvailableLocales()) {
                val formatter = NumberFormat.getCurrencyInstance(locale)
                if (currencyCode == formatter.currency.currencyCode) {
                    return locale
                }
            }
    }
    return Locale.DEFAULT
}

enum class MoneySign { MINUS, PLUS }

sealed class SignToStringStrategy {

    abstract fun getSign(sign: MoneySign): String
}

class ForceSign(private val forcedSign: MoneySign) : SignToStringStrategy() {

    override fun getSign(sign: MoneySign): String =
        when (forcedSign) {
            MoneySign.MINUS -> "-"
            MoneySign.PLUS -> "+"
        }
}

data object NoSign : SignToStringStrategy() {

    override fun getSign(sign: MoneySign): String = ""
}

data object SoftSign : SignToStringStrategy() {

    override fun getSign(sign: MoneySign): String =
        when (sign) {
            MoneySign.MINUS -> ""
            MoneySign.PLUS -> "+"
        }
}

data object NegativeSign : SignToStringStrategy() {

    override fun getSign(sign: MoneySign): String =
        when (sign) {
            MoneySign.MINUS -> "-"
            MoneySign.PLUS -> ""
        }
}

data object RealSign : SignToStringStrategy() {

    override fun getSign(sign: MoneySign): String =
        when (sign) {
            MoneySign.MINUS -> "-"
            MoneySign.PLUS -> "+"
        }
}

data class RealNoZeroSign(private val isZero: Boolean) : SignToStringStrategy() {

    override fun getSign(sign: MoneySign): String =
        if (isZero) ""
        else
            when (sign) {
                MoneySign.MINUS -> "-"
                MoneySign.PLUS -> "+"
            }
}

fun BigDecimal.money(currency: Currency = Currency.getInstance(Locale.DEFAULT)): Money = Money.by(this, currency)
fun Double.money(currency: Currency = Currency.getInstance(Locale.DEFAULT), scale: Int = 2): Money = Money.by(this, currency, scale = scale)
fun Int.money(currency: Currency = Currency.getInstance(Locale.DEFAULT)): Money =
    Money.by(BigDecimal.valueOf(this.toLong()), currency)
fun Long.money(currency: Currency = Currency.getInstance(Locale.DEFAULT)): Money =
    Money.by(BigDecimal.valueOf(this), currency)

operator fun Money.div(r: Double): Money =
    Money.by(amount().divide(BigDecimal.valueOf(r), RoundingMode.HALF_UP), currency)
operator fun Money.times(r: Double): Money = Money.by(amount().times(BigDecimal.valueOf(r)), currency)

fun formatPriceChange(price: Money, change: Money): String {
    val percentage = if (price.isZero()) 0.00 else ((change * 100.0) / price).amount()
    return "${change.toString(RealNoZeroSign(change.isZero()))} ($percentage%)"
}

object Locale {

    val RUSSIA: java.util.Locale
        get() = java.util.Locale("ru", "RU")

    val DEFAULT: java.util.Locale
        get() = java.util.Locale.US
}
