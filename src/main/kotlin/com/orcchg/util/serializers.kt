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

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("com.orcchg.util.BigDecimalSerializer", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: BigDecimal) {
        encoder.encodeString(value.abs().toPlainString())
    }

    override fun deserialize(decoder: Decoder): BigDecimal =
        BigDecimal(decoder.decodeString())
}

object CurrencySerializer : KSerializer<Currency> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("com.orcchg.util.CurrencySerializer", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: Currency) {
        encoder.encodeString(value.currencyCode)
    }

    override fun deserialize(decoder: Decoder): Currency =
        Currency.getInstance(decoder.decodeString())
}

object SignSerializer : KSerializer<MoneySign> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("com.orcchg.util.SignSerializer", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: MoneySign) {
        val ch = when (value) {
            MoneySign.MINUS -> "-"
            MoneySign.PLUS -> "+"
        }
        encoder.encodeString(ch)
    }

    override fun deserialize(decoder: Decoder): MoneySign =
        when (decoder.decodeString()) {
            "-" -> MoneySign.MINUS
            "+" -> MoneySign.PLUS
            else -> MoneySign.PLUS
        }
}
