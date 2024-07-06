package com.orcchg.di

import com.orcchg.data.CoinPriceRepository
import com.orcchg.data.FakeCoinPriceRepository
import com.orcchg.data.InMemoryCryptoRepository
import com.orcchg.domain.CryptoRepository
import org.koin.core.qualifier.named
import org.koin.dsl.module

internal val commonModule = module {
    single<CoinPriceRepository>(named(Qualifier.FAKE)) {
        FakeCoinPriceRepository()
    }

    single<CryptoRepository>(named(Qualifier.IN_MEMORY)) {
        InMemoryCryptoRepository(
            coinPriceRepository = get(qualifier = named(Qualifier.FAKE))
        )
    }
}
