package com.simpleappsinc.tip_calculator

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun TipCalculatorNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "main") {
        composable("main") { TipCalculatorApp(navController) }
        composable("settings") { SettingsScreen(navController) }
    }
}