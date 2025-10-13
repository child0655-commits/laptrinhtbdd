package com.example.imreadyui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imreadyui.ui.theme.ImReadyUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImReadyUITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ReadyScreen()
                }
            }
        }
    }
}

@Composable
fun ReadyScreen() {
    // Column chính canh giữa theo chiều dọc và ngang
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),               // khoảng cách ra lề
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo (đặt trong Box để dễ căn chỉnh nếu cần)
        Image(
            painter = painterResource(id = R.drawable.jetpack_compose_logo),
            contentDescription = "Jetpack Compose Logo",
            modifier = Modifier
                .size(160.dp)              // kích thước logo
        )

        Spacer(modifier = Modifier.height(28.dp))

        // Tiêu đề
        Text(
            text = "Jetpack Compose",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Mô tả (giới hạn chiều rộng bằng Modifier.widthIn hoặc padding)
        Text(
            text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth(0.9f)
        )

        Spacer(modifier = Modifier.height(36.dp))

        // Nút "I'm ready" kiểu bo tròn và màu xanh
        Button(
            onClick = { /* xử lý khi bấm */ },
            shape = RoundedCornerShape(28.dp),
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(48.dp)
        ) {
            Text(text = "I'm ready", fontSize = 16.sp)
        }
    }
}
