package com.tomaszkopacz.presentation.dashboard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DashboardScreen(
    onItemSelected: (String) -> Unit
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            for (i in 1..20) {
                item {
                    Text(
                        modifier = Modifier.clickable { onItemSelected(i.toString()) },
                        text = "Item number: $i"
                    )
                }
            }
        }
    }
}
