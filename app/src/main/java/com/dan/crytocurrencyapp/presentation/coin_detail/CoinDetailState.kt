package com.dan.crytocurrencyapp.presentation.coin_detail

import com.dan.crytocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
