package com.orcchg.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinsPage(
    @SerialName("coins") val coins: List<PricedCoin> = emptyList(),
    @SerialName("offset") val offset: Int,
    @SerialName("total") val total: Int
)
