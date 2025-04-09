package id.dfroxs.todoapps.data

import androidx.compose.ui.graphics.Color
import id.dfroxs.todoapps.R

class DataTaskGroup (
    val category: String = "",
    val totalTask: Int = 0,
    val icon: Int = R.drawable.ic_bag,
    val progress: Float = 0f,
    val primaryColor: Color = Color.Blue
)