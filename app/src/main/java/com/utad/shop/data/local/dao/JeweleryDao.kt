package com.utad.shop.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.utad.shop.data.local.entities.JeweleryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface JeweleryDao {
    @Query("SELECT * FROM jeweleries")
    fun getAllJeweleries(): Flow<List<JeweleryEntity>>
}