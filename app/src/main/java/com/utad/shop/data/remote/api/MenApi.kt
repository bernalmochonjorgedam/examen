package com.utad.shop.data.remote.api

import com.utad.shop.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface MenApi {
    @GET(Constants.ENDPOINT_MENS_CLOTHES)
    suspend fun getMenClothes(
    ): Response<MenApi>
}
