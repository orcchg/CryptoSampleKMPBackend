package com.orcchg.data

import com.orcchg.domain.model.PricedCoin

interface CoinPriceRepository {
    suspend fun getPrice(index: Long): PricedCoin?
}
