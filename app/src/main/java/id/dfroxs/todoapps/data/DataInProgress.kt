package id.dfroxs.todoapps.data

import androidx.compose.ui.graphics.Color
import id.dfroxs.todoapps.R
import id.dfroxs.todoapps.ui.theme.Blue100
import id.dfroxs.todoapps.ui.theme.Pink100

data class DataInProgress(
    val primaryColor : Color = Blue100,
    val secondaryColor : Color = Pink100,
    val category : String = "Office Project",
    val title : String = "Grocery shopping app design",
    val icon : Int = R.drawable.ic_home,
    val progress : Float = 0.55f
)
