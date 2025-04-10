package id.dfroxs.todoapps.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.dfroxs.todoapps.model.BarAttribute
import id.dfroxs.todoapps.model.DataTaskGroup

@Composable
fun TaskItem(data: DataTaskGroup) {
    Box {
        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp), verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(data.primaryColor.copy(alpha = 0.2f), shape = RoundedCornerShape(8.dp)),
                ) {
                    Icon(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(24.dp),
                        painter = painterResource(data.icon),
                        contentDescription = null,
                        tint = data.primaryColor
                    )
                }
                Spacer(modifier = Modifier.padding(8.dp))
                Column(
                    modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center
                ) {
                    Text(text = data.category, fontWeight = FontWeight(700), fontSize = 18.sp)
                    Text(
                        text = "${data.totalTask} Task",
                        fontWeight = FontWeight(300),
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
                Spacer(modifier = Modifier.padding(8.dp))
                CircularBar(
                    modifier = Modifier.size(40.dp),
                    data = BarAttribute(
                        barColor = data.primaryColor,
                        progress = data.progress,
                        textColor = Color.Black,
                        textSize = 9.sp,
                        strokeWidth = 4.dp,
                        trackColor = data.primaryColor.copy(alpha = 0.3f)
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTaskGroup() {
    Surface { TaskItem(DataTaskGroup()) }
}