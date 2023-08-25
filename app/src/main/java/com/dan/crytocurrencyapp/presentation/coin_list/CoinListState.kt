package com.dan.crytocurrencyapp.presentation.coin_list

import com.dan.crytocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
