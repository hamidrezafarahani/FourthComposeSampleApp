package com.example.fourthcomposesampleapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StatelessCounter(
    modifier: Modifier = Modifier,
    count: Int,
    onIncrement: () -> Unit
) {
    Column(modifier) {
        if (count > 0) {
            Text(text = "You've had $count glasses.")
        }
        Button(onClick = onIncrement) {
            Text(text = "Add one")
        }
    }
}