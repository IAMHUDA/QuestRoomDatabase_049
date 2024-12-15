package com.example.pertemuan10roomlocaldb.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pertemuan10roomlocaldb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    //fungsi get all data
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>

    //get Mahasiswa
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim: String): Flow<Mahasiswa>

    //delete mahasiswa
    @Delete
    suspend fun  deleteMahasiswa(mahasiswa: Mahasiswa)

    //update Mahasiswa
    @Update
    suspend fun  updateMahasiswa(mahasiswa: Mahasiswa)
}