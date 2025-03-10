package com.utad.shop.data.repository

import com.utad.shop.data.local.dao.JeweleryDao
import com.utad.shop.data.local.entities.JeweleryEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JelerweryRepository @Inject constructor(private val  jeweleryDao: JeweleryDao) {
    suspend fun getAllJeweleries(): Flow<List<JeweleryEntity>> {
        return jeweleryDao.getAllJeweleries()
    }
}