package com.orcchg.domain

import com.orcchg.domain.model.CoinsPage

interface CryptoRepository {
    suspend fun coins(limit: Int, offset: Int): CoinsPage
}
