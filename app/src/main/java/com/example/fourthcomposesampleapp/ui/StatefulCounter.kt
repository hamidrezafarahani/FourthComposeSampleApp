package com.example.fourthcomposesampleapp.ui

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fourthcomposesampleapp.ui.theme.FourthComposeSampleAppTheme

@Composable
fun StatefulCounter(
    modifier: Modifier = Modifier
) {
    var count by rememberSaveable {
        mutableStateOf(0)
    }
    StatelessCounter(
        modifier = modifier,
        count = count
    ) {
        count++
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
fun StatefulCounterPreview() {
    FourthComposeSampleAppTheme {
        StatefulCounter()
    }
}