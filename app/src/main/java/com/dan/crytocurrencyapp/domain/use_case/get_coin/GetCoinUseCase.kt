package com.dan.crytocurrencyapp.domain.use_case.get_coin

import com.dan.crytocurrencyapp.common.Resource
import com.dan.crytocurrencyapp.data.remote.dto.toCoinDetail
import com.dan.crytocurrencyapp.domain.model.CoinDetail
import com.dan.crytocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {

        try {
            emit(Resource.Loading())
            val coinDetail = coinRepository.getCoinById(coinId = coinId).toCoinDetail()
            emit(Resource.Success(data = coinDetail))

        } catch (e: HttpException) {
            emit(Resource.Error(message = e.message ?: "Unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.message ?: "Check your internet connection"))
        }
    }
}