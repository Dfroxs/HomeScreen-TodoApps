package id.dfroxs.todoapps.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import id.dfroxs.todoapps.data.BarAttribute
import id.dfroxs.todoapps.ui.theme.Purple50

@Composable
fun CircularBar(
    modifier: Modifier,
    data: BarAttribute = BarAttribute(),
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            progress = {
                data.progress
            },
            modifier = Modifier.fillMaxSize(),
            color = data.barColor,
            strokeWidth = data.strokeWidth,
            trackColor = Purple50,
            strokeCap = StrokeCap.Round,
            gapSize = 0.dp
        )

        Text(
            modifier = Modifier.align(Alignment.Center),
            text = String.format("%.0f", data.progress * 100) + "%",
            fontSize = data.textSize,
            fontWeight = FontWeight(900),
            color = data.textColor,
            textAlign = TextAlign.Center,
        )
    }
}