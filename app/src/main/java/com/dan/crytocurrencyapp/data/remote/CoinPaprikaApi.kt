package com.dan.crytocurrencyapp.data.remote

import com.dan.crytocurrencyapp.data.remote.dto.CoinDetailDto
import com.dan.crytocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Dan Kim on 2023-08-24
 */
interface CoinPaprikaApi {

    //https://api.coinpaprika.com/v1/coins
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    //https://api.coinpaprika.com/v1/coins/btc-bitcoin
    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}