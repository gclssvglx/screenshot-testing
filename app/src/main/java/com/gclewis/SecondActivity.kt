package com.gclewis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gclewis.ui.theme.ScreenshotTestingTheme

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenshotTestingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SecondaryScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun SecondaryScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Second Activity")

        Spacer(modifier = Modifier.height(32.dp))

        Image(
            modifier = modifier
                .clip(RoundedCornerShape(20.dp))
                .background(color = Color(0xFFFE0000))
                .padding(20.dp),
            painter = painterResource(R.drawable.ai_generated_8579959_1280),
            contentDescription = "Robot",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SecondaryPreview() {
    ScreenshotTestingTheme {
        SecondaryScreen()
    }
}
