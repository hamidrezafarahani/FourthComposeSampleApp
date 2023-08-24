package com.example.fourthcomposesampleapp.data

object Repository {

    fun getWellnessTask(): List<WellnessTask> {
        return List(100) {
            WellnessTask(it, "task $it")
        }
    }
}