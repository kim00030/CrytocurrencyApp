package com.dan.crytocurrencyapp.data.remote.dto

import com.dan.crytocurrencyapp.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("isNew")
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)


fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}
/*
Api: https://api.coinpaprika.com/v1/coins
a entry looks like

{
  "id": "btc-bitcoin",
  "name": "Bitcoin",
  "symbol": "BTC",
  "rank": 1,
  "is_new": false,
  "is_active": true,
  "type": "coin"
}

 */