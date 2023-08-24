package com.dan.crytocurrencyapp.di

import com.dan.crytocurrencyapp.common.Constants
import com.dan.crytocurrencyapp.data.remote.CoinPaprikaApi
import com.dan.crytocurrencyapp.data.repository.CoinRepositoryImpl
import com.dan.crytocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesCoinPaprikaApi(): CoinPaprikaApi {

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Singleton
    @Provides
    fun providesCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(api = api)
    }
}