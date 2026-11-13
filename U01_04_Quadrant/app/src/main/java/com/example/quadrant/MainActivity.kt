package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .safeDrawingPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantScreen()
                }
            }
        }
    }
}

@Composable
fun QuadrantScreen(modifier: Modifier = Modifier) {
    Column(modifier) {
        Row(
            modifier = Modifier.weight(weight = 0.5f)
        ) {
            Quarter(
                stringResource(R.string.top_left_title),
                stringResource(R.string.top_left_text),
                color = Color(0xFF202300),
                modifier = Modifier.weight(weight = 0.5f)
            )
            Quarter(
                stringResource(R.string.top_rigth_title),
                stringResource(R.string.top_right_text),
                color = Color(0xFF6E6702),
                modifier = Modifier.weight(weight = 0.5f)
            )
        }
        Row(
            modifier = Modifier.weight(weight = 0.5f)
        ) {
            Quarter(
                stringResource(R.string.bottom_left_title),
                stringResource(R.string.bottom_left_text),
                color = Color(0xFFC05805),
                modifier = Modifier.weight(weight = 0.5f)
            )
            Quarter(
                stringResource(R.string.bottom_right_title),
                stringResource(R.string.bottom_right_text),
                color = Color(0xFFDB9501),
                modifier = Modifier.weight(weight = 0.5f)
            )
        }
    }
}

@Composable
fun Quarter(title: String, text: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = text,
            color = Color.White,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantScreenPreview() {
    QuadrantTheme {
        QuadrantScreen()
    }
}
