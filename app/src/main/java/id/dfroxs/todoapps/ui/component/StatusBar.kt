package id.dfroxs.todoapps.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.dfroxs.todoapps.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatusBar() {
    TopAppBar(
        modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent
        ),
        title = {
            Column(modifier = Modifier.padding(4.dp)) {
                Text(modifier = Modifier.height(18.dp), text = "Hello!", fontSize = 12.sp)
                Text(text = "Angelia", fontSize = 16.sp, fontWeight = FontWeight(900))
            }
        },
        navigationIcon = {
            Image(
                modifier = Modifier.padding(6.dp)
                    .size(45.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape),
                painter = painterResource(id = R.drawable.profile),
                contentScale = ContentScale.Crop,
                contentDescription = "")
        },
        actions = {
            Image(
                modifier = Modifier.padding(16.dp),
                painter = painterResource(id = R.drawable.ic_notification),
                contentDescription = "")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    Surface(){
        StatusBar()
    }
}