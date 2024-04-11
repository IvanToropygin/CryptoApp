package com.example.cryptoapp.di

import com.example.cryptoapp.data.database.AppDatabase
import com.example.cryptoapp.data.database.CoinInfoDao
import dagger.Module
import dagger.Provides

@Module
class DaoModule {
    @Provides
    fun provideCoinInfoDao(database: AppDatabase): CoinInfoDao {
        return database.coinPriceInfoDao()
    }
}