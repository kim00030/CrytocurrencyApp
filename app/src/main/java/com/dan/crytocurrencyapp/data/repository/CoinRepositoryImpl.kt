package com.dan.crytocurrencyapp.data.repository

import com.dan.crytocurrencyapp.data.remote.CoinPaprikaApi
import com.dan.crytocurrencyapp.data.remote.dto.CoinDetailDto
import com.dan.crytocurrencyapp.data.remote.dto.CoinDto
import com.dan.crytocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

/**
 * Created by Dan Kim on 2023-08-24
 */
class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }
}