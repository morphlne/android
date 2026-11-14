package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .safeDrawingPadding()
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val painter = painterResource(R.drawable.logo)
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painter,
                contentDescription = "Android dev logo",
                modifier = Modifier.width(220.dp)
            )
            Text(
                text = "Emely Doe",
                modifier = Modifier.padding(top = 8.dp),
                color = Color(0xFF042936),
                fontSize = 46.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "Android developer",
                color = Color(0xFF042936),
                fontSize = 26.sp
            )
        }
        Column(
            modifier = Modifier.padding(bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Contact(
                painter = painterResource(id = R.drawable.baseline_phone_24),
                contact = "+34 123 456 789 33"
            )
            Contact(
                painter = painterResource(id = R.drawable.baseline_share_24),
                contact = "@emely.social"
            )
            Contact(
                painter = painterResource(id = R.drawable.baseline_email_24),
                contact = "emely.doe@domain.com"
            )
        }
    }
}

@Composable
fun Contact(painter: Painter, contact: String) {
    Row() {
        Icon(
            painter = painter,
            contentDescription = "Contact icon",
            tint = Color(0xFF2d9057)
        )
        Text(
            text = contact,
            color = Color(0xFF042936),
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardScreen()
    }
}
