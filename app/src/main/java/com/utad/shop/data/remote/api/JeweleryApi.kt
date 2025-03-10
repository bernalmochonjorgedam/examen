package com.utad.shop.data.remote.api

import com.utad.shop.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface JeweleryApi {
    @GET(Constants.ENDPOINT_JEWELERY)
    suspend fun getJewelery(
    ): Response<JeweleryApi>
}
