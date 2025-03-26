package id.dfroxs.todoapps.data

import androidx.compose.ui.graphics.Color
import id.dfroxs.todoapps.R
import id.dfroxs.todoapps.ui.theme.Blue20
import id.dfroxs.todoapps.ui.theme.Pink100
import id.dfroxs.todoapps.ui.theme.Pink30

data class ItemProgress(
    val containerColor : Color = Blue20,
    val progressColor : Color = Color.Blue,
    val title : String = "Office Project",
    val description : String = "Grocery shopping app design",
    val iconColor : Color = Pink100,
    val secondaryIconColor : Color = Pink30,
    val icon : Int = R.drawable.ic_home,
    val progress : Float = 0.55f
)
