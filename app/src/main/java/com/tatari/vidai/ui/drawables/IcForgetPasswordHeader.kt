package com.tatari.vidai.ui.drawables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val Icons.IcForgetPasswordHeader: ImageVector
    get() {
        if (_icForgetPasswordHeader != null) {
            return _icForgetPasswordHeader!!
        }
        _icForgetPasswordHeader = Builder(
            name = "IcForgetPasswordHeader",
            defaultWidth = 335.0.dp,
            defaultHeight = 132.0.dp,
            viewportWidth = 335.0f,
            viewportHeight = 132.0f
        ).apply {
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(261.52f, 36.5f), end = Offset(367.46f, 167.49f)
                ), stroke =
                null, fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(372.07f, 64.04f)
                curveTo(371.0f, 64.04f, 370.13f, 64.91f, 370.13f, 65.97f)
                verticalLineTo(95.8f)
                horizontalLineTo(271.84f)
                curveTo(270.77f, 95.8f, 269.9f, 96.66f, 269.9f, 97.73f)
                curveTo(269.9f, 98.8f, 270.77f, 99.66f, 271.84f, 99.66f)
                horizontalLineTo(370.13f)
                verticalLineTo(105.46f)
                curveTo(370.13f, 106.38f, 369.38f, 107.14f, 368.45f, 107.14f)
                horizontalLineTo(247.55f)
                curveTo(246.62f, 107.14f, 245.87f, 106.38f, 245.87f, 105.46f)
                verticalLineTo(99.66f)
                horizontalLineTo(262.9f)
                curveTo(263.97f, 99.66f, 264.84f, 98.8f, 264.84f, 97.73f)
                curveTo(264.84f, 96.66f, 263.97f, 95.8f, 262.9f, 95.8f)
                horizontalLineTo(245.87f)
                verticalLineTo(25.12f)
                curveTo(245.87f, 24.19f, 246.62f, 23.44f, 247.55f, 23.44f)
                horizontalLineTo(252.8f)
                curveTo(253.87f, 23.44f, 254.73f, 22.57f, 254.73f, 21.51f)
                curveTo(254.73f, 20.44f, 253.87f, 19.57f, 252.8f, 19.57f)
                horizontalLineTo(247.55f)
                curveTo(244.49f, 19.57f, 242.0f, 22.06f, 242.0f, 25.12f)
                verticalLineTo(105.46f)
                curveTo(242.0f, 108.51f, 244.49f, 111.0f, 247.55f, 111.0f)
                horizontalLineTo(258.64f)
                verticalLineTo(120.74f)
                curveTo(256.39f, 121.54f, 254.77f, 123.69f, 254.77f, 126.2f)
                curveTo(254.77f, 129.4f, 257.37f, 131.99f, 260.57f, 131.99f)
                curveTo(263.77f, 131.99f, 266.37f, 129.4f, 266.37f, 126.2f)
                curveTo(266.37f, 123.69f, 264.76f, 121.54f, 262.5f, 120.74f)
                verticalLineTo(111.0f)
                horizontalLineTo(295.4f)
                lineTo(292.41f, 120.41f)
                horizontalLineTo(287.37f)
                curveTo(284.17f, 120.41f, 281.57f, 123.01f, 281.57f, 126.2f)
                curveTo(281.57f, 129.4f, 284.17f, 132.0f, 287.37f, 132.0f)
                horizontalLineTo(312.08f)
                curveTo(313.15f, 132.0f, 314.02f, 131.13f, 314.02f, 130.07f)
                curveTo(314.02f, 129.0f, 313.15f, 128.13f, 312.08f, 128.13f)
                horizontalLineTo(287.37f)
                curveTo(286.31f, 128.13f, 285.44f, 127.27f, 285.44f, 126.2f)
                curveTo(285.44f, 125.14f, 286.31f, 124.27f, 287.37f, 124.27f)
                horizontalLineTo(328.63f)
                curveTo(329.69f, 124.27f, 330.56f, 125.14f, 330.56f, 126.2f)
                curveTo(330.56f, 127.27f, 329.69f, 128.13f, 328.63f, 128.13f)
                horizontalLineTo(321.16f)
                curveTo(320.1f, 128.13f, 319.23f, 129.0f, 319.23f, 130.07f)
                curveTo(319.23f, 131.13f, 320.1f, 132.0f, 321.16f, 132.0f)
                horizontalLineTo(328.63f)
                curveTo(331.83f, 132.0f, 334.43f, 129.4f, 334.43f, 126.2f)
                curveTo(334.43f, 123.01f, 331.83f, 120.41f, 328.63f, 120.41f)
                horizontalLineTo(323.59f)
                lineTo(320.61f, 111.0f)
                horizontalLineTo(353.5f)
                verticalLineTo(120.74f)
                curveTo(351.24f, 121.54f, 349.63f, 123.69f, 349.63f, 126.2f)
                curveTo(349.63f, 129.4f, 352.23f, 131.99f, 355.43f, 131.99f)
                curveTo(358.63f, 131.99f, 361.23f, 129.4f, 361.23f, 126.2f)
                curveTo(361.23f, 123.69f, 359.61f, 121.54f, 357.36f, 120.74f)
                verticalLineTo(111.0f)
                horizontalLineTo(368.45f)
                curveTo(371.51f, 111.0f, 374.0f, 108.51f, 374.0f, 105.46f)
                verticalLineTo(65.97f)
                curveTo(374.0f, 64.91f, 373.14f, 64.04f, 372.07f, 64.04f)
                close()
                moveTo(260.57f, 128.13f)
                curveTo(259.5f, 128.13f, 258.64f, 127.26f, 258.64f, 126.2f)
                curveTo(258.64f, 125.14f, 259.5f, 124.28f, 260.57f, 124.28f)
                curveTo(261.64f, 124.28f, 262.5f, 125.14f, 262.5f, 126.2f)
                curveTo(262.5f, 127.26f, 261.64f, 128.13f, 260.57f, 128.13f)
                close()
                moveTo(355.43f, 128.13f)
                curveTo(354.36f, 128.13f, 353.5f, 127.26f, 353.5f, 126.2f)
                curveTo(353.5f, 125.14f, 354.36f, 124.28f, 355.43f, 124.28f)
                curveTo(356.5f, 124.28f, 357.36f, 125.14f, 357.36f, 126.2f)
                curveTo(357.36f, 127.26f, 356.5f, 128.13f, 355.43f, 128.13f)
                close()
                moveTo(319.54f, 120.41f)
                horizontalLineTo(296.46f)
                lineTo(299.45f, 111.0f)
                horizontalLineTo(316.55f)
                lineTo(319.54f, 120.41f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(319.04f, 3.64f), end = Offset(339.16f, 36.08f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(315.7f, 23.44f)
                horizontalLineTo(347.5f)
                curveTo(348.57f, 23.44f, 349.43f, 22.57f, 349.43f, 21.51f)
                curveTo(349.43f, 20.44f, 348.57f, 19.57f, 347.5f, 19.57f)
                horizontalLineTo(333.53f)
                verticalLineTo(11.38f)
                curveTo(335.78f, 10.59f, 337.4f, 8.44f, 337.4f, 5.92f)
                curveTo(337.4f, 2.73f, 334.8f, 0.13f, 331.6f, 0.13f)
                curveTo(328.4f, 0.13f, 325.8f, 2.73f, 325.8f, 5.92f)
                curveTo(325.8f, 8.44f, 327.41f, 10.59f, 329.66f, 11.38f)
                verticalLineTo(19.57f)
                horizontalLineTo(315.7f)
                curveTo(314.63f, 19.57f, 313.76f, 20.44f, 313.76f, 21.51f)
                curveTo(313.76f, 22.57f, 314.63f, 23.44f, 315.7f, 23.44f)
                close()
                moveTo(331.6f, 4.0f)
                curveTo(332.66f, 4.0f, 333.53f, 4.86f, 333.53f, 5.92f)
                curveTo(333.53f, 6.98f, 332.66f, 7.85f, 331.6f, 7.85f)
                curveTo(330.53f, 7.85f, 329.66f, 6.98f, 329.66f, 5.92f)
                curveTo(329.66f, 4.86f, 330.53f, 4.0f, 331.6f, 4.0f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(271.63f, 3.64f), end = Offset(291.69f, 36.21f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(268.26f, 23.44f)
                horizontalLineTo(300.32f)
                curveTo(301.39f, 23.44f, 302.26f, 22.57f, 302.26f, 21.51f)
                curveTo(302.26f, 20.44f, 301.39f, 19.57f, 300.32f, 19.57f)
                horizontalLineTo(286.22f)
                verticalLineTo(11.38f)
                curveTo(288.47f, 10.59f, 290.09f, 8.44f, 290.09f, 5.92f)
                curveTo(290.09f, 2.73f, 287.49f, 0.13f, 284.29f, 0.13f)
                curveTo(281.09f, 0.13f, 278.49f, 2.73f, 278.49f, 5.92f)
                curveTo(278.49f, 8.44f, 280.11f, 10.59f, 282.36f, 11.38f)
                verticalLineTo(19.57f)
                horizontalLineTo(268.26f)
                curveTo(267.19f, 19.57f, 266.32f, 20.44f, 266.32f, 21.51f)
                curveTo(266.32f, 22.57f, 267.19f, 23.44f, 268.26f, 23.44f)
                close()
                moveTo(284.29f, 4.0f)
                curveTo(285.36f, 4.0f, 286.22f, 4.86f, 286.22f, 5.92f)
                curveTo(286.22f, 6.98f, 285.36f, 7.85f, 284.29f, 7.85f)
                curveTo(283.22f, 7.85f, 282.36f, 6.98f, 282.36f, 5.92f)
                curveTo(282.36f, 4.86f, 283.22f, 4.0f, 284.29f, 4.0f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(303.92f, 5.83f), end = Offset(325.24f, 12.71f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(302.2f, 32.16f)
                curveTo(302.2f, 35.36f, 304.8f, 37.96f, 308.0f, 37.96f)
                curveTo(311.2f, 37.96f, 313.8f, 35.36f, 313.8f, 32.16f)
                curveTo(313.8f, 29.65f, 312.18f, 27.5f, 309.93f, 26.7f)
                verticalLineTo(2.07f)
                curveTo(309.93f, 1.0f, 309.07f, 0.13f, 308.0f, 0.13f)
                curveTo(306.93f, 0.13f, 306.07f, 1.0f, 306.07f, 2.07f)
                verticalLineTo(26.7f)
                curveTo(303.82f, 27.5f, 302.2f, 29.65f, 302.2f, 32.16f)
                close()
                moveTo(308.0f, 30.24f)
                curveTo(309.07f, 30.24f, 309.93f, 31.1f, 309.93f, 32.16f)
                curveTo(309.93f, 33.23f, 309.07f, 34.09f, 308.0f, 34.09f)
                curveTo(306.93f, 34.09f, 306.07f, 33.22f, 306.07f, 32.16f)
                curveTo(306.07f, 31.1f, 306.93f, 30.24f, 308.0f, 30.24f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(255.71f, 5.85f), end = Offset(278.37f, 13.71f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(258.64f, 8.45f)
                verticalLineTo(26.84f)
                curveTo(256.39f, 27.63f, 254.77f, 29.78f, 254.77f, 32.3f)
                curveTo(254.77f, 35.49f, 257.37f, 38.09f, 260.57f, 38.09f)
                curveTo(263.77f, 38.09f, 266.37f, 35.49f, 266.37f, 32.3f)
                curveTo(266.37f, 29.78f, 264.76f, 27.63f, 262.5f, 26.84f)
                verticalLineTo(7.75f)
                curveTo(262.5f, 7.3f, 262.34f, 6.85f, 262.05f, 6.51f)
                lineTo(257.27f, 0.82f)
                curveTo(256.59f, 0.0f, 255.37f, -0.1f, 254.55f, 0.58f)
                curveTo(253.73f, 1.27f, 253.63f, 2.49f, 254.31f, 3.31f)
                lineTo(258.64f, 8.45f)
                close()
                moveTo(260.57f, 34.22f)
                curveTo(259.5f, 34.22f, 258.64f, 33.36f, 258.64f, 32.3f)
                curveTo(258.64f, 31.23f, 259.5f, 30.37f, 260.57f, 30.37f)
                curveTo(261.64f, 30.37f, 262.5f, 31.23f, 262.5f, 32.3f)
                curveTo(262.5f, 33.36f, 261.64f, 34.22f, 260.57f, 34.22f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(255.84f, 45.32f), end = Offset(265.59f, 52.31f)
                ), stroke =
                null, fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(261.48f, 44.28f)
                curveTo(260.72f, 43.53f, 259.5f, 43.53f, 258.74f, 44.28f)
                lineTo(255.34f, 47.69f)
                curveTo(254.97f, 48.05f, 254.77f, 48.54f, 254.77f, 49.05f)
                curveTo(254.77f, 49.57f, 254.97f, 50.06f, 255.34f, 50.42f)
                lineTo(258.74f, 53.83f)
                curveTo(259.12f, 54.2f, 259.61f, 54.39f, 260.11f, 54.39f)
                curveTo(260.6f, 54.39f, 261.1f, 54.2f, 261.48f, 53.83f)
                curveTo(262.23f, 53.07f, 262.23f, 51.85f, 261.48f, 51.09f)
                lineTo(259.44f, 49.05f)
                lineTo(261.48f, 47.02f)
                curveTo(262.23f, 46.26f, 262.23f, 45.04f, 261.48f, 44.28f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(277.24f, 45.32f), end = Offset(286.99f, 52.31f)
                ), stroke =
                null, fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(276.73f, 53.83f)
                curveTo(277.11f, 54.2f, 277.61f, 54.39f, 278.1f, 54.39f)
                curveTo(278.6f, 54.39f, 279.09f, 54.2f, 279.47f, 53.83f)
                lineTo(282.87f, 50.42f)
                curveTo(283.24f, 50.06f, 283.44f, 49.57f, 283.44f, 49.05f)
                curveTo(283.44f, 48.54f, 283.24f, 48.05f, 282.88f, 47.69f)
                lineTo(279.47f, 44.28f)
                curveTo(278.71f, 43.53f, 277.49f, 43.53f, 276.73f, 44.28f)
                curveTo(275.98f, 45.04f, 275.98f, 46.26f, 276.73f, 47.02f)
                lineTo(278.77f, 49.05f)
                lineTo(276.73f, 51.09f)
                curveTo(275.98f, 51.85f, 275.98f, 53.07f, 276.73f, 53.83f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(266.86f, 45.32f), end = Offset(276.18f, 51.25f)
                ), stroke =
                null, fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(267.84f, 54.39f)
                curveTo(268.62f, 54.39f, 269.36f, 53.92f, 269.65f, 53.14f)
                lineTo(272.23f, 46.33f)
                curveTo(272.61f, 45.33f, 272.11f, 44.22f, 271.11f, 43.84f)
                curveTo(270.11f, 43.46f, 268.99f, 43.97f, 268.61f, 44.96f)
                lineTo(266.04f, 51.77f)
                curveTo(265.66f, 52.77f, 266.16f, 53.89f, 267.16f, 54.27f)
                curveTo(267.38f, 54.35f, 267.61f, 54.39f, 267.84f, 54.39f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(334.14f, 60.9f), end = Offset(334.99f, 68.25f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(359.3f, 60.31f)
                horizontalLineTo(331.37f)
                curveTo(330.3f, 60.31f, 329.43f, 61.18f, 329.43f, 62.25f)
                curveTo(329.43f, 63.31f, 330.3f, 64.18f, 331.37f, 64.18f)
                horizontalLineTo(359.3f)
                curveTo(360.36f, 64.18f, 361.23f, 63.31f, 361.23f, 62.25f)
                curveTo(361.23f, 61.18f, 360.36f, 60.31f, 359.3f, 60.31f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(283.2f, 60.9f), end = Offset(283.76f, 68.31f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(278.0f, 64.18f)
                horizontalLineTo(322.38f)
                curveTo(323.45f, 64.18f, 324.31f, 63.31f, 324.31f, 62.25f)
                curveTo(324.31f, 61.18f, 323.45f, 60.31f, 322.38f, 60.31f)
                horizontalLineTo(278.0f)
                curveTo(276.93f, 60.31f, 276.07f, 61.18f, 276.07f, 62.25f)
                curveTo(276.07f, 63.31f, 276.93f, 64.18f, 278.0f, 64.18f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(256.4f, 60.9f), end = Offset(257.93f, 68.02f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(253.86f, 62.25f)
                curveTo(253.86f, 63.31f, 254.73f, 64.18f, 255.79f, 64.18f)
                horizontalLineTo(269.13f)
                curveTo(270.2f, 64.18f, 271.07f, 63.31f, 271.07f, 62.25f)
                curveTo(271.07f, 61.18f, 270.2f, 60.31f, 269.13f, 60.31f)
                horizontalLineTo(255.79f)
                curveTo(254.73f, 60.31f, 253.86f, 61.18f, 253.86f, 62.25f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(301.0f, 72.5f), end = Offset(301.39f, 79.93f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(361.23f, 73.85f)
                curveTo(361.23f, 72.78f, 360.36f, 71.91f, 359.3f, 71.91f)
                horizontalLineTo(292.48f)
                curveTo(291.42f, 71.91f, 290.55f, 72.78f, 290.55f, 73.85f)
                curveTo(290.55f, 74.92f, 291.42f, 75.78f, 292.48f, 75.78f)
                horizontalLineTo(359.3f)
                curveTo(360.36f, 75.78f, 361.23f, 74.92f, 361.23f, 73.85f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(258.53f, 72.5f), end = Offset(259.38f, 79.85f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(255.79f, 75.78f)
                horizontalLineTo(283.51f)
                curveTo(284.58f, 75.78f, 285.44f, 74.92f, 285.44f, 73.85f)
                curveTo(285.44f, 72.78f, 284.58f, 71.91f, 283.51f, 71.91f)
                horizontalLineTo(255.79f)
                curveTo(254.73f, 71.91f, 253.86f, 72.78f, 253.86f, 73.85f)
                curveTo(253.86f, 74.92f, 254.73f, 75.78f, 255.79f, 75.78f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(308.26f, 84.1f), end = Offset(310.1f, 91.07f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(308.14f, 83.52f)
                curveTo(307.07f, 83.52f, 306.2f, 84.38f, 306.2f, 85.45f)
                curveTo(306.2f, 86.52f, 307.07f, 87.38f, 308.14f, 87.38f)
                horizontalLineTo(318.18f)
                curveTo(319.25f, 87.38f, 320.12f, 86.52f, 320.12f, 85.45f)
                curveTo(320.12f, 84.38f, 319.25f, 83.52f, 318.18f, 83.52f)
                horizontalLineTo(308.14f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF007AFF), 1.0f to Color(0xFF7852CF),
                    start = Offset(260.85f, 84.1f), end = Offset(261.43f, 91.51f)
                ), stroke = null,
                fillAlpha = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap
                = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero
            ) {
                moveTo(255.79f, 87.38f)
                horizontalLineTo(299.21f)
                curveTo(300.28f, 87.38f, 301.14f, 86.52f, 301.14f, 85.45f)
                curveTo(301.14f, 84.38f, 300.28f, 83.52f, 299.21f, 83.52f)
                horizontalLineTo(255.79f)
                curveTo(254.73f, 83.52f, 253.86f, 84.38f, 253.86f, 85.45f)
                curveTo(253.86f, 86.52f, 254.73f, 87.38f, 255.79f, 87.38f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.17f, 38.2f)
                curveTo(13.58f, 38.2f, 16.32f, 40.46f, 16.32f, 44.18f)
                curveTo(16.32f, 47.87f, 13.58f, 50.15f, 9.17f, 50.15f)
                horizontalLineTo(5.38f)
                verticalLineTo(55.0f)
                horizontalLineTo(2.26f)
                verticalLineTo(38.2f)
                horizontalLineTo(9.17f)
                close()
                moveTo(9.02f, 47.51f)
                curveTo(11.76f, 47.51f, 13.18f, 46.29f, 13.18f, 44.18f)
                curveTo(13.18f, 42.06f, 11.76f, 40.84f, 9.02f, 40.84f)
                horizontalLineTo(5.38f)
                verticalLineTo(47.51f)
                horizontalLineTo(9.02f)
                close()
                moveTo(23.93f, 42.04f)
                curveTo(27.62f, 42.04f, 29.76f, 43.79f, 29.76f, 47.49f)
                verticalLineTo(55.0f)
                horizontalLineTo(26.93f)
                verticalLineTo(53.44f)
                curveTo(26.21f, 54.54f, 24.81f, 55.17f, 22.89f, 55.17f)
                curveTo(19.97f, 55.17f, 18.12f, 53.56f, 18.12f, 51.33f)
                curveTo(18.12f, 49.19f, 19.56f, 47.51f, 23.45f, 47.51f)
                horizontalLineTo(26.76f)
                verticalLineTo(47.32f)
                curveTo(26.76f, 45.57f, 25.7f, 44.54f, 23.57f, 44.54f)
                curveTo(22.13f, 44.54f, 20.64f, 45.02f, 19.68f, 45.81f)
                lineTo(18.5f, 43.62f)
                curveTo(19.87f, 42.57f, 21.86f, 42.04f, 23.93f, 42.04f)
                close()
                moveTo(23.52f, 52.98f)
                curveTo(24.98f, 52.98f, 26.25f, 52.31f, 26.76f, 50.99f)
                verticalLineTo(49.5f)
                horizontalLineTo(23.66f)
                curveTo(21.62f, 49.5f, 21.07f, 50.27f, 21.07f, 51.21f)
                curveTo(21.07f, 52.29f, 21.98f, 52.98f, 23.52f, 52.98f)
                close()
                moveTo(36.46f, 44.06f)
                curveTo(37.33f, 42.71f, 38.89f, 42.04f, 41.02f, 42.04f)
                verticalLineTo(44.9f)
                curveTo(40.76f, 44.85f, 40.54f, 44.82f, 40.33f, 44.82f)
                curveTo(38.05f, 44.82f, 36.61f, 46.17f, 36.61f, 48.78f)
                verticalLineTo(55.0f)
                horizontalLineTo(33.61f)
                verticalLineTo(42.18f)
                horizontalLineTo(36.46f)
                verticalLineTo(44.06f)
                close()
                moveTo(49.21f, 55.17f)
                curveTo(45.28f, 55.17f, 42.4f, 52.43f, 42.4f, 48.59f)
                curveTo(42.4f, 44.75f, 45.28f, 42.04f, 49.21f, 42.04f)
                curveTo(53.2f, 42.04f, 56.05f, 44.75f, 56.05f, 48.59f)
                curveTo(56.05f, 52.43f, 53.2f, 55.17f, 49.21f, 55.17f)
                close()
                moveTo(49.21f, 52.6f)
                curveTo(51.4f, 52.6f, 53.03f, 51.04f, 53.03f, 48.59f)
                curveTo(53.03f, 46.14f, 51.4f, 44.58f, 49.21f, 44.58f)
                curveTo(47.05f, 44.58f, 45.42f, 46.14f, 45.42f, 48.59f)
                curveTo(45.42f, 51.04f, 47.05f, 52.6f, 49.21f, 52.6f)
                close()
                moveTo(58.92f, 55.0f)
                verticalLineTo(37.19f)
                horizontalLineTo(61.92f)
                verticalLineTo(55.0f)
                horizontalLineTo(58.92f)
                close()
                moveTo(70.75f, 42.04f)
                curveTo(74.45f, 42.04f, 76.59f, 43.79f, 76.59f, 47.49f)
                verticalLineTo(55.0f)
                horizontalLineTo(73.75f)
                verticalLineTo(53.44f)
                curveTo(73.03f, 54.54f, 71.64f, 55.17f, 69.72f, 55.17f)
                curveTo(66.79f, 55.17f, 64.95f, 53.56f, 64.95f, 51.33f)
                curveTo(64.95f, 49.19f, 66.39f, 47.51f, 70.27f, 47.51f)
                horizontalLineTo(73.59f)
                verticalLineTo(47.32f)
                curveTo(73.59f, 45.57f, 72.53f, 44.54f, 70.39f, 44.54f)
                curveTo(68.95f, 44.54f, 67.47f, 45.02f, 66.51f, 45.81f)
                lineTo(65.33f, 43.62f)
                curveTo(66.7f, 42.57f, 68.69f, 42.04f, 70.75f, 42.04f)
                close()
                moveTo(70.35f, 52.98f)
                curveTo(71.81f, 52.98f, 73.08f, 52.31f, 73.59f, 50.99f)
                verticalLineTo(49.5f)
                horizontalLineTo(70.49f)
                curveTo(68.45f, 49.5f, 67.9f, 50.27f, 67.9f, 51.21f)
                curveTo(67.9f, 52.29f, 68.81f, 52.98f, 70.35f, 52.98f)
                close()
                moveTo(87.71f, 42.04f)
                curveTo(90.78f, 42.04f, 93.06f, 43.79f, 93.06f, 47.66f)
                verticalLineTo(55.0f)
                horizontalLineTo(90.06f)
                verticalLineTo(48.04f)
                curveTo(90.06f, 45.76f, 88.93f, 44.66f, 87.01f, 44.66f)
                curveTo(84.88f, 44.66f, 83.44f, 45.95f, 83.44f, 48.52f)
                verticalLineTo(55.0f)
                horizontalLineTo(80.44f)
                verticalLineTo(42.18f)
                horizontalLineTo(83.29f)
                verticalLineTo(43.84f)
                curveTo(84.28f, 42.66f, 85.84f, 42.04f, 87.71f, 42.04f)
                close()
                moveTo(96.87f, 55.0f)
                verticalLineTo(42.18f)
                horizontalLineTo(99.87f)
                verticalLineTo(55.0f)
                horizontalLineTo(96.87f)
                close()
                moveTo(106.56f, 52.6f)
                horizontalLineTo(113.81f)
                verticalLineTo(55.0f)
                horizontalLineTo(102.75f)
                verticalLineTo(53.1f)
                lineTo(109.78f, 44.58f)
                horizontalLineTo(102.89f)
                verticalLineTo(42.18f)
                horizontalLineTo(113.62f)
                verticalLineTo(44.08f)
                lineTo(106.56f, 52.6f)
                close()
                moveTo(139.39f, 42.04f)
                curveTo(142.48f, 42.04f, 144.64f, 43.79f, 144.64f, 47.66f)
                verticalLineTo(55.0f)
                horizontalLineTo(141.64f)
                verticalLineTo(48.04f)
                curveTo(141.64f, 45.76f, 140.59f, 44.66f, 138.76f, 44.66f)
                curveTo(136.79f, 44.66f, 135.43f, 45.95f, 135.43f, 48.5f)
                verticalLineTo(55.0f)
                horizontalLineTo(132.43f)
                verticalLineTo(48.04f)
                curveTo(132.43f, 45.76f, 131.37f, 44.66f, 129.55f, 44.66f)
                curveTo(127.55f, 44.66f, 126.21f, 45.95f, 126.21f, 48.5f)
                verticalLineTo(55.0f)
                horizontalLineTo(123.21f)
                verticalLineTo(42.18f)
                horizontalLineTo(126.07f)
                verticalLineTo(43.82f)
                curveTo(127.03f, 42.66f, 128.51f, 42.04f, 130.27f, 42.04f)
                curveTo(132.14f, 42.04f, 133.7f, 42.74f, 134.59f, 44.18f)
                curveTo(135.62f, 42.86f, 137.35f, 42.04f, 139.39f, 42.04f)
                close()
                moveTo(148.48f, 55.0f)
                verticalLineTo(42.18f)
                horizontalLineTo(151.48f)
                verticalLineTo(55.0f)
                horizontalLineTo(148.48f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.64f, 92.32f)
                curveTo(6.5f, 92.32f, 2.82f, 88.77f, 2.82f, 82.24f)
                verticalLineTo(69.6f)
                horizontalLineTo(6.98f)
                verticalLineTo(82.08f)
                curveTo(6.98f, 86.69f, 9.06f, 88.67f, 12.67f, 88.67f)
                curveTo(16.29f, 88.67f, 18.34f, 86.69f, 18.34f, 82.08f)
                verticalLineTo(69.6f)
                horizontalLineTo(22.43f)
                verticalLineTo(82.24f)
                curveTo(22.43f, 88.77f, 18.75f, 92.32f, 12.64f, 92.32f)
                close()
                moveTo(37.57f, 74.72f)
                curveTo(41.67f, 74.72f, 44.71f, 77.06f, 44.71f, 82.21f)
                verticalLineTo(92.0f)
                horizontalLineTo(40.71f)
                verticalLineTo(82.72f)
                curveTo(40.71f, 79.68f, 39.2f, 78.21f, 36.64f, 78.21f)
                curveTo(33.79f, 78.21f, 31.87f, 79.94f, 31.87f, 83.36f)
                verticalLineTo(92.0f)
                horizontalLineTo(27.87f)
                verticalLineTo(74.91f)
                horizontalLineTo(31.68f)
                verticalLineTo(77.12f)
                curveTo(32.99f, 75.55f, 35.07f, 74.72f, 37.57f, 74.72f)
                close()
                moveTo(62.32f, 74.91f)
                horizontalLineTo(66.32f)
                verticalLineTo(92.0f)
                horizontalLineTo(62.52f)
                verticalLineTo(89.82f)
                curveTo(61.24f, 91.39f, 59.22f, 92.22f, 57.01f, 92.22f)
                curveTo(52.63f, 92.22f, 49.65f, 89.82f, 49.65f, 84.67f)
                verticalLineTo(74.91f)
                horizontalLineTo(53.65f)
                verticalLineTo(84.13f)
                curveTo(53.65f, 87.23f, 55.12f, 88.7f, 57.65f, 88.7f)
                curveTo(60.44f, 88.7f, 62.32f, 86.98f, 62.32f, 83.55f)
                verticalLineTo(74.91f)
                close()
                moveTo(80.71f, 88.22f)
                lineTo(81.83f, 91.07f)
                curveTo(80.87f, 91.84f, 79.43f, 92.22f, 77.99f, 92.22f)
                curveTo(74.25f, 92.22f, 72.11f, 90.24f, 72.11f, 86.46f)
                verticalLineTo(78.24f)
                horizontalLineTo(69.29f)
                verticalLineTo(75.04f)
                horizontalLineTo(72.11f)
                verticalLineTo(71.14f)
                horizontalLineTo(76.11f)
                verticalLineTo(75.04f)
                horizontalLineTo(80.68f)
                verticalLineTo(78.24f)
                horizontalLineTo(76.11f)
                verticalLineTo(86.37f)
                curveTo(76.11f, 88.03f, 76.94f, 88.93f, 78.47f, 88.93f)
                curveTo(79.31f, 88.93f, 80.11f, 88.7f, 80.71f, 88.22f)
                close()
                moveTo(93.87f, 88.22f)
                lineTo(94.99f, 91.07f)
                curveTo(94.03f, 91.84f, 92.59f, 92.22f, 91.15f, 92.22f)
                curveTo(87.41f, 92.22f, 85.26f, 90.24f, 85.26f, 86.46f)
                verticalLineTo(78.24f)
                horizontalLineTo(82.45f)
                verticalLineTo(75.04f)
                horizontalLineTo(85.26f)
                verticalLineTo(71.14f)
                horizontalLineTo(89.26f)
                verticalLineTo(75.04f)
                horizontalLineTo(93.84f)
                verticalLineTo(78.24f)
                horizontalLineTo(89.26f)
                verticalLineTo(86.37f)
                curveTo(89.26f, 88.03f, 90.09f, 88.93f, 91.63f, 88.93f)
                curveTo(92.46f, 88.93f, 93.26f, 88.7f, 93.87f, 88.22f)
                close()
                moveTo(110.82f, 74.91f)
                horizontalLineTo(114.82f)
                verticalLineTo(92.0f)
                horizontalLineTo(111.02f)
                verticalLineTo(89.82f)
                curveTo(109.74f, 91.39f, 107.72f, 92.22f, 105.51f, 92.22f)
                curveTo(101.13f, 92.22f, 98.15f, 89.82f, 98.15f, 84.67f)
                verticalLineTo(74.91f)
                horizontalLineTo(102.15f)
                verticalLineTo(84.13f)
                curveTo(102.15f, 87.23f, 103.62f, 88.7f, 106.15f, 88.7f)
                curveTo(108.94f, 88.7f, 110.82f, 86.98f, 110.82f, 83.55f)
                verticalLineTo(74.91f)
                close()
                moveTo(129.76f, 74.72f)
                curveTo(133.85f, 74.72f, 136.89f, 77.06f, 136.89f, 82.21f)
                verticalLineTo(92.0f)
                horizontalLineTo(132.89f)
                verticalLineTo(82.72f)
                curveTo(132.89f, 79.68f, 131.39f, 78.21f, 128.83f, 78.21f)
                curveTo(125.98f, 78.21f, 124.06f, 79.94f, 124.06f, 83.36f)
                verticalLineTo(92.0f)
                horizontalLineTo(120.06f)
                verticalLineTo(74.91f)
                horizontalLineTo(123.87f)
                verticalLineTo(77.12f)
                curveTo(125.18f, 75.55f, 127.26f, 74.72f, 129.76f, 74.72f)
                close()
                moveTo(154.51f, 74.91f)
                horizontalLineTo(158.51f)
                verticalLineTo(92.0f)
                horizontalLineTo(154.7f)
                verticalLineTo(89.82f)
                curveTo(153.42f, 91.39f, 151.41f, 92.22f, 149.2f, 92.22f)
                curveTo(144.82f, 92.22f, 141.84f, 89.82f, 141.84f, 84.67f)
                verticalLineTo(74.91f)
                horizontalLineTo(145.84f)
                verticalLineTo(84.13f)
                curveTo(145.84f, 87.23f, 147.31f, 88.7f, 149.84f, 88.7f)
                curveTo(152.62f, 88.7f, 154.51f, 86.98f, 154.51f, 83.55f)
                verticalLineTo(74.91f)
                close()
                moveTo(167.43f, 88.8f)
                horizontalLineTo(177.09f)
                verticalLineTo(92.0f)
                horizontalLineTo(162.34f)
                verticalLineTo(89.47f)
                lineTo(171.72f, 78.11f)
                horizontalLineTo(162.53f)
                verticalLineTo(74.91f)
                horizontalLineTo(176.84f)
                verticalLineTo(77.44f)
                lineTo(167.43f, 88.8f)
                close()
            }
        }
            .build()
        return _icForgetPasswordHeader!!
    }

private var _icForgetPasswordHeader: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcForgetPasswordHeader, contentDescription = null)
    }
}
