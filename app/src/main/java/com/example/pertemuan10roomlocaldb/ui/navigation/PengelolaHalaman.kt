package com.example.pertemuan10roomlocaldb.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan10roomlocaldb.ui.view.mahasiswa.DestinasiInsert
import com.example.pertemuan10roomlocaldb.ui.view.mahasiswa.InsertMhsView

@Composable
fun Pengelolahalaman(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
){
    NavHost(navController =navController , startDestination =  DestinasiInsert.route)
    {
        composable (route = DestinasiInsert.route)
        {
            InsertMhsView(
                onBack = {}, onNavigate = {}
            )
        }
    }
}