package com.example.fourthcomposesampleapp.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fourthcomposesampleapp.data.Repository
import com.example.fourthcomposesampleapp.data.WellnessTask

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = Repository.getWellnessTask()
) {
    LazyColumn(modifier) {
        items(list) {
            WellnessTaskItem(taskName = it.label)
        }
    }
}