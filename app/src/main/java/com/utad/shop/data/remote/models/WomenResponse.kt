package com.utad.shop.data.remote.models

import com.google.gson.annotations.SerializedName

data class WomenResponse(
    @SerializedName("results") val movies: List<WomenDto>
)

data class WomenDto(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("price") val price: Double,
    @SerializedName("description") val description: String,
    @SerializedName("category") val category: String,
    @SerializedName("image") val image: String,
    @SerializedName("rating") val rating: String
)
