package com.utad.shop.data.remote.api

import com.utad.shop.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface WomenApi {
    @GET(Constants.ENDPOINT_WOMEN_CLOTHES)
    suspend fun getWomenClothes(
    ): Response<WomenApi>
}
