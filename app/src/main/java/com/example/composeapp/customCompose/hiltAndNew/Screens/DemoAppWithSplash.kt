package com.example.composeapp.customCompose.hiltAndNew.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun DemoApp() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Splash_Screen"){

        composable("Splash_Screen"){
            SplashScreen(navController)
        }

        composable("Login_Screen"){

        }
    }
}