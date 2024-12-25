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
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmailSelected
import kotlin.Unit

public val Icons.IcEmailSelected: ImageVector
    get() {
        if (_icEmailSelected != null) {
            return _icEmailSelected!!
        }
        _icEmailSelected = Builder(name = "IcEmailSelected", defaultWidth = 20.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 20.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFFD3CFEB)), stroke = SolidColor(Color(0xFF455AF7)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.665f, 15.08f)
                horizontalLineTo(3.335f)
                curveTo(2.051f, 15.08f, 1.0f, 14.004f, 1.0f, 12.666f)
                verticalLineTo(3.414f)
                curveTo(1.0f, 2.086f, 2.041f, 1.0f, 3.335f, 1.0f)
                horizontalLineToRelative(13.33f)
                curveTo(17.949f, 1.0f, 19.0f, 2.076f, 19.0f, 3.414f)
                verticalLineToRelative(9.252f)
                curveToRelative(0.0f, 1.338f, -1.041f, 2.414f, -2.335f, 2.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD3CFEB)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.998f, 1.774f)
                lineToRelative(-6.684f, 6.859f)
                curveToRelative(-0.75f, 0.774f, -1.878f, 0.774f, -2.637f, 0.0f)
                lineTo(1.992f, 1.774f)
            }
            path(fill = null, stroke = SolidColor(Color(0xFF455AF7)), strokeLineWidth = 1.5f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.998f, 1.774f)
                lineToRelative(-6.684f, 6.859f)
                curveToRelative(-0.75f, 0.774f, -1.878f, 0.774f, -2.637f, 0.0f)
                lineTo(1.992f, 1.774f)
                moveToRelative(10.081f, 6.185f)
                lineToRelative(5.925f, 5.944f)
                moveToRelative(-15.996f, 0.0f)
                lineTo(7.996f, 8.04f)
            }
        }
        .build()
        return _icEmailSelected!!
    }

private var _icEmailSelected: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcEmailSelected, contentDescription = "")
    }
}
