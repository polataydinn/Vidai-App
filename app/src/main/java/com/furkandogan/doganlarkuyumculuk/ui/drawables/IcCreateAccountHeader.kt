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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

public val Icons.IcCreateAccountHeader: ImageVector
    get() {
        if (_icCreateAccountHeader != null) {
            return _icCreateAccountHeader!!
        }
        _icCreateAccountHeader = Builder(
            name = "IcCreateAccountHeader",
            defaultWidth = 335.0.dp,
            defaultHeight = 132.0.dp,
            viewportWidth = 335.0f,
            viewportHeight = 132.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.06f, 38.2f)
                horizontalLineTo(17.18f)
                verticalLineTo(55.0f)
                horizontalLineTo(14.06f)
                verticalLineTo(47.8f)
                horizontalLineTo(5.38f)
                verticalLineTo(55.0f)
                horizontalLineTo(2.26f)
                verticalLineTo(38.2f)
                horizontalLineTo(5.38f)
                verticalLineTo(45.14f)
                horizontalLineTo(14.06f)
                verticalLineTo(38.2f)
                close()
                moveTo(33.45f, 48.66f)
                curveTo(33.45f, 48.9f, 33.42f, 49.26f, 33.4f, 49.55f)
                horizontalLineTo(23.34f)
                curveTo(23.7f, 51.42f, 25.26f, 52.62f, 27.49f, 52.62f)
                curveTo(28.93f, 52.62f, 30.06f, 52.17f, 30.97f, 51.23f)
                lineTo(32.58f, 53.08f)
                curveTo(31.43f, 54.45f, 29.63f, 55.17f, 27.42f, 55.17f)
                curveTo(23.13f, 55.17f, 20.34f, 52.41f, 20.34f, 48.59f)
                curveTo(20.34f, 44.78f, 23.15f, 42.04f, 26.97f, 42.04f)
                curveTo(30.71f, 42.04f, 33.45f, 44.66f, 33.45f, 48.66f)
                close()
                moveTo(26.97f, 44.44f)
                curveTo(25.02f, 44.44f, 23.61f, 45.69f, 23.32f, 47.56f)
                horizontalLineTo(30.59f)
                curveTo(30.35f, 45.71f, 28.93f, 44.44f, 26.97f, 44.44f)
                close()
                moveTo(40.29f, 55.17f)
                curveTo(38.15f, 55.17f, 36.02f, 54.54f, 34.86f, 53.73f)
                lineTo(36.02f, 51.45f)
                curveTo(37.14f, 52.19f, 38.87f, 52.72f, 40.48f, 52.72f)
                curveTo(42.38f, 52.72f, 43.17f, 52.19f, 43.17f, 51.3f)
                curveTo(43.17f, 48.86f, 35.25f, 51.16f, 35.25f, 46.05f)
                curveTo(35.25f, 43.62f, 37.43f, 42.04f, 40.89f, 42.04f)
                curveTo(42.59f, 42.04f, 44.54f, 42.45f, 45.69f, 43.14f)
                lineTo(44.54f, 45.42f)
                curveTo(43.31f, 44.7f, 42.09f, 44.46f, 40.86f, 44.46f)
                curveTo(39.04f, 44.46f, 38.18f, 45.06f, 38.18f, 45.9f)
                curveTo(38.18f, 48.5f, 46.1f, 46.19f, 46.1f, 51.21f)
                curveTo(46.1f, 53.61f, 43.89f, 55.17f, 40.29f, 55.17f)
                close()
                moveTo(53.57f, 42.04f)
                curveTo(57.27f, 42.04f, 59.41f, 43.79f, 59.41f, 47.49f)
                verticalLineTo(55.0f)
                horizontalLineTo(56.57f)
                verticalLineTo(53.44f)
                curveTo(55.85f, 54.54f, 54.46f, 55.17f, 52.54f, 55.17f)
                curveTo(49.61f, 55.17f, 47.77f, 53.56f, 47.77f, 51.33f)
                curveTo(47.77f, 49.19f, 49.21f, 47.51f, 53.09f, 47.51f)
                horizontalLineTo(56.41f)
                verticalLineTo(47.32f)
                curveTo(56.41f, 45.57f, 55.35f, 44.54f, 53.21f, 44.54f)
                curveTo(51.77f, 44.54f, 50.29f, 45.02f, 49.33f, 45.81f)
                lineTo(48.15f, 43.62f)
                curveTo(49.52f, 42.57f, 51.51f, 42.04f, 53.57f, 42.04f)
                close()
                moveTo(53.17f, 52.98f)
                curveTo(54.63f, 52.98f, 55.9f, 52.31f, 56.41f, 50.99f)
                verticalLineTo(49.5f)
                horizontalLineTo(53.31f)
                curveTo(51.27f, 49.5f, 50.72f, 50.27f, 50.72f, 51.21f)
                curveTo(50.72f, 52.29f, 51.63f, 52.98f, 53.17f, 52.98f)
                close()
                moveTo(70.36f, 42.04f)
                curveTo(74.11f, 42.04f, 76.87f, 44.63f, 76.87f, 48.59f)
                curveTo(76.87f, 52.58f, 74.11f, 55.17f, 70.36f, 55.17f)
                curveTo(68.73f, 55.17f, 67.29f, 54.62f, 66.26f, 53.44f)
                verticalLineTo(59.66f)
                horizontalLineTo(63.26f)
                verticalLineTo(42.18f)
                horizontalLineTo(66.11f)
                verticalLineTo(43.86f)
                curveTo(67.12f, 42.64f, 68.61f, 42.04f, 70.36f, 42.04f)
                close()
                moveTo(70.03f, 52.6f)
                curveTo(72.19f, 52.6f, 73.82f, 51.04f, 73.82f, 48.59f)
                curveTo(73.82f, 46.14f, 72.19f, 44.58f, 70.03f, 44.58f)
                curveTo(67.87f, 44.58f, 66.21f, 46.14f, 66.21f, 48.59f)
                curveTo(66.21f, 51.04f, 67.87f, 52.6f, 70.03f, 52.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.47f, 92.32f)
                curveTo(6.53f, 92.32f, 1.41f, 87.42f, 1.41f, 80.8f)
                curveTo(1.41f, 74.18f, 6.53f, 69.28f, 13.47f, 69.28f)
                curveTo(20.42f, 69.28f, 25.54f, 74.14f, 25.54f, 80.8f)
                curveTo(25.54f, 87.46f, 20.42f, 92.32f, 13.47f, 92.32f)
                close()
                moveTo(13.47f, 88.67f)
                curveTo(17.98f, 88.67f, 21.34f, 85.38f, 21.34f, 80.8f)
                curveTo(21.34f, 76.22f, 17.98f, 72.93f, 13.47f, 72.93f)
                curveTo(8.96f, 72.93f, 5.6f, 76.22f, 5.6f, 80.8f)
                curveTo(5.6f, 85.38f, 8.96f, 88.67f, 13.47f, 88.67f)
                close()
                moveTo(29.56f, 92.0f)
                verticalLineTo(68.26f)
                horizontalLineTo(33.56f)
                verticalLineTo(92.0f)
                horizontalLineTo(29.56f)
                close()
                moveTo(51.36f, 74.91f)
                horizontalLineTo(55.36f)
                verticalLineTo(92.0f)
                horizontalLineTo(51.55f)
                verticalLineTo(89.82f)
                curveTo(50.27f, 91.39f, 48.25f, 92.22f, 46.04f, 92.22f)
                curveTo(41.66f, 92.22f, 38.68f, 89.82f, 38.68f, 84.67f)
                verticalLineTo(74.91f)
                horizontalLineTo(42.68f)
                verticalLineTo(84.13f)
                curveTo(42.68f, 87.23f, 44.16f, 88.7f, 46.68f, 88.7f)
                curveTo(49.47f, 88.7f, 51.36f, 86.98f, 51.36f, 83.55f)
                verticalLineTo(74.91f)
                close()
                moveTo(73.62f, 86.94f)
                curveTo(73.62f, 89.86f, 71.15f, 91.84f, 67.09f, 92.19f)
                lineTo(66.74f, 93.57f)
                curveTo(68.62f, 93.79f, 69.52f, 94.88f, 69.52f, 96.26f)
                curveTo(69.52f, 98.11f, 67.79f, 99.3f, 65.17f, 99.3f)
                curveTo(64.02f, 99.3f, 63.02f, 99.07f, 62.22f, 98.62f)
                lineTo(62.96f, 96.74f)
                curveTo(63.63f, 97.09f, 64.34f, 97.25f, 65.14f, 97.25f)
                curveTo(66.32f, 97.25f, 66.83f, 96.8f, 66.83f, 96.1f)
                curveTo(66.83f, 95.49f, 66.35f, 95.04f, 65.14f, 95.04f)
                horizontalLineTo(64.14f)
                lineTo(64.91f, 92.19f)
                curveTo(62.38f, 92.03f, 60.02f, 91.26f, 58.64f, 90.3f)
                lineTo(60.18f, 87.26f)
                curveTo(61.68f, 88.26f, 63.98f, 88.96f, 66.13f, 88.96f)
                curveTo(68.66f, 88.96f, 69.71f, 88.26f, 69.71f, 87.07f)
                curveTo(69.71f, 83.81f, 59.15f, 86.88f, 59.15f, 80.06f)
                curveTo(59.15f, 76.83f, 62.06f, 74.72f, 66.67f, 74.72f)
                curveTo(68.94f, 74.72f, 71.54f, 75.26f, 73.07f, 76.19f)
                lineTo(71.54f, 79.23f)
                curveTo(69.9f, 78.27f, 68.27f, 77.95f, 66.64f, 77.95f)
                curveTo(64.21f, 77.95f, 63.06f, 78.75f, 63.06f, 79.87f)
                curveTo(63.06f, 83.33f, 73.62f, 80.26f, 73.62f, 86.94f)
                close()
                moveTo(86.21f, 88.22f)
                lineTo(87.33f, 91.07f)
                curveTo(86.37f, 91.84f, 84.93f, 92.22f, 83.49f, 92.22f)
                curveTo(79.75f, 92.22f, 77.61f, 90.24f, 77.61f, 86.46f)
                verticalLineTo(78.24f)
                horizontalLineTo(74.79f)
                verticalLineTo(75.04f)
                horizontalLineTo(77.61f)
                verticalLineTo(71.14f)
                horizontalLineTo(81.61f)
                verticalLineTo(75.04f)
                horizontalLineTo(86.18f)
                verticalLineTo(78.24f)
                horizontalLineTo(81.61f)
                verticalLineTo(86.37f)
                curveTo(81.61f, 88.03f, 82.44f, 88.93f, 83.97f, 88.93f)
                curveTo(84.81f, 88.93f, 85.61f, 88.7f, 86.21f, 88.22f)
                close()
                moveTo(103.17f, 74.91f)
                horizontalLineTo(107.17f)
                verticalLineTo(92.0f)
                horizontalLineTo(103.36f)
                verticalLineTo(89.82f)
                curveTo(102.08f, 91.39f, 100.06f, 92.22f, 97.86f, 92.22f)
                curveTo(93.47f, 92.22f, 90.5f, 89.82f, 90.5f, 84.67f)
                verticalLineTo(74.91f)
                horizontalLineTo(94.5f)
                verticalLineTo(84.13f)
                curveTo(94.5f, 87.23f, 95.97f, 88.7f, 98.5f, 88.7f)
                curveTo(101.28f, 88.7f, 103.17f, 86.98f, 103.17f, 83.55f)
                verticalLineTo(74.91f)
                close()
                moveTo(116.21f, 77.41f)
                curveTo(117.36f, 75.62f, 119.44f, 74.72f, 122.29f, 74.72f)
                verticalLineTo(78.53f)
                curveTo(121.94f, 78.46f, 121.65f, 78.43f, 121.36f, 78.43f)
                curveTo(118.32f, 78.43f, 116.4f, 80.22f, 116.4f, 83.71f)
                verticalLineTo(92.0f)
                horizontalLineTo(112.4f)
                verticalLineTo(74.91f)
                horizontalLineTo(116.21f)
                verticalLineTo(77.41f)
                close()
            }
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
                    start = Offset(271.64f, 3.64f), end = Offset(291.69f, 36.21f)
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
                curveTo(253.73f, 1.27f, 253.63f, 2.49f, 254.32f, 3.31f)
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
                lineTo(282.88f, 50.42f)
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
                curveTo(272.61f, 45.33f, 272.1f, 44.22f, 271.11f, 43.84f)
                curveTo(270.11f, 43.46f, 268.99f, 43.97f, 268.61f, 44.96f)
                lineTo(266.03f, 51.77f)
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
                    start = Offset(258.53f, 72.5f), end = Offset(259.39f, 79.85f)
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
        }
            .build()
        return _icCreateAccountHeader!!
    }

private var _icCreateAccountHeader: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcCreateAccountHeader, contentDescription = null)
    }
}
