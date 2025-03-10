package com.utad.shop.di

import android.content.Context
import androidx.room.Room
import com.utad.shop.data.local.AppDatabase
import com.utad.shop.data.local.dao.ElectronicDao
import com.utad.shop.data.local.dao.JeweleryDao
import com.utad.shop.data.local.dao.MenDao
import com.utad.shop.data.local.dao.WomenDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "shop_database"
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    fun provideElectronicDao(database: AppDatabase): ElectronicDao = database.electronicDao()

    @Provides
    fun provideJeweleryDao(database: AppDatabase): JeweleryDao = database.jeweleryDao()

    @Provides
    fun provideMenClothesDao(database: AppDatabase): MenDao = database.menDao()

    @Provides
    fun provideWomenClothesDao(database: AppDatabase): WomenDao = database.womenDao()
}