package com.dan.crytocurrencyapp.domain.model

import com.dan.crytocurrencyapp.data.remote.dto.TeamMember

/**
 * Created by Dan Kim on 2023-08-24
 */
data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
