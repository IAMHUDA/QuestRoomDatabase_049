package com.example.pertemuan10roomlocaldb.repository

import com.example.pertemuan10roomlocaldb.data.dao.MahasiswaDao
import com.example.pertemuan10roomlocaldb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
):RepositoryMhs{
    override suspend fun  insertMhs(mahasiswa: Mahasiswa){
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    //get all mahasiswa
    override fun getAllMhs(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }
}