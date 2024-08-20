package com.tomaszkopacz.movies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.tomaszkopacz.movies.ui.theme.MoviesTheme
import com.tomaszkopacz.presentation.navigation.Dashboard
import com.tomaszkopacz.presentation.navigation.moviesGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            MoviesTheme {
                NavHost(navController = navController, startDestination = Dashboard) {
                    moviesGraph(navController)
                }
            }
        }
    }
}
