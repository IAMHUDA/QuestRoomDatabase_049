package com.example.pertemuan10roomlocaldb.ui.navigation

import android.health.connect.datatypes.ExerciseRoute
interface AlamatNavigasi {
   open val route: String
}

object DestinasiInsert : AlamatNavigasi{   //object akan menjadi nama halaman/ menjadi pengenal halaman
   override val route: String = "insert_mhs"
}

object DestinasiHome : AlamatNavigasi{
   override val route = "home"
}