package com.codelab.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codelab.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                Surface (
                    modifier = Modifier.fillMaxSize()
                ) {
                    BirthdayCard(
                        name = "cara",
                        from = "Marco",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun BirthdayCard(name: String, from: String, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Feliz aniversário, $name!",
            fontSize = 45.sp,
            lineHeight = 45.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "De $from.",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(8.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = false,
    showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
        Surface (
            modifier = Modifier.fillMaxSize()
        ) {
                BirthdayCard(name = "cara", from = "Marco")
        }
    }
}