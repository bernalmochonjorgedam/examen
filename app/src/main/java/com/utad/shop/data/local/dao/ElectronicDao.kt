package com.utad.shop.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.utad.shop.data.local.entities.ElectronicEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ElectronicDao {
    @Query("SELECT * FROM electronics")
    fun getAllElectronics(): Flow<List<ElectronicEntity>>
}