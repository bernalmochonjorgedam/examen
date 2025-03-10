package com.utad.shop.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.utad.shop.data.local.entities.WomenEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WomenDao {
    @Query("SELECT * FROM women_clothes")
    fun getWomenClothes(): Flow<List<WomenEntity>>
}