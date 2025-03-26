package id.dfroxs.todoapps.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.unit.dp
import id.dfroxs.todoapps.ui.theme.Purple20

@Composable
fun BottomBar() {
    NavigationBar(
        modifier = Modifier.fillMaxWidth()
            .blur(50.dp),
        containerColor = Purple20
    ) {

    }
}