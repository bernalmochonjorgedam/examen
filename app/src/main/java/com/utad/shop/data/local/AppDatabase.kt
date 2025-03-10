package com.utad.shop.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.utad.shop.data.local.dao.ElectronicDao
import com.utad.shop.data.local.dao.JeweleryDao
import com.utad.shop.data.local.dao.MenDao
import com.utad.shop.data.local.dao.WomenDao
import com.utad.shop.data.local.entities.ElectronicEntity
import com.utad.shop.data.local.entities.JeweleryEntity
import com.utad.shop.data.local.entities.MenEntity
import com.utad.shop.data.local.entities.WomenEntity

@Database(entities = [ElectronicEntity::class, JeweleryEntity::class, MenEntity::class, WomenEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun electronicDao(): ElectronicDao
    abstract fun jeweleryDao(): JeweleryDao
    abstract fun menDao(): MenDao
    abstract fun womenDao(): WomenDao
}
