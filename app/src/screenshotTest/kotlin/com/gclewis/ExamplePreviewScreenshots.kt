package com.gclewis

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gclewis.ui.theme.ScreenshotTestingTheme

class ExamplePreviewScreenshots {
    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ScreenshotTestingTheme {
            Greeting("Android")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun SecondaryPreview() {
        ScreenshotTestingTheme {
            SecondaryScreen()
        }
    }
}
