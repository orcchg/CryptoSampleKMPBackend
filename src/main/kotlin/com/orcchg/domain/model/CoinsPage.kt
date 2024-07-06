package com.orcchg.domain.model

data class CoinsPage(
    val coins: List<Coin> = emptyList(),
    val offset: Int,
    val total: Int
)
