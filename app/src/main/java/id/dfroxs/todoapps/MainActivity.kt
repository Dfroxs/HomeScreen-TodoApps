package id.dfroxs.todoapps

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import id.dfroxs.todoapps.ui.screen.HomeScreen
import id.dfroxs.todoapps.ui.theme.HomeScreenTodoAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeScreenTodoAppsTheme {
                HomeScreen()
            }
        }
        confSystemUi()
    }

    private fun confSystemUi(){
        actionBar?.hide()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R){
            window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }else{
            window.insetsController?.apply {
                hide(WindowInsets.Type.statusBars())
            }
        }
    }
}