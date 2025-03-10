package com.utad.shop.data.repository

import com.utad.shop.data.local.dao.ElectronicDao
import com.utad.shop.data.local.dao.MenDao
import com.utad.shop.data.local.entities.ElectronicEntity
import com.utad.shop.data.local.entities.MenEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MenRepository @Inject constructor(private val  menDao: MenDao) {
    fun getAllMenClothes(): Flow<List<MenEntity>> {
        return menDao.getMenClothes()
    }
}