package com.example.fourthcomposesampleapp.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fourthcomposesampleapp.data.Repository
import com.example.fourthcomposesampleapp.ui.theme.FourthComposeSampleAppTheme

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier) {
        WaterCounter()

        val list = remember {
            Repository.getWellnessTask().toMutableStateList()
        }
        WellnessTaskList(list = list) {
            list.remove(it)
        }
    }

}

@Preview(
    "Light Mode",
    showBackground = true
)
@Preview(
    "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun WellnessScreenPreview() {
    FourthComposeSampleAppTheme {
        WellnessScreen()
    }
}