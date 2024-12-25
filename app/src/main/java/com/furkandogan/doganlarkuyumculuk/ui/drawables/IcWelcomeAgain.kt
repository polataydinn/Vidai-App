package com.furkandogan.doganlarkuyumculuk.ui.drawables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

public val Icons.IcWelcomeAgain: ImageVector
    get() {
        if (_icWelcomeAgain != null) {
            return _icWelcomeAgain!!
        }
        _icWelcomeAgain = Builder(
            name = "IcWelcomeAgain",
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
                pathFillType = EvenOdd
            ) {
                moveTo(38.7f, 49.81f)
                lineTo(34.26f, 44.31f)
                lineTo(32.03f, 46.42f)
                verticalLineTo(49.81f)
                horizontalLineTo(29.03f)
                verticalLineTo(32.0f)
                horizontalLineTo(32.03f)
                verticalLineTo(42.75f)
                lineTo(38.24f, 36.99f)
                horizontalLineTo(41.84f)
                lineTo(36.49f, 42.37f)
                lineTo(42.35f, 49.81f)
                horizontalLineTo(38.7f)
                close()
                moveTo(86.23f, 32.0f)
                horizontalLineTo(89.23f)
                verticalLineTo(49.81f)
                horizontalLineTo(86.35f)
                verticalLineTo(48.15f)
                curveTo(85.34f, 49.38f, 83.86f, 49.98f, 82.1f, 49.98f)
                curveTo(78.38f, 49.98f, 75.62f, 47.38f, 75.62f, 43.4f)
                curveTo(75.62f, 39.42f, 78.38f, 36.85f, 82.1f, 36.85f)
                curveTo(83.76f, 36.85f, 85.22f, 37.4f, 86.23f, 38.58f)
                verticalLineTo(32.0f)
                close()
                moveTo(82.46f, 47.41f)
                curveTo(84.62f, 47.41f, 86.28f, 45.85f, 86.28f, 43.4f)
                curveTo(86.28f, 40.95f, 84.62f, 39.39f, 82.46f, 39.39f)
                curveTo(80.3f, 39.39f, 78.65f, 40.95f, 78.65f, 43.4f)
                curveTo(78.65f, 45.85f, 80.3f, 47.41f, 82.46f, 47.41f)
                close()
                moveTo(103.43f, 42.3f)
                curveTo(103.43f, 38.6f, 101.3f, 36.85f, 97.6f, 36.85f)
                curveTo(95.54f, 36.85f, 93.55f, 37.38f, 92.18f, 38.43f)
                lineTo(93.35f, 40.62f)
                curveTo(94.31f, 39.82f, 95.8f, 39.34f, 97.24f, 39.34f)
                curveTo(99.38f, 39.34f, 100.43f, 40.38f, 100.43f, 42.13f)
                verticalLineTo(42.32f)
                horizontalLineTo(97.12f)
                curveTo(93.23f, 42.32f, 91.79f, 44.0f, 91.79f, 46.14f)
                curveTo(91.79f, 48.37f, 93.64f, 49.98f, 96.57f, 49.98f)
                curveTo(98.49f, 49.98f, 99.88f, 49.35f, 100.6f, 48.25f)
                verticalLineTo(49.81f)
                horizontalLineTo(103.43f)
                verticalLineTo(42.3f)
                close()
                moveTo(100.43f, 45.8f)
                curveTo(99.93f, 47.12f, 98.66f, 47.79f, 97.19f, 47.79f)
                curveTo(95.66f, 47.79f, 94.75f, 47.1f, 94.75f, 46.02f)
                curveTo(94.75f, 45.08f, 95.3f, 44.31f, 97.34f, 44.31f)
                horizontalLineTo(100.43f)
                verticalLineTo(45.8f)
                close()
                moveTo(119.46f, 42.46f)
                curveTo(119.46f, 38.6f, 117.18f, 36.85f, 114.11f, 36.85f)
                curveTo(112.23f, 36.85f, 110.67f, 37.47f, 109.69f, 38.65f)
                verticalLineTo(36.99f)
                horizontalLineTo(106.83f)
                verticalLineTo(49.81f)
                horizontalLineTo(109.83f)
                verticalLineTo(43.33f)
                curveTo(109.83f, 40.76f, 111.27f, 39.46f, 113.41f, 39.46f)
                curveTo(115.33f, 39.46f, 116.46f, 40.57f, 116.46f, 42.85f)
                verticalLineTo(49.81f)
                horizontalLineTo(119.46f)
                verticalLineTo(42.46f)
                close()
                moveTo(74.7f, 36.85f)
                curveTo(72.57f, 36.85f, 71.01f, 37.52f, 70.14f, 38.86f)
                verticalLineTo(36.99f)
                horizontalLineTo(67.29f)
                verticalLineTo(49.81f)
                horizontalLineTo(70.29f)
                verticalLineTo(43.59f)
                curveTo(70.29f, 40.98f, 71.73f, 39.63f, 74.01f, 39.63f)
                curveTo(74.22f, 39.63f, 74.44f, 39.66f, 74.7f, 39.7f)
                verticalLineTo(36.85f)
                close()
                moveTo(58.05f, 36.85f)
                curveTo(61.75f, 36.85f, 63.89f, 38.6f, 63.89f, 42.3f)
                verticalLineTo(49.81f)
                horizontalLineTo(61.05f)
                verticalLineTo(48.25f)
                curveTo(60.33f, 49.35f, 58.94f, 49.98f, 57.02f, 49.98f)
                curveTo(54.09f, 49.98f, 52.25f, 48.37f, 52.25f, 46.14f)
                curveTo(52.25f, 44.0f, 53.69f, 42.32f, 57.57f, 42.32f)
                horizontalLineTo(60.89f)
                verticalLineTo(42.13f)
                curveTo(60.89f, 40.38f, 59.83f, 39.34f, 57.69f, 39.34f)
                curveTo(56.25f, 39.34f, 54.77f, 39.82f, 53.81f, 40.62f)
                lineTo(52.63f, 38.43f)
                curveTo(54.0f, 37.38f, 55.99f, 36.85f, 58.05f, 36.85f)
                close()
                moveTo(57.65f, 47.79f)
                curveTo(59.11f, 47.79f, 60.38f, 47.12f, 60.89f, 45.8f)
                verticalLineTo(44.31f)
                horizontalLineTo(57.79f)
                curveTo(55.75f, 44.31f, 55.2f, 45.08f, 55.2f, 46.02f)
                curveTo(55.2f, 47.1f, 56.11f, 47.79f, 57.65f, 47.79f)
                close()
                moveTo(51.13f, 36.85f)
                curveTo(49.0f, 36.85f, 47.44f, 37.52f, 46.57f, 38.86f)
                verticalLineTo(36.99f)
                horizontalLineTo(43.72f)
                verticalLineTo(49.81f)
                horizontalLineTo(46.72f)
                verticalLineTo(43.59f)
                curveTo(46.72f, 40.98f, 48.16f, 39.63f, 50.44f, 39.63f)
                curveTo(50.65f, 39.63f, 50.87f, 39.66f, 51.13f, 39.7f)
                verticalLineTo(36.85f)
                close()
                moveTo(26.55f, 44.36f)
                curveTo(26.57f, 44.07f, 26.59f, 43.71f, 26.59f, 43.47f)
                curveTo(26.59f, 39.46f, 23.86f, 36.85f, 20.11f, 36.85f)
                curveTo(16.3f, 36.85f, 13.49f, 39.58f, 13.49f, 43.4f)
                curveTo(13.49f, 47.22f, 16.27f, 49.98f, 20.57f, 49.98f)
                curveTo(22.78f, 49.98f, 24.58f, 49.26f, 25.73f, 47.89f)
                lineTo(24.12f, 46.04f)
                curveTo(23.21f, 46.98f, 22.08f, 47.43f, 20.64f, 47.43f)
                curveTo(18.41f, 47.43f, 16.85f, 46.23f, 16.49f, 44.36f)
                horizontalLineTo(26.55f)
                close()
                moveTo(16.47f, 42.37f)
                curveTo(16.75f, 40.5f, 18.17f, 39.25f, 20.11f, 39.25f)
                curveTo(22.08f, 39.25f, 23.5f, 40.52f, 23.74f, 42.37f)
                horizontalLineTo(16.47f)
                close()
                moveTo(5.57f, 49.81f)
                verticalLineTo(35.65f)
                horizontalLineTo(0.0f)
                verticalLineTo(33.01f)
                horizontalLineTo(14.26f)
                verticalLineTo(35.65f)
                horizontalLineTo(8.69f)
                verticalLineTo(49.81f)
                horizontalLineTo(5.57f)
                close()
                moveTo(158.44f, 68.89f)
                curveTo(158.44f, 63.74f, 155.4f, 61.4f, 151.31f, 61.4f)
                curveTo(148.81f, 61.4f, 146.73f, 62.23f, 145.42f, 63.8f)
                verticalLineTo(61.59f)
                horizontalLineTo(141.61f)
                verticalLineTo(78.68f)
                horizontalLineTo(145.61f)
                verticalLineTo(70.04f)
                curveTo(145.61f, 66.62f, 147.53f, 64.89f, 150.38f, 64.89f)
                curveTo(152.94f, 64.89f, 154.44f, 66.36f, 154.44f, 69.4f)
                verticalLineTo(78.68f)
                horizontalLineTo(158.44f)
                verticalLineTo(68.89f)
                close()
                moveTo(134.83f, 58.78f)
                curveTo(133.35f, 58.78f, 132.27f, 57.72f, 132.27f, 56.38f)
                curveTo(132.27f, 55.03f, 133.35f, 53.98f, 134.83f, 53.98f)
                curveTo(136.3f, 53.98f, 137.39f, 54.97f, 137.39f, 56.28f)
                curveTo(137.39f, 57.69f, 136.33f, 58.78f, 134.83f, 58.78f)
                close()
                moveTo(136.81f, 78.68f)
                horizontalLineTo(132.81f)
                verticalLineTo(61.59f)
                horizontalLineTo(136.81f)
                verticalLineTo(78.68f)
                close()
                moveTo(128.03f, 54.94f)
                horizontalLineTo(124.03f)
                verticalLineTo(63.7f)
                curveTo(122.68f, 62.14f, 120.73f, 61.4f, 118.52f, 61.4f)
                curveTo(113.56f, 61.4f, 109.88f, 64.82f, 109.88f, 70.14f)
                curveTo(109.88f, 75.45f, 113.56f, 78.9f, 118.52f, 78.9f)
                curveTo(120.86f, 78.9f, 122.84f, 78.1f, 124.19f, 76.47f)
                verticalLineTo(78.68f)
                horizontalLineTo(128.03f)
                verticalLineTo(54.94f)
                close()
                moveTo(124.09f, 70.14f)
                curveTo(124.09f, 73.4f, 121.88f, 75.48f, 119.0f, 75.48f)
                curveTo(116.12f, 75.48f, 113.92f, 73.4f, 113.92f, 70.14f)
                curveTo(113.92f, 66.87f, 116.12f, 64.79f, 119.0f, 64.79f)
                curveTo(121.88f, 64.79f, 124.09f, 66.87f, 124.09f, 70.14f)
                close()
                moveTo(102.49f, 78.68f)
                verticalLineTo(54.94f)
                horizontalLineTo(106.49f)
                verticalLineTo(78.68f)
                horizontalLineTo(102.49f)
                close()
                moveTo(99.03f, 71.42f)
                curveTo(99.07f, 71.03f, 99.1f, 70.55f, 99.1f, 70.23f)
                curveTo(99.1f, 64.89f, 95.45f, 61.4f, 90.46f, 61.4f)
                curveTo(85.37f, 61.4f, 81.63f, 65.05f, 81.63f, 70.14f)
                curveTo(81.63f, 75.22f, 85.34f, 78.9f, 91.07f, 78.9f)
                curveTo(94.01f, 78.9f, 96.41f, 77.94f, 97.95f, 76.12f)
                lineTo(95.8f, 73.66f)
                curveTo(94.59f, 74.9f, 93.08f, 75.51f, 91.16f, 75.51f)
                curveTo(88.19f, 75.51f, 86.11f, 73.91f, 85.63f, 71.42f)
                horizontalLineTo(99.03f)
                close()
                moveTo(85.59f, 68.76f)
                curveTo(85.98f, 66.26f, 87.87f, 64.6f, 90.46f, 64.6f)
                curveTo(93.08f, 64.6f, 94.97f, 66.3f, 95.29f, 68.76f)
                horizontalLineTo(85.59f)
                close()
                moveTo(74.42f, 61.59f)
                horizontalLineTo(78.23f)
                verticalLineTo(76.09f)
                curveTo(78.23f, 82.3f, 74.99f, 85.11f, 69.01f, 85.11f)
                curveTo(65.81f, 85.11f, 62.64f, 84.28f, 60.69f, 82.68f)
                lineTo(62.48f, 79.67f)
                curveTo(63.99f, 80.92f, 66.42f, 81.72f, 68.79f, 81.72f)
                curveTo(72.56f, 81.72f, 74.23f, 79.99f, 74.23f, 76.54f)
                verticalLineTo(75.64f)
                curveTo(72.82f, 77.18f, 70.8f, 77.91f, 68.5f, 77.91f)
                curveTo(63.6f, 77.91f, 59.86f, 74.58f, 59.86f, 69.62f)
                curveTo(59.86f, 64.66f, 63.6f, 61.4f, 68.5f, 61.4f)
                curveTo(70.9f, 61.4f, 73.01f, 62.17f, 74.42f, 63.86f)
                verticalLineTo(61.59f)
                close()
                moveTo(69.11f, 74.52f)
                curveTo(72.11f, 74.52f, 74.29f, 72.54f, 74.29f, 69.62f)
                curveTo(74.29f, 66.74f, 72.11f, 64.79f, 69.11f, 64.79f)
                curveTo(66.07f, 64.79f, 63.89f, 66.74f, 63.89f, 69.62f)
                curveTo(63.89f, 72.54f, 66.07f, 74.52f, 69.11f, 74.52f)
                close()
                moveTo(51.74f, 78.87f)
                curveTo(55.81f, 78.52f, 58.27f, 76.54f, 58.27f, 73.62f)
                curveTo(58.27f, 69.73f, 54.7f, 69.15f, 51.71f, 68.65f)
                curveTo(49.56f, 68.3f, 47.71f, 68.0f, 47.71f, 66.55f)
                curveTo(47.71f, 65.43f, 48.86f, 64.63f, 51.3f, 64.63f)
                curveTo(52.93f, 64.63f, 54.56f, 64.95f, 56.19f, 65.91f)
                lineTo(57.73f, 62.87f)
                curveTo(56.19f, 61.94f, 53.6f, 61.4f, 51.33f, 61.4f)
                curveTo(46.72f, 61.4f, 43.81f, 63.51f, 43.81f, 66.74f)
                curveTo(43.81f, 70.77f, 47.5f, 71.35f, 50.51f, 71.82f)
                curveTo(52.6f, 72.14f, 54.37f, 72.42f, 54.37f, 73.75f)
                curveTo(54.37f, 74.94f, 53.31f, 75.64f, 50.78f, 75.64f)
                curveTo(48.64f, 75.64f, 46.34f, 74.94f, 44.83f, 73.94f)
                lineTo(43.3f, 76.98f)
                curveTo(44.67f, 77.94f, 47.04f, 78.71f, 49.57f, 78.87f)
                lineTo(48.8f, 81.72f)
                horizontalLineTo(49.79f)
                curveTo(51.01f, 81.72f, 51.49f, 82.17f, 51.49f, 82.78f)
                curveTo(51.49f, 83.48f, 50.98f, 83.93f, 49.79f, 83.93f)
                curveTo(48.99f, 83.93f, 48.29f, 83.77f, 47.62f, 83.42f)
                lineTo(46.88f, 85.3f)
                curveTo(47.68f, 85.75f, 48.67f, 85.98f, 49.82f, 85.98f)
                curveTo(52.45f, 85.98f, 54.18f, 84.79f, 54.18f, 82.94f)
                curveTo(54.18f, 81.56f, 53.28f, 80.47f, 51.39f, 80.25f)
                lineTo(51.74f, 78.87f)
                close()
                moveTo(32.75f, 78.9f)
                curveTo(27.5f, 78.9f, 23.66f, 75.26f, 23.66f, 70.14f)
                curveTo(23.66f, 65.02f, 27.5f, 61.4f, 32.75f, 61.4f)
                curveTo(38.06f, 61.4f, 41.87f, 65.02f, 41.87f, 70.14f)
                curveTo(41.87f, 75.26f, 38.06f, 78.9f, 32.75f, 78.9f)
                close()
                moveTo(32.75f, 75.48f)
                curveTo(35.66f, 75.48f, 37.84f, 73.4f, 37.84f, 70.14f)
                curveTo(37.84f, 66.87f, 35.66f, 64.79f, 32.75f, 64.79f)
                curveTo(29.87f, 64.79f, 27.7f, 66.87f, 27.7f, 70.14f)
                curveTo(27.7f, 73.4f, 29.87f, 75.48f, 32.75f, 75.48f)
                close()
                moveTo(19.9f, 56.28f)
                horizontalLineTo(15.74f)
                verticalLineTo(65.53f)
                horizontalLineTo(4.16f)
                verticalLineTo(56.28f)
                horizontalLineTo(0.0f)
                verticalLineTo(78.68f)
                horizontalLineTo(4.16f)
                verticalLineTo(69.08f)
                horizontalLineTo(15.74f)
                verticalLineTo(78.68f)
                horizontalLineTo(19.9f)
                verticalLineTo(56.28f)
                close()
            }
        }
            .build()
        return _icWelcomeAgain!!
    }

private var _icWelcomeAgain: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcWelcomeAgain, contentDescription = null)
    }
}
