package com.example.fourthcomposesampleapp.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList

@Composable
fun <T : Any> rememberMutableStateListOf(elements: List<T>): SnapshotStateList<T> {
    return rememberSaveable(
        saver = listSaver(
            save = {
                if (it.isNotEmpty()) {
                    val first = it.first()
                    if (!canBeSaved(first)) {
                        throw IllegalStateException(
                            """
                            ${first::class} cannot be saved.
                             By default only types which can be stored in the Bundle class can be saved.
                        """.trimIndent()
                        )
                    }
                }
                it
            },
            restore = {
                it.toMutableStateList()
            }
        )
    ) {
        elements.toMutableStateList()
    }
}