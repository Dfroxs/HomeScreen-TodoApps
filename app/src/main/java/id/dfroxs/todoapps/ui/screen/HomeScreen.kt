package id.dfroxs.todoapps.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.dfroxs.todoapps.R
import id.dfroxs.todoapps.ui.component.BottomBar
import id.dfroxs.todoapps.ui.component.StatusBar
import id.dfroxs.todoapps.ui.theme.BottomNavigationBackgroundColor
import id.dfroxs.todoapps.ui.theme.HomeScreenTodoAppsTheme

@Composable
fun HomeScreen(modifier: Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = {
            StatusBar()
        },
        bottomBar = {
            BottomBar()
        }) { innerPadding ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .paint(painterResource(id = R.drawable.background))
        )
        LazyColumn(modifier = Modifier.padding(innerPadding)) {

        }
    }
}

@Composable
@Preview(showBackground = true)
fun TodoList() {
    HomeScreenTodoAppsTheme {
        Scaffold(Modifier.fillMaxSize()) { innerPadding ->
            HomeScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}