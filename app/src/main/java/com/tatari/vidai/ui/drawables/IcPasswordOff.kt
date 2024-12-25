package com.furkandogan.doganlarkuyumculuk.ui.drawables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcPasswordOff
import kotlin.Unit

public val Icons.IcPasswordOff: ImageVector
    get() {
        if (_icPasswordOff != null) {
            return _icPasswordOff!!
        }
        _icPasswordOff = Builder(name = "IcPasswordOff", defaultWidth = 20.0.dp, defaultHeight =
                21.0.dp, viewportWidth = 20.0f, viewportHeight = 21.0f).apply {
            path(fill = null, stroke = SolidColor(Color(0xFFC2C3CB)), strokeLineWidth = 1.5f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.52f, 16.678f)
                curveToRelative(-0.81f, 0.21f, -1.65f, 0.31f, -2.52f, 0.31f)
                curveToRelative(-3.27f, 0.0f, -6.2f, -1.53f, -8.2f, -3.95f)
                curveToRelative(-1.4f, -1.69f, -1.4f, -4.3f, 0.0f, -5.98f)
                curveToRelative(0.16f, -0.2f, 0.34f, -0.39f, 0.52f, -0.58f)
                moveToRelative(15.88f, 6.56f)
                curveToRelative(-0.8f, 0.96f, -1.75f, 1.78f, -2.8f, 2.42f)
                lineTo(4.59f, 4.638f)
                curveToRelative(1.59f, -0.98f, 3.43f, -1.53f, 5.41f, -1.53f)
                curveToRelative(3.27f, 0.0f, 6.2f, 1.53f, 8.2f, 3.95f)
                curveToRelative(1.4f, 1.68f, 1.4f, 4.3f, 0.0f, 5.98f)
                close()
            }
            path(fill = null, stroke = SolidColor(Color(0xFFC2C3CB)), strokeLineWidth = 1.5f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.08f, 10.048f)
                curveToRelative(0.0f, 0.85f, -0.35f, 1.62f, -0.9f, 2.18f)
                lineToRelative(-4.36f, -4.36f)
                curveToRelative(0.55f, -0.56f, 1.33f, -0.9f, 2.18f, -0.9f)
                curveToRelative(1.71f, 0.0f, 3.08f, 1.37f, 3.08f, 3.08f)
                close()
                moveTo(0.75f, 0.798f)
                lineToRelative(3.84f, 3.84f)
                lineToRelative(3.23f, 3.23f)
                lineToRelative(4.36f, 4.36f)
                lineToRelative(3.23f, 3.23f)
                lineToRelative(3.84f, 3.84f)
            }
        }
        .build()
        return _icPasswordOff!!
    }

private var _icPasswordOff: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcPasswordOff, contentDescription = "")
    }
}
