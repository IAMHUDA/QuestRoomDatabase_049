package com.example.pertemuan10roomlocaldb.dependenciesinjection

import android.content.Context
import com.example.pertemuan10roomlocaldb.data.database.KrsDatabase
import com.example.pertemuan10roomlocaldb.repository.LocalRepositoryMhs
import com.example.pertemuan10roomlocaldb.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp (private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).MahasiswaDao())
    }
}