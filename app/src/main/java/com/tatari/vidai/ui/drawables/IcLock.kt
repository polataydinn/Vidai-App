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
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcLock
import kotlin.Unit

public val Icons.IcLock: ImageVector
    get() {
        if (_icLock != null) {
            return _icLock!!
        }
        _icLock = Builder(name = "IcLock", defaultWidth = 19.0.dp, defaultHeight = 21.0.dp,
                viewportWidth = 19.0f, viewportHeight = 21.0f).apply {
            path(fill = null, stroke = SolidColor(Color(0xFFC2C3CB)), strokeLineWidth = 1.5625f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.917f, 16.912f)
                verticalLineToRelative(-4.156f)
                curveToRelative(0.0f, -1.813f, 1.468f, -3.292f, 3.291f, -3.292f)
                horizontalLineToRelative(10.594f)
                curveToRelative(1.813f, 0.0f, 3.292f, 1.469f, 3.292f, 3.292f)
                verticalLineToRelative(4.156f)
                curveToRelative(0.0f, 1.813f, -1.469f, 3.292f, -3.292f, 3.292f)
                horizontalLineTo(4.208f)
                curveToRelative(-1.823f, 0.0f, -3.291f, -1.469f, -3.291f, -3.292f)
                close()
            }
            path(fill = null, stroke = SolidColor(Color(0xFFC2C3CB)), strokeLineWidth = 1.5625f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.135f, 9.475f)
                verticalLineTo(6.298f)
                curveToRelative(0.0f, -2.959f, 2.407f, -5.365f, 5.365f, -5.365f)
                reflectiveCurveToRelative(5.365f, 2.406f, 5.365f, 5.365f)
                verticalLineToRelative(3.177f)
                horizontalLineTo(4.135f)
                close()
                moveToRelative(5.365f, 7.51f)
                verticalLineToRelative(-2.687f)
                moveToRelative(0.0f, 0.542f)
                curveToRelative(0.593f, 0.0f, 1.073f, -0.481f, 1.073f, -1.073f)
                curveToRelative(0.0f, -0.593f, -0.48f, -1.073f, -1.073f, -1.073f)
                curveToRelative(-0.592f, 0.0f, -1.073f, 0.48f, -1.073f, 1.073f)
                curveToRelative(0.0f, 0.592f, 0.481f, 1.073f, 1.073f, 1.073f)
                close()
            }
        }
        .build()
        return _icLock!!
    }

private var _icLock: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcLock, contentDescription = "")
    }
}
