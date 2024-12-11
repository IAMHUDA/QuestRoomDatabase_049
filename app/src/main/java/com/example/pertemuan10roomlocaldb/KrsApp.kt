package com.example.pertemuan10roomlocaldb

import android.app.Application
import com.example.pertemuan10roomlocaldb.dependenciesinjection.ContainerApp

class KrsApp:Application() {
    lateinit var containerApp: ContainerApp //fungsinya untuk menyimpan instance

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this)//membuat instance container app
        //instance adalah object yang di buat dari class
    }
}