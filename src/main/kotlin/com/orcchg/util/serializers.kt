package com.orcchg.util

import com.orcchg.domain.model.MoneySign
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.math.BigDecimal
import java.util.Currency

object BigDecimalSerializer : KSerializer<BigDecimal> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("decimal", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: BigDecimal) {
        encoder.encodeString(value.abs().toPlainString())
    }

    override fun deserialize(decoder: Decoder): BigDecimal {
        val string = decoder.decodeString()
        return BigDecimal(string)
    }
}

object CurrencySerializer : KSerializer<Currency> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("currency", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: Currency) {
        encoder.encodeString(value.currencyCode)
    }

    override fun deserialize(decoder: Decoder): Currency {
        val currencyCode = decoder.decodeString()
        return Currency.getInstance(currencyCode)
    }
}

object SignSerializer : KSerializer<MoneySign> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("sign", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: MoneySign) {
        val ch = when (value) {
            MoneySign.MINUS -> "-"
            MoneySign.PLUS -> "+"
        }
        encoder.encodeString(ch)
    }

    override fun deserialize(decoder: Decoder): MoneySign {
        val ch = decoder.decodeString()
        return when (ch) {
            "-" -> MoneySign.MINUS
            "+" -> MoneySign.PLUS
            else -> MoneySign.PLUS
        }
    }
}
