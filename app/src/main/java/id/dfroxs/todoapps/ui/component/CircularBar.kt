package id.dfroxs.todoapps.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.dfroxs.todoapps.ui.theme.Purple50

@Composable
fun CircularBar(modifier: Modifier) {
    Box(modifier = modifier,
        contentAlignment = Alignment.Center) {
        CircularProgressIndicator(
            progress = {
                0.75f
            },
            modifier = Modifier.fillMaxSize(),
            color = Color.White,
            strokeWidth = 10.dp,
            trackColor = Purple50,
            strokeCap = StrokeCap.Round,
            gapSize = 0.dp
        )

        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "75%",
            fontSize = 16.sp,
            fontWeight = FontWeight(900),
            color = Color.White,
            textAlign = TextAlign.Center,
        )
    }
}