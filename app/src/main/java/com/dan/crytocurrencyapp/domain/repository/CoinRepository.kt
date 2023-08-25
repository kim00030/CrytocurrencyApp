package com.dan.crytocurrencyapp.domain.repository

import com.dan.crytocurrencyapp.data.remote.dto.CoinDetailDto
import com.dan.crytocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins() : List<CoinDto>
    suspend fun getCoinById(coinId: String) : CoinDetailDto
}