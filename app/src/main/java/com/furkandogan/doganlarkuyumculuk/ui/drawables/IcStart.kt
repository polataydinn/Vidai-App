package com.furkandogan.doganlarkuyumculuk.ui.drawables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

public val Icons.IcStart: ImageVector
    get() {
        if (_icStart != null) {
            return _icStart!!
        }
        _icStart = Builder(
            name = "IcStart",
            defaultWidth = 98.0.dp,
            defaultHeight = 98.0.dp,
            viewportWidth = 98.0f,
            viewportHeight = 98.0f
        ).apply {
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF45D8FF), 0.645f to Color(0xFF005BEA),
                    1.0f to Color(0xFF0071EA), start = Offset(94.0f, 94.0f), end =
                    Offset(-4.774f, 66.714f)
                ), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(49.0f, 4.0f)
                lineTo(49.0f, 4.0f)
                arcTo(45.0f, 45.0f, 0.0f, false, true, 94.0f, 49.0f)
                lineTo(94.0f, 49.0f)
                arcTo(45.0f, 45.0f, 0.0f, false, true, 49.0f, 94.0f)
                lineTo(49.0f, 94.0f)
                arcTo(45.0f, 45.0f, 0.0f, false, true, 4.0f, 49.0f)
                lineTo(4.0f, 49.0f)
                arcTo(45.0f, 45.0f, 0.0f, false, true, 49.0f, 4.0f)
                close()
            }
            path(
                fill = radialGradient(
                    0.0f to Color(0xFFF0F989), 0.148f to Color(0xFFF36FFF),
                    0.251f to Color(0xFF268AFF), 0.351f to Color(0xFF52EAEA), 0.497f to
                            Color(0xFFF0F989), center = Offset(49.0f, 49.0f), radius = 45.0f
                ), stroke =
                null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(49.0f, 4.0f)
                lineTo(49.0f, 4.0f)
                arcTo(45.0f, 45.0f, 0.0f, false, true, 94.0f, 49.0f)
                lineTo(94.0f, 49.0f)
                arcTo(45.0f, 45.0f, 0.0f, false, true, 49.0f, 94.0f)
                lineTo(49.0f, 94.0f)
                arcTo(45.0f, 45.0f, 0.0f, false, true, 4.0f, 49.0f)
                lineTo(4.0f, 49.0f)
                arcTo(45.0f, 45.0f, 0.0f, false, true, 49.0f, 4.0f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF45D8FF), 0.645f to Color(0xFF005BEA),
                    1.0f to Color(0xFF0071EA), start = Offset(91.0f, 91.0f), end =
                    Offset(-1.189f, 65.533f)
                ), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(49.0f, 7.0f)
                lineTo(49.0f, 7.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 91.0f, 49.0f)
                lineTo(91.0f, 49.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 49.0f, 91.0f)
                lineTo(49.0f, 91.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 7.0f, 49.0f)
                lineTo(7.0f, 49.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 49.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.004f, 55.0f)
                verticalLineTo(43.8f)
                horizontalLineTo(23.252f)
                curveTo(24.596f, 43.8f, 25.62f, 44.067f, 26.324f, 44.6f)
                curveTo(27.028f, 45.123f, 27.38f, 45.827f, 27.38f, 46.712f)
                curveTo(27.38f, 47.309f, 27.241f, 47.821f, 26.964f, 48.248f)
                curveTo(26.687f, 48.664f, 26.313f, 48.989f, 25.844f, 49.224f)
                curveTo(25.385f, 49.448f, 24.884f, 49.56f, 24.34f, 49.56f)
                lineTo(24.628f, 48.984f)
                curveTo(25.257f, 48.984f, 25.823f, 49.101f, 26.324f, 49.336f)
                curveTo(26.825f, 49.56f, 27.22f, 49.891f, 27.508f, 50.328f)
                curveTo(27.807f, 50.765f, 27.956f, 51.309f, 27.956f, 51.96f)
                curveTo(27.956f, 52.92f, 27.588f, 53.667f, 26.852f, 54.2f)
                curveTo(26.116f, 54.733f, 25.023f, 55.0f, 23.572f, 55.0f)
                horizontalLineTo(18.004f)
                close()
                moveTo(20.084f, 53.368f)
                horizontalLineTo(23.444f)
                curveTo(24.223f, 53.368f, 24.82f, 53.24f, 25.236f, 52.984f)
                curveTo(25.652f, 52.728f, 25.86f, 52.317f, 25.86f, 51.752f)
                curveTo(25.86f, 51.197f, 25.652f, 50.792f, 25.236f, 50.536f)
                curveTo(24.82f, 50.269f, 24.223f, 50.136f, 23.444f, 50.136f)
                horizontalLineTo(19.924f)
                verticalLineTo(48.52f)
                horizontalLineTo(23.028f)
                curveTo(23.753f, 48.52f, 24.308f, 48.392f, 24.692f, 48.136f)
                curveTo(25.087f, 47.88f, 25.284f, 47.496f, 25.284f, 46.984f)
                curveTo(25.284f, 46.461f, 25.087f, 46.072f, 24.692f, 45.816f)
                curveTo(24.308f, 45.56f, 23.753f, 45.432f, 23.028f, 45.432f)
                horizontalLineTo(20.084f)
                verticalLineTo(53.368f)
                close()
                moveTo(28.592f, 55.0f)
                lineTo(33.632f, 43.8f)
                horizontalLineTo(35.68f)
                lineTo(40.736f, 55.0f)
                horizontalLineTo(38.56f)
                lineTo(34.224f, 44.904f)
                horizontalLineTo(35.056f)
                lineTo(30.736f, 55.0f)
                horizontalLineTo(28.592f)
                close()
                moveTo(30.912f, 52.408f)
                lineTo(31.472f, 50.776f)
                horizontalLineTo(37.52f)
                lineTo(38.08f, 52.408f)
                horizontalLineTo(30.912f)
                close()
                moveTo(45.632f, 55.16f)
                curveTo(44.758f, 55.16f, 43.92f, 55.037f, 43.12f, 54.792f)
                curveTo(42.32f, 54.536f, 41.686f, 54.211f, 41.216f, 53.816f)
                lineTo(41.936f, 52.2f)
                curveTo(42.384f, 52.552f, 42.939f, 52.845f, 43.6f, 53.08f)
                curveTo(44.262f, 53.315f, 44.939f, 53.432f, 45.632f, 53.432f)
                curveTo(46.219f, 53.432f, 46.694f, 53.368f, 47.056f, 53.24f)
                curveTo(47.419f, 53.112f, 47.686f, 52.941f, 47.856f, 52.728f)
                curveTo(48.027f, 52.504f, 48.112f, 52.253f, 48.112f, 51.976f)
                curveTo(48.112f, 51.635f, 47.99f, 51.363f, 47.744f, 51.16f)
                curveTo(47.499f, 50.947f, 47.179f, 50.781f, 46.784f, 50.664f)
                curveTo(46.4f, 50.536f, 45.968f, 50.419f, 45.488f, 50.312f)
                curveTo(45.019f, 50.205f, 44.544f, 50.083f, 44.064f, 49.944f)
                curveTo(43.595f, 49.795f, 43.163f, 49.608f, 42.768f, 49.384f)
                curveTo(42.384f, 49.149f, 42.07f, 48.84f, 41.824f, 48.456f)
                curveTo(41.579f, 48.072f, 41.456f, 47.581f, 41.456f, 46.984f)
                curveTo(41.456f, 46.376f, 41.616f, 45.821f, 41.936f, 45.32f)
                curveTo(42.267f, 44.808f, 42.763f, 44.403f, 43.424f, 44.104f)
                curveTo(44.096f, 43.795f, 44.944f, 43.64f, 45.968f, 43.64f)
                curveTo(46.64f, 43.64f, 47.307f, 43.725f, 47.968f, 43.896f)
                curveTo(48.63f, 44.067f, 49.206f, 44.312f, 49.696f, 44.632f)
                lineTo(49.04f, 46.248f)
                curveTo(48.539f, 45.949f, 48.022f, 45.731f, 47.488f, 45.592f)
                curveTo(46.955f, 45.443f, 46.443f, 45.368f, 45.952f, 45.368f)
                curveTo(45.376f, 45.368f, 44.907f, 45.437f, 44.544f, 45.576f)
                curveTo(44.192f, 45.715f, 43.931f, 45.896f, 43.76f, 46.12f)
                curveTo(43.6f, 46.344f, 43.52f, 46.6f, 43.52f, 46.888f)
                curveTo(43.52f, 47.229f, 43.638f, 47.507f, 43.872f, 47.72f)
                curveTo(44.118f, 47.923f, 44.432f, 48.083f, 44.816f, 48.2f)
                curveTo(45.211f, 48.317f, 45.648f, 48.435f, 46.128f, 48.552f)
                curveTo(46.608f, 48.659f, 47.083f, 48.781f, 47.552f, 48.92f)
                curveTo(48.032f, 49.059f, 48.464f, 49.24f, 48.848f, 49.464f)
                curveTo(49.243f, 49.688f, 49.558f, 49.992f, 49.792f, 50.376f)
                curveTo(50.038f, 50.76f, 50.16f, 51.245f, 50.16f, 51.832f)
                curveTo(50.16f, 52.429f, 49.995f, 52.984f, 49.664f, 53.496f)
                curveTo(49.344f, 53.997f, 48.848f, 54.403f, 48.176f, 54.712f)
                curveTo(47.504f, 55.011f, 46.656f, 55.16f, 45.632f, 55.16f)
                close()
                moveTo(45.376f, 58.648f)
                curveTo(45.088f, 58.648f, 44.822f, 58.616f, 44.576f, 58.552f)
                curveTo(44.331f, 58.499f, 44.107f, 58.419f, 43.904f, 58.312f)
                lineTo(44.272f, 57.368f)
                curveTo(44.443f, 57.453f, 44.614f, 57.517f, 44.784f, 57.56f)
                curveTo(44.966f, 57.603f, 45.158f, 57.624f, 45.36f, 57.624f)
                curveTo(45.67f, 57.624f, 45.888f, 57.571f, 46.016f, 57.464f)
                curveTo(46.144f, 57.357f, 46.208f, 57.219f, 46.208f, 57.048f)
                curveTo(46.208f, 56.888f, 46.139f, 56.76f, 46.0f, 56.664f)
                curveTo(45.872f, 56.568f, 45.659f, 56.52f, 45.36f, 56.52f)
                horizontalLineTo(44.864f)
                lineTo(45.296f, 54.888f)
                horizontalLineTo(46.384f)
                lineTo(46.16f, 55.784f)
                curveTo(46.63f, 55.837f, 46.976f, 55.987f, 47.2f, 56.232f)
                curveTo(47.435f, 56.488f, 47.552f, 56.787f, 47.552f, 57.128f)
                curveTo(47.552f, 57.597f, 47.355f, 57.965f, 46.96f, 58.232f)
                curveTo(46.566f, 58.509f, 46.038f, 58.648f, 45.376f, 58.648f)
                close()
                moveTo(52.223f, 55.0f)
                verticalLineTo(43.8f)
                horizontalLineTo(54.303f)
                verticalLineTo(53.24f)
                horizontalLineTo(60.159f)
                verticalLineTo(55.0f)
                horizontalLineTo(52.223f)
                close()
                moveTo(60.232f, 55.0f)
                lineTo(65.272f, 43.8f)
                horizontalLineTo(67.321f)
                lineTo(72.377f, 55.0f)
                horizontalLineTo(70.201f)
                lineTo(65.865f, 44.904f)
                horizontalLineTo(66.697f)
                lineTo(62.376f, 55.0f)
                horizontalLineTo(60.232f)
                close()
                moveTo(62.553f, 52.408f)
                lineTo(63.112f, 50.776f)
                horizontalLineTo(69.16f)
                lineTo(69.72f, 52.408f)
                horizontalLineTo(62.553f)
                close()
                moveTo(75.51f, 55.0f)
                verticalLineTo(45.56f)
                horizontalLineTo(71.798f)
                verticalLineTo(43.8f)
                horizontalLineTo(81.302f)
                verticalLineTo(45.56f)
                horizontalLineTo(77.59f)
                verticalLineTo(55.0f)
                horizontalLineTo(75.51f)
                close()
            }
        }
            .build()
        return _icStart!!
    }

private var _icStart: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcStart, contentDescription = null)
    }
}
