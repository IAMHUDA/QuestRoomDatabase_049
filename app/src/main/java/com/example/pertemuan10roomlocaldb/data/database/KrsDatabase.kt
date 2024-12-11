package com.example.pertemuan10roomlocaldb.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pertemuan10roomlocaldb.data.dao.MahasiswaDao
import com.example.pertemuan10roomlocaldb.data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {

    //mendifinisikan fungsi untuk mengakses data mahasiswa
    abstract fun MahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile //memastikan bahwa nilai varieable instance selalu sama di semua
        private var Instance: KrsDatabase? = null


        fun getDatabase(context : Context):KrsDatabase{
            return (Instance?: synchronized(lock = this){
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java,
                    "KrsDatabase"
                )
                    .build().also { Instance = it }
            })
        }
    }
}