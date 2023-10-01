package com.example.bmi_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.bmi_app.ui.theme.App
import com.example.bmi_app.ui.theme.Bmi_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bmi_appTheme {
                    App()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Bmi_App_Preview() {
    Bmi_appTheme {
        App()
    }
}
