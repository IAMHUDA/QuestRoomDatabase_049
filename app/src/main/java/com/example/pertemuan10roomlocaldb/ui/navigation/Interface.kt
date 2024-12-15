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

object DestinasiDetail : AlamatNavigasi{
   override val route = "detail"
   const val NIM = "nim"
   val routesWithArg = "$route/{$NIM}"
}

object DestinasiUpdate : AlamatNavigasi{
   override val route = "update"
   const val NIM = "nim"
   val routesWithArg = "$route/{${NIM}}"
}