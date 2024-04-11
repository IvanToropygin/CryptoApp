package com.example.cryptoapp.di

import android.app.Application
import com.example.cryptoapp.data.database.AppDatabase
import com.example.cryptoapp.data.network.ApiFactory
import com.example.cryptoapp.data.repository.CoinRepositoryImpl
import com.example.cryptoapp.domain.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindCoinRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object {

        @Provides
        @ApplicationScope
        fun provideCoinInfoDao(application: Application) =
            AppDatabase.getInstance(application).coinPriceInfoDao()

        @ApplicationScope
        @Provides
        fun provideApiService() = ApiFactory.apiService
    }
}