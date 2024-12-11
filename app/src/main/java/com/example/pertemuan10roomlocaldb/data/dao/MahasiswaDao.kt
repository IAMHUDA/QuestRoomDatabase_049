package com.example.pertemuan10roomlocaldb.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pertemuan10roomlocaldb.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}