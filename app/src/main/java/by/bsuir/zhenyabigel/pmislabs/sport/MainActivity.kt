package by.bsuir.zhenyabigel.pmislabs.sport

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import by.bsuir.zhenyabigel.pmislabs.sport.screens.MainScreen
import by.bsuir.zhenyabigel.pmislabs.sport.ui.theme.SportTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SportTheme {
                MainScreen()
            }
        }
    }
}
