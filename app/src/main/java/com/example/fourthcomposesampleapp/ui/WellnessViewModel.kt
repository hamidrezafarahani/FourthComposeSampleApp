package com.example.fourthcomposesampleapp.ui

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.fourthcomposesampleapp.data.Repository
import com.example.fourthcomposesampleapp.data.WellnessTask

class WellnessViewModel : ViewModel() {

    private val _tasks = Repository.getWellnessTask().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(task: WellnessTask) {
        _tasks.remove(task)
    }

    fun changeTaskChecked(task: WellnessTask, check: Boolean) {
        _tasks.find {
            it.id == task.id
        }?.apply {
            checked = check
        }
    }
}