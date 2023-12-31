package com.dan.crytocurrencyapp.domain.use_case.get_coins

import com.dan.crytocurrencyapp.common.Resource
import com.dan.crytocurrencyapp.data.remote.dto.toCoin
import com.dan.crytocurrencyapp.domain.model.Coin
import com.dan.crytocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {

        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { coinDto ->
                coinDto.toCoin()
            }
            emit(Resource.Success(data = coins))

        } catch (e: HttpException) {
            emit(Resource.Error(message = e.message ?: "An expected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.message ?: "Check your connection"))
        }
    }
}