package com.utad.shop.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.utad.shop.data.local.entities.MenEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MenDao {
    @Query("SELECT * FROM men_clothes")
    fun getMenClothes(): Flow<List<MenEntity>>
}