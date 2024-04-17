package com.stu.store.cart.data.local.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.stu.store.cart.domain.converters.ProductInfoConverter
import com.stu.store.cart.domain.model.Cart

@Database(entities = [Cart::class], version = 1)
@TypeConverters(ProductInfoConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cartDao(): CartDao
}