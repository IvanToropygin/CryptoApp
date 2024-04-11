package com.example.cryptoapp.di

import android.app.Application
import androidx.room.Room
import com.example.cryptoapp.data.database.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "main.db").build()
    }
}