package com.utad.shop.di

import com.utad.shop.data.remote.api.ElectronicApi
import com.utad.shop.data.remote.api.JeweleryApi
import com.utad.shop.data.remote.api.MenApi
import com.utad.shop.data.remote.api.WomenApi
import com.utad.shop.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    fun provideElectornicApi(retrofit: Retrofit): ElectronicApi = retrofit.create(ElectronicApi::class.java)

    @Singleton
    @Provides
    fun provideJeweleryApi(retrofit: Retrofit): JeweleryApi = retrofit.create(JeweleryApi::class.java)

    @Singleton
    @Provides
    fun provideMenClothesApi(retrofit: Retrofit): MenApi = retrofit.create(MenApi::class.java)

    @Singleton
    @Provides
    fun provideWomenClothesApi(retrofit: Retrofit): WomenApi = retrofit.create(WomenApi::class.java)