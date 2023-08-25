package com.dan.crytocurrencyapp.data.remote

import com.dan.crytocurrencyapp.data.remote.dto.CoinDetailDto
import com.dan.crytocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    //https://api.coinpaprika.com/v1/coins
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    //https://api.coinpaprika.com/v1/coins/btc-bitcoin
    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}