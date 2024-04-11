package com.example.cryptoapp.di

import android.app.Application
import com.example.cryptoapp.data.database.AppDatabase
import com.example.cryptoapp.data.repository.CoinRepositoryImpl
import com.example.cryptoapp.domain.CoinRepository
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindCoinRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object {

        fun provideCoinInfoDao(application: Application) =
            AppDatabase.getInstance(application).coinPriceInfoDao()
    }
}