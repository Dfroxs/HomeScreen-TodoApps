package id.dfroxs.todoapps.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.dfroxs.todoapps.data.ItemProgress
import id.dfroxs.todoapps.ui.theme.Purple50

@Composable
fun InProgressItem(data: ItemProgress) {
    Box {
        Card(
            modifier = Modifier.width(240.dp)
                .padding(vertical = 8.dp)
                .padding(start = 16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = data.containerColor)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = data.title,
                        fontSize = 11.sp,
                        fontWeight = FontWeight(600),
                        color = Color.Gray
                    )
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .background(
                                color = data.secondaryIconColor,
                                shape = RoundedCornerShape(8.dp)
                            )
                    ) {
                        Icon(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(4.dp),
                            painter = painterResource(id = data.icon),
                            tint = data.iconColor,
                            contentDescription = null
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = data.description,
                    fontWeight = FontWeight(600)
                )
                Spacer(modifier = Modifier.height(16.dp))
                LinearProgressIndicator(
                    modifier = Modifier.height(6.dp).fillMaxWidth(),
                    progress = { 0.45f },
                    gapSize = (-4).dp,
                    color = data.progressColor,
                    trackColor = Purple50,
                    strokeCap = StrokeCap.Round,
                    drawStopIndicator = {}
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InProgressItemPreview() {
    InProgressItem(ItemProgress())
}