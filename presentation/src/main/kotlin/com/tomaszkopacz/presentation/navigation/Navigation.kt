package com.tomaszkopacz.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.tomaszkopacz.presentation.dashboard.DashboardScreen
import com.tomaszkopacz.presentation.details.DetailsScreen

const val Dashboard: Route = "dashboard"
val Details: Route = "details".withArgument()

fun NavGraphBuilder.moviesGraph(
    navController: NavHostController
) {
    composable(Dashboard) {
        DashboardScreen(
            onItemSelected = { navController.navigate(Details.setArgument(it)) }
        )
    }

    composable(Details) { entry ->
        DetailsScreen(
            id = entry.getArgument()
        )
    }
}
