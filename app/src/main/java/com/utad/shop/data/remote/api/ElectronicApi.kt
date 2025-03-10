package com.utad.shop.data.remote.api

import com.utad.shop.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ElectronicApi {
    @GET(Constants.ENDPOINT_ELECTRONIC)
    suspend fun getElectronics(
    ): Response<ElectronicApi>
}
