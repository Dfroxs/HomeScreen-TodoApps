package id.dfroxs.todoapps.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import id.dfroxs.todoapps.data.NavScreen
import id.dfroxs.todoapps.data.navItems
import id.dfroxs.todoapps.ui.theme.navColor

@Composable
fun BoxScope.BottomNavPanel() {
    Box(
        modifier = Modifier
            .align(Alignment.BottomCenter)
            .fillMaxWidth()
            .height(64.dp)
            .clip(
                BottomNavShape(
                    cornerRadius = with(LocalDensity.current) { 20.dp.toPx() },
                    dockRadius = with(LocalDensity.current) { 34.dp.toPx() }
                )
            )
            .background(navColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            navItems.forEach { item ->
                IconButton(
                    modifier = Modifier
                        .size(28.dp),
                    onClick = {}
                ) {
                    if (item.title != NavScreen.Create.title)
                        Image(painter = painterResource(item.icon), item.title)
                }
            }
        }
    }
}