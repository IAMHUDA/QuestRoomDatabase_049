package com.example.pertemuan10roomlocaldb.repository

import com.example.pertemuan10roomlocaldb.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}