package com.example.fourthcomposesampleapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(
    modifier: Modifier = Modifier
) {
    var count: Int by rememberSaveable {
        mutableStateOf(0)
    }
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var showTask by rememberSaveable {
            mutableStateOf(true)
        }
        if (count > 0) {
            /*var showTask by rememberSaveable {
                mutableStateOf(true)
            }*/
            if (showTask) {
                WellnessTaskItem(
                    taskName = "Have you taken your 15 minute walk today?",
                    checked = true,
                    onCheckedChange = {}
                ) {
                    showTask = false
                }
            }
            Text(
                text = "You've had $count glasses.",
                modifier = modifier.padding(16.dp)
            )
        }
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier.padding(vertical = 8.dp, horizontal = 4.dp),
                onClick = { count++ },
                enabled = count < 10
            ) {
                Text(text = "Add one")
            }

            Button(
                modifier = Modifier.padding(vertical = 8.dp, horizontal = 4.dp),
                onClick = { count = 0 }
            ) {
                Text(text = "Clear water count")
            }
        }

    }
}