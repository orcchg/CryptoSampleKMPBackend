package com.orcchg.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PricedCoin(
    @SerialName("coin") val coin: Coin,
    @SerialName("price") val price: Money,
    @SerialName("delta") val delta: Money
)
