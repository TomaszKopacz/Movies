package com.tomaszkopacz.presentation.navigation

import androidx.navigation.NavBackStackEntry

internal typealias Route = String

private const val ARGUMENT = "arg"

internal fun Route.withArgument(): Route =
    "$this/{$ARGUMENT}"

internal fun Route.setArgument(argument: String): Route =
    replace(
        oldValue = "{$ARGUMENT}",
        newValue = argument
    )

internal fun NavBackStackEntry.getArgument(): String =
    requireNotNull(arguments?.getString(ARGUMENT))
