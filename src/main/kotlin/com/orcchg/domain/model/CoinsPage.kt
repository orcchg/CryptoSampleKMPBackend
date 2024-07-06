package com.orcchg.domain.model

data class CoinsPage(
    val coins: List<PricedCoin> = emptyList(),
    val offset: Int,
    val total: Int
)
