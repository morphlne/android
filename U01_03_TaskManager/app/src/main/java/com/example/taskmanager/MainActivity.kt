package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskCompletedScreen(
                        painterResource(R.drawable.ic_task_completed),
                        stringResource(R.string.title),
                        stringResource(R.string.subtitle)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskCompletedScreen(
    painter: Painter,
    title: String,
    subtitle: String
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Image(
            painter = painter,
            contentDescription = null
        )
        Text(
            text = title,
            modifier = Modifier.padding(
                top = 24.dp,
                bottom = 8.dp
            ),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = subtitle,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCompletedScreenPreview() {
    TaskManagerTheme {
        TaskCompletedScreen(
            painterResource(R.drawable.ic_task_completed),
            stringResource(R.string.title),
            stringResource(R.string.subtitle)
        )
    }
}