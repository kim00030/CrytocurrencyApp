package com.dan.crytocurrencyapp.domain.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Dan Kim on 2023-08-24
 */
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String
)
