package com.orcchg.domain.model

data class PricedCoin(
    val coin: Coin,
    val price: Money,
    val delta: Money
)
