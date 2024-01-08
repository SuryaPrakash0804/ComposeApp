package com.example.composeapp.customCompose.hiltAndNew.Elite

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.customCompose.hiltAndNew.Screens.GuideScreen
import com.example.composeapp.customCompose.hiltAndNew.Screens.SplashScreen


@Composable
fun AppNavController() {

    val navController= rememberNavController()


    NavHost(navController = navController, startDestination = Splash ){
        composable(Splash){
            SplashScreen(navController)
        }

        composable(GuidScreens){
            GuideScreen(navController)
        }
    }

}






const val Splash="Splash_Screen"
const val GuidScreens="GuideScreens"