package id.dfroxs.todoapps.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class BarAttribute(
    var barColor: Color = Color.Blue,
    var trackColor: Color = Color.Gray,
    var progress: Float = 0.1f,
    var textSize: TextUnit = 12.sp,
    var textColor: Color = Color.Black,
    var strokeWidth: Dp = 10.dp,
)