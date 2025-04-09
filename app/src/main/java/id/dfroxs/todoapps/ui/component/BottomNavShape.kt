package id.dfroxs.todoapps.ui.component

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class BottomNavShape(
    private val cornerRadius: Float,
    private val dockRadius: Float,
) : Shape{
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseRect = Path().apply {
            addRoundRect(
                RoundRect(
                    rect = Rect(Offset.Zero, Offset(size.width, size.height)),
                    topLeft = CornerRadius(cornerRadius, cornerRadius),
                    topRight = CornerRadius(cornerRadius, cornerRadius)
                )
            )
        }

        val rect1 = Path().apply {
            addRoundRect(
                RoundRect(
                    rect = Rect(Offset.Zero, Offset(size.width / 2 - dockRadius + 4f, size.height)),
                    topLeft = CornerRadius(cornerRadius, cornerRadius)
                )
            )
        }

        val rect1A = Path().apply {
            addRoundRect(
                RoundRect(
                    rect = Rect(Offset.Zero, Offset(size.width / 2 - dockRadius + 4f, size.height)),
                    topLeft = CornerRadius(cornerRadius, cornerRadius),
                    topRight = CornerRadius(32f, 32f)
                )
            )
        }

        val rect1B = Path.combine(
            PathOperation.Difference,
            rect1,
            rect1A
        )

        val rect2 = Path().apply {
            addRoundRect(
                RoundRect(
                    rect = Rect(Offset(size.width / 2 + dockRadius - 4f, 0f), Offset(size.width, size.height)),
                    topRight = CornerRadius(cornerRadius, cornerRadius)
                )
            )
        }

        val rect2A = Path().apply {
            addRoundRect(
                RoundRect(
                    rect = Rect(Offset(size.width / 2 + dockRadius - 4f, 0f), Offset(size.width, size.height)),
                    topRight = CornerRadius(cornerRadius, cornerRadius),
                    topLeft = CornerRadius(32f, 32f)
                )
            )
        }

        val rect2B = Path.combine(
            PathOperation.Difference,
            rect2,
            rect2A
        )

        val circle = Path().apply {
            addOval(
                oval = Rect(
                    Offset(size.width / 2 - dockRadius, -dockRadius),
                    Offset(size.width / 2 + dockRadius, dockRadius)
                )
            )
        }

        val path1 = Path.combine(
            PathOperation.Difference,
            baseRect,
            circle
        )

        val path2 = Path.combine(
            PathOperation.Difference,
            path1,
            rect1B
        )

        val path = Path.combine(
            PathOperation.Difference,
            path2,
            rect2B
        )

        return Outline.Generic(path)
    }
}