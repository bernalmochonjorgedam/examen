package com.utad.shop.data.repository

import com.utad.shop.data.local.dao.ElectronicDao
import com.utad.shop.data.local.dao.MenDao
import com.utad.shop.data.local.dao.WomenDao
import com.utad.shop.data.local.entities.ElectronicEntity
import com.utad.shop.data.local.entities.MenEntity
import com.utad.shop.data.local.entities.WomenEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WomenRepository @Inject constructor(private val  womenDao: WomenDao) {
    fun getAllWomenClothes(): Flow<List<WomenEntity>> {
        return womenDao.getWomenClothes()
    }
}