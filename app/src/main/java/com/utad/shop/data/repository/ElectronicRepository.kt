package com.utad.shop.data.repository

import com.utad.shop.data.local.dao.ElectronicDao
import com.utad.shop.data.local.entities.ElectronicEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ElectronicRepository @Inject constructor(private val  electronicDao: ElectronicDao) {
    fun getAllElectronics(): Flow<List<ElectronicEntity>> {
        return electronicDao.getAllElectronics()
    }
}