package com.tatari.vidai.ui.drawables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

public val Icons.IcLoginWithAccount: ImageVector
    get() {
        if (_icLoginWithAccount != null) {
            return _icLoginWithAccount!!
        }
        _icLoginWithAccount = Builder(
            name = "IcLoginWithAccount",
            defaultWidth = 313.0.dp,
            defaultHeight = 44.0.dp,
            viewportWidth = 313.0f,
            viewportHeight = 44.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF007AFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.0f)
                lineTo(301.0f, 3.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 309.0f, 11.0f)
                lineTo(309.0f, 31.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 301.0f, 39.0f)
                lineTo(12.0f, 39.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 31.0f)
                lineTo(4.0f, 11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(83.68f, 15.8f)
                verticalLineTo(27.0f)
                horizontalLineTo(82.52f)
                verticalLineTo(21.83f)
                horizontalLineTo(75.51f)
                verticalLineTo(27.0f)
                horizontalLineTo(74.32f)
                verticalLineTo(15.8f)
                horizontalLineTo(75.51f)
                verticalLineTo(20.79f)
                horizontalLineTo(82.52f)
                verticalLineTo(15.8f)
                horizontalLineTo(83.68f)
                close()
                moveTo(90.7f, 26.07f)
                curveTo(91.22f, 26.07f, 91.7f, 25.98f, 92.14f, 25.8f)
                curveTo(92.59f, 25.61f, 92.97f, 25.33f, 93.28f, 24.97f)
                lineTo(93.92f, 25.7f)
                curveTo(93.54f, 26.15f, 93.08f, 26.49f, 92.52f, 26.73f)
                curveTo(91.97f, 26.96f, 91.36f, 27.08f, 90.68f, 27.08f)
                curveTo(89.82f, 27.08f, 89.05f, 26.9f, 88.38f, 26.54f)
                curveTo(87.71f, 26.16f, 87.18f, 25.65f, 86.81f, 25.0f)
                curveTo(86.44f, 24.35f, 86.25f, 23.61f, 86.25f, 22.79f)
                curveTo(86.25f, 21.97f, 86.43f, 21.23f, 86.78f, 20.58f)
                curveTo(87.14f, 19.93f, 87.64f, 19.43f, 88.27f, 19.06f)
                curveTo(88.9f, 18.7f, 89.61f, 18.52f, 90.41f, 18.52f)
                curveTo(91.16f, 18.52f, 91.83f, 18.69f, 92.43f, 19.03f)
                curveTo(93.04f, 19.37f, 93.52f, 19.85f, 93.87f, 20.46f)
                curveTo(94.23f, 21.06f, 94.42f, 21.76f, 94.44f, 22.54f)
                lineTo(87.53f, 23.88f)
                curveTo(87.75f, 24.56f, 88.13f, 25.1f, 88.68f, 25.5f)
                curveTo(89.25f, 25.88f, 89.92f, 26.07f, 90.7f, 26.07f)
                close()
                moveTo(90.41f, 19.5f)
                curveTo(89.82f, 19.5f, 89.3f, 19.63f, 88.83f, 19.91f)
                curveTo(88.37f, 20.18f, 88.01f, 20.56f, 87.74f, 21.05f)
                curveTo(87.48f, 21.53f, 87.36f, 22.08f, 87.36f, 22.71f)
                curveTo(87.36f, 22.87f, 87.36f, 22.99f, 87.37f, 23.06f)
                lineTo(93.31f, 21.91f)
                curveTo(93.18f, 21.21f, 92.85f, 20.63f, 92.33f, 20.18f)
                curveTo(91.81f, 19.73f, 91.17f, 19.5f, 90.41f, 19.5f)
                close()
                moveTo(99.01f, 27.08f)
                curveTo(98.33f, 27.08f, 97.67f, 26.98f, 97.04f, 26.79f)
                curveTo(96.43f, 26.59f, 95.94f, 26.34f, 95.59f, 26.04f)
                lineTo(96.1f, 25.14f)
                curveTo(96.45f, 25.42f, 96.89f, 25.65f, 97.43f, 25.83f)
                curveTo(97.96f, 26.0f, 98.52f, 26.09f, 99.09f, 26.09f)
                curveTo(99.86f, 26.09f, 100.43f, 25.97f, 100.79f, 25.74f)
                curveTo(101.16f, 25.49f, 101.35f, 25.15f, 101.35f, 24.71f)
                curveTo(101.35f, 24.4f, 101.25f, 24.16f, 101.04f, 23.99f)
                curveTo(100.84f, 23.81f, 100.58f, 23.68f, 100.28f, 23.59f)
                curveTo(99.97f, 23.5f, 99.56f, 23.41f, 99.04f, 23.32f)
                curveTo(98.36f, 23.19f, 97.81f, 23.06f, 97.4f, 22.94f)
                curveTo(96.98f, 22.8f, 96.62f, 22.57f, 96.32f, 22.25f)
                curveTo(96.04f, 21.93f, 95.89f, 21.49f, 95.89f, 20.92f)
                curveTo(95.89f, 20.22f, 96.19f, 19.64f, 96.77f, 19.19f)
                curveTo(97.36f, 18.74f, 98.17f, 18.52f, 99.22f, 18.52f)
                curveTo(99.76f, 18.52f, 100.31f, 18.59f, 100.85f, 18.74f)
                curveTo(101.4f, 18.88f, 101.84f, 19.07f, 102.2f, 19.3f)
                lineTo(101.7f, 20.22f)
                curveTo(101.01f, 19.74f, 100.18f, 19.5f, 99.22f, 19.5f)
                curveTo(98.49f, 19.5f, 97.95f, 19.62f, 97.57f, 19.88f)
                curveTo(97.21f, 20.14f, 97.03f, 20.47f, 97.03f, 20.89f)
                curveTo(97.03f, 21.21f, 97.13f, 21.46f, 97.33f, 21.66f)
                curveTo(97.55f, 21.85f, 97.81f, 21.99f, 98.12f, 22.09f)
                curveTo(98.43f, 22.17f, 98.85f, 22.26f, 99.4f, 22.36f)
                curveTo(100.07f, 22.49f, 100.61f, 22.62f, 101.01f, 22.74f)
                curveTo(101.42f, 22.87f, 101.76f, 23.09f, 102.05f, 23.4f)
                curveTo(102.34f, 23.71f, 102.48f, 24.14f, 102.48f, 24.68f)
                curveTo(102.48f, 25.42f, 102.18f, 26.0f, 101.56f, 26.44f)
                curveTo(100.95f, 26.87f, 100.1f, 27.08f, 99.01f, 27.08f)
                close()
                moveTo(112.26f, 18.58f)
                verticalLineTo(27.0f)
                horizontalLineTo(111.18f)
                verticalLineTo(25.34f)
                curveTo(110.83f, 25.9f, 110.38f, 26.33f, 109.82f, 26.63f)
                curveTo(109.26f, 26.93f, 108.63f, 27.08f, 107.93f, 27.08f)
                curveTo(107.14f, 27.08f, 106.42f, 26.9f, 105.78f, 26.54f)
                curveTo(105.14f, 26.17f, 104.64f, 25.67f, 104.28f, 25.02f)
                curveTo(103.92f, 24.37f, 103.74f, 23.62f, 103.74f, 22.79f)
                curveTo(103.74f, 21.96f, 103.92f, 21.22f, 104.28f, 20.57f)
                curveTo(104.64f, 19.92f, 105.14f, 19.42f, 105.78f, 19.06f)
                curveTo(106.42f, 18.7f, 107.14f, 18.52f, 107.93f, 18.52f)
                curveTo(108.61f, 18.52f, 109.22f, 18.66f, 109.77f, 18.95f)
                curveTo(110.32f, 19.23f, 110.78f, 19.64f, 111.13f, 20.18f)
                verticalLineTo(18.58f)
                horizontalLineTo(112.26f)
                close()
                moveTo(108.02f, 26.07f)
                curveTo(108.61f, 26.07f, 109.14f, 25.94f, 109.61f, 25.67f)
                curveTo(110.09f, 25.39f, 110.46f, 25.01f, 110.73f, 24.5f)
                curveTo(111.0f, 24.0f, 111.14f, 23.43f, 111.14f, 22.79f)
                curveTo(111.14f, 22.15f, 111.0f, 21.58f, 110.73f, 21.08f)
                curveTo(110.46f, 20.58f, 110.09f, 20.19f, 109.61f, 19.93f)
                curveTo(109.14f, 19.65f, 108.61f, 19.51f, 108.02f, 19.51f)
                curveTo(107.43f, 19.51f, 106.89f, 19.65f, 106.41f, 19.93f)
                curveTo(105.94f, 20.19f, 105.57f, 20.58f, 105.29f, 21.08f)
                curveTo(105.02f, 21.58f, 104.89f, 22.15f, 104.89f, 22.79f)
                curveTo(104.89f, 23.43f, 105.02f, 24.0f, 105.29f, 24.5f)
                curveTo(105.57f, 25.01f, 105.94f, 25.39f, 106.41f, 25.67f)
                curveTo(106.89f, 25.94f, 107.43f, 26.07f, 108.02f, 26.07f)
                close()
                moveTo(119.76f, 18.52f)
                curveTo(120.55f, 18.52f, 121.27f, 18.7f, 121.91f, 19.06f)
                curveTo(122.55f, 19.42f, 123.05f, 19.92f, 123.41f, 20.57f)
                curveTo(123.77f, 21.22f, 123.96f, 21.96f, 123.96f, 22.79f)
                curveTo(123.96f, 23.63f, 123.77f, 24.38f, 123.41f, 25.03f)
                curveTo(123.05f, 25.68f, 122.55f, 26.19f, 121.91f, 26.55f)
                curveTo(121.28f, 26.9f, 120.56f, 27.08f, 119.76f, 27.08f)
                curveTo(119.08f, 27.08f, 118.46f, 26.94f, 117.91f, 26.66f)
                curveTo(117.36f, 26.38f, 116.92f, 25.96f, 116.56f, 25.42f)
                verticalLineTo(30.1f)
                horizontalLineTo(115.43f)
                verticalLineTo(18.58f)
                horizontalLineTo(116.52f)
                verticalLineTo(20.25f)
                curveTo(116.86f, 19.69f, 117.31f, 19.27f, 117.86f, 18.97f)
                curveTo(118.43f, 18.67f, 119.06f, 18.52f, 119.76f, 18.52f)
                close()
                moveTo(119.68f, 26.07f)
                curveTo(120.27f, 26.07f, 120.8f, 25.94f, 121.28f, 25.67f)
                curveTo(121.76f, 25.39f, 122.14f, 25.01f, 122.4f, 24.5f)
                curveTo(122.68f, 24.0f, 122.82f, 23.43f, 122.82f, 22.79f)
                curveTo(122.82f, 22.15f, 122.68f, 21.59f, 122.4f, 21.1f)
                curveTo(122.14f, 20.59f, 121.76f, 20.21f, 121.28f, 19.93f)
                curveTo(120.8f, 19.65f, 120.27f, 19.51f, 119.68f, 19.51f)
                curveTo(119.09f, 19.51f, 118.55f, 19.65f, 118.07f, 19.93f)
                curveTo(117.6f, 20.21f, 117.22f, 20.59f, 116.95f, 21.1f)
                curveTo(116.68f, 21.59f, 116.55f, 22.15f, 116.55f, 22.79f)
                curveTo(116.55f, 23.43f, 116.68f, 24.0f, 116.95f, 24.5f)
                curveTo(117.22f, 25.01f, 117.6f, 25.39f, 118.07f, 25.67f)
                curveTo(118.55f, 25.94f, 119.09f, 26.07f, 119.68f, 26.07f)
                close()
                moveTo(130.46f, 18.58f)
                horizontalLineTo(131.6f)
                verticalLineTo(27.0f)
                horizontalLineTo(130.46f)
                verticalLineTo(18.58f)
                close()
                moveTo(131.04f, 16.74f)
                curveTo(130.8f, 16.74f, 130.6f, 16.66f, 130.44f, 16.5f)
                curveTo(130.28f, 16.34f, 130.2f, 16.15f, 130.2f, 15.93f)
                curveTo(130.2f, 15.71f, 130.28f, 15.53f, 130.44f, 15.37f)
                curveTo(130.6f, 15.21f, 130.8f, 15.13f, 131.04f, 15.13f)
                curveTo(131.27f, 15.13f, 131.47f, 15.21f, 131.63f, 15.37f)
                curveTo(131.79f, 15.52f, 131.87f, 15.7f, 131.87f, 15.91f)
                curveTo(131.87f, 16.15f, 131.79f, 16.34f, 131.63f, 16.5f)
                curveTo(131.47f, 16.66f, 131.27f, 16.74f, 131.04f, 16.74f)
                close()
                moveTo(137.12f, 27.08f)
                curveTo(136.37f, 27.08f, 135.78f, 26.87f, 135.36f, 26.44f)
                curveTo(134.96f, 26.01f, 134.76f, 25.42f, 134.76f, 24.66f)
                verticalLineTo(15.13f)
                horizontalLineTo(135.89f)
                verticalLineTo(24.57f)
                curveTo(135.89f, 25.07f, 136.01f, 25.45f, 136.24f, 25.72f)
                curveTo(136.48f, 25.98f, 136.83f, 26.1f, 137.3f, 26.1f)
                curveTo(137.6f, 26.1f, 137.85f, 26.06f, 138.07f, 25.96f)
                lineTo(138.15f, 26.9f)
                curveTo(137.82f, 27.02f, 137.48f, 27.08f, 137.12f, 27.08f)
                close()
                moveTo(143.14f, 26.07f)
                curveTo(143.66f, 26.07f, 144.14f, 25.98f, 144.58f, 25.8f)
                curveTo(145.02f, 25.61f, 145.4f, 25.33f, 145.71f, 24.97f)
                lineTo(146.35f, 25.7f)
                curveTo(145.98f, 26.15f, 145.52f, 26.49f, 144.96f, 26.73f)
                curveTo(144.41f, 26.96f, 143.79f, 27.08f, 143.12f, 27.08f)
                curveTo(142.26f, 27.08f, 141.49f, 26.9f, 140.82f, 26.54f)
                curveTo(140.15f, 26.16f, 139.62f, 25.65f, 139.25f, 25.0f)
                curveTo(138.88f, 24.35f, 138.69f, 23.61f, 138.69f, 22.79f)
                curveTo(138.69f, 21.97f, 138.87f, 21.23f, 139.22f, 20.58f)
                curveTo(139.58f, 19.93f, 140.08f, 19.43f, 140.71f, 19.06f)
                curveTo(141.33f, 18.7f, 142.05f, 18.52f, 142.85f, 18.52f)
                curveTo(143.6f, 18.52f, 144.27f, 18.69f, 144.87f, 19.03f)
                curveTo(145.47f, 19.37f, 145.95f, 19.85f, 146.3f, 20.46f)
                curveTo(146.67f, 21.06f, 146.86f, 21.76f, 146.88f, 22.54f)
                lineTo(139.97f, 23.88f)
                curveTo(140.18f, 24.56f, 140.57f, 25.1f, 141.12f, 25.5f)
                curveTo(141.69f, 25.88f, 142.36f, 26.07f, 143.14f, 26.07f)
                close()
                moveTo(142.85f, 19.5f)
                curveTo(142.26f, 19.5f, 141.73f, 19.63f, 141.26f, 19.91f)
                curveTo(140.81f, 20.18f, 140.44f, 20.56f, 140.18f, 21.05f)
                curveTo(139.92f, 21.53f, 139.79f, 22.08f, 139.79f, 22.71f)
                curveTo(139.79f, 22.87f, 139.8f, 22.99f, 139.81f, 23.06f)
                lineTo(145.74f, 21.91f)
                curveTo(145.62f, 21.21f, 145.29f, 20.63f, 144.77f, 20.18f)
                curveTo(144.25f, 19.73f, 143.61f, 19.5f, 142.85f, 19.5f)
                close()
                moveTo(161.51f, 21.4f)
                horizontalLineTo(162.65f)
                verticalLineTo(27.0f)
                horizontalLineTo(161.6f)
                verticalLineTo(26.06f)
                curveTo(161.18f, 26.4f, 160.68f, 26.66f, 160.1f, 26.84f)
                curveTo(159.54f, 27.01f, 158.93f, 27.1f, 158.28f, 27.1f)
                curveTo(157.27f, 27.1f, 156.34f, 26.87f, 155.48f, 26.42f)
                curveTo(154.62f, 25.98f, 153.94f, 25.33f, 153.41f, 24.47f)
                curveTo(152.89f, 23.62f, 152.63f, 22.61f, 152.63f, 21.43f)
                curveTo(152.63f, 20.34f, 152.88f, 19.37f, 153.4f, 18.5f)
                curveTo(153.91f, 17.63f, 154.61f, 16.95f, 155.51f, 16.46f)
                curveTo(156.4f, 15.95f, 157.42f, 15.7f, 158.55f, 15.7f)
                curveTo(159.4f, 15.7f, 160.19f, 15.84f, 160.9f, 16.12f)
                curveTo(161.62f, 16.39f, 162.22f, 16.79f, 162.71f, 17.32f)
                lineTo(161.97f, 18.07f)
                curveTo(161.09f, 17.2f, 159.96f, 16.76f, 158.6f, 16.76f)
                curveTo(157.69f, 16.76f, 156.87f, 16.96f, 156.13f, 17.37f)
                curveTo(155.41f, 17.76f, 154.84f, 18.32f, 154.42f, 19.03f)
                curveTo(154.01f, 19.75f, 153.8f, 20.55f, 153.8f, 21.43f)
                curveTo(153.8f, 22.38f, 154.01f, 23.21f, 154.42f, 23.91f)
                curveTo(154.85f, 24.61f, 155.41f, 25.14f, 156.1f, 25.51f)
                curveTo(156.8f, 25.87f, 157.56f, 26.06f, 158.36f, 26.06f)
                curveTo(158.94f, 26.06f, 159.51f, 25.96f, 160.05f, 25.77f)
                curveTo(160.61f, 25.57f, 161.09f, 25.26f, 161.51f, 24.86f)
                verticalLineTo(21.4f)
                close()
                moveTo(165.76f, 18.58f)
                horizontalLineTo(166.89f)
                verticalLineTo(27.0f)
                horizontalLineTo(165.76f)
                verticalLineTo(18.58f)
                close()
                moveTo(166.33f, 16.74f)
                curveTo(166.1f, 16.74f, 165.9f, 16.66f, 165.74f, 16.5f)
                curveTo(165.58f, 16.34f, 165.5f, 16.15f, 165.5f, 15.93f)
                curveTo(165.5f, 15.71f, 165.58f, 15.53f, 165.74f, 15.37f)
                curveTo(165.9f, 15.21f, 166.1f, 15.13f, 166.33f, 15.13f)
                curveTo(166.57f, 15.13f, 166.76f, 15.21f, 166.92f, 15.37f)
                curveTo(167.08f, 15.52f, 167.16f, 15.7f, 167.16f, 15.91f)
                curveTo(167.16f, 16.15f, 167.08f, 16.34f, 166.92f, 16.5f)
                curveTo(166.76f, 16.66f, 166.57f, 16.74f, 166.33f, 16.74f)
                close()
                moveTo(171.14f, 20.23f)
                curveTo(171.41f, 19.67f, 171.8f, 19.24f, 172.32f, 18.95f)
                curveTo(172.86f, 18.66f, 173.51f, 18.52f, 174.29f, 18.52f)
                verticalLineTo(19.62f)
                lineTo(174.02f, 19.61f)
                curveTo(173.13f, 19.61f, 172.44f, 19.88f, 171.94f, 20.42f)
                curveTo(171.44f, 20.97f, 171.19f, 21.73f, 171.19f, 22.71f)
                verticalLineTo(27.0f)
                horizontalLineTo(170.05f)
                verticalLineTo(18.58f)
                horizontalLineTo(171.14f)
                verticalLineTo(20.23f)
                close()
                moveTo(176.35f, 18.58f)
                horizontalLineTo(177.49f)
                verticalLineTo(27.0f)
                horizontalLineTo(176.35f)
                verticalLineTo(18.58f)
                close()
                moveTo(176.93f, 16.74f)
                curveTo(176.69f, 16.74f, 176.49f, 16.66f, 176.33f, 16.5f)
                curveTo(176.17f, 16.34f, 176.09f, 16.15f, 176.09f, 15.93f)
                curveTo(176.09f, 15.71f, 176.17f, 15.53f, 176.33f, 15.37f)
                curveTo(176.49f, 15.21f, 176.69f, 15.13f, 176.93f, 15.13f)
                curveTo(177.16f, 15.13f, 177.36f, 15.21f, 177.52f, 15.37f)
                curveTo(177.68f, 15.52f, 177.76f, 15.7f, 177.76f, 15.91f)
                curveTo(177.76f, 16.15f, 177.68f, 16.34f, 177.52f, 16.5f)
                curveTo(177.36f, 16.66f, 177.16f, 16.74f, 176.93f, 16.74f)
                close()
                moveTo(182.9f, 27.08f)
                curveTo(182.22f, 27.08f, 181.56f, 26.98f, 180.93f, 26.79f)
                curveTo(180.32f, 26.59f, 179.83f, 26.34f, 179.48f, 26.04f)
                lineTo(179.99f, 25.14f)
                curveTo(180.34f, 25.42f, 180.79f, 25.65f, 181.32f, 25.83f)
                curveTo(181.85f, 26.0f, 182.41f, 26.09f, 182.98f, 26.09f)
                curveTo(183.75f, 26.09f, 184.32f, 25.97f, 184.68f, 25.74f)
                curveTo(185.05f, 25.49f, 185.24f, 25.15f, 185.24f, 24.71f)
                curveTo(185.24f, 24.4f, 185.14f, 24.16f, 184.93f, 23.99f)
                curveTo(184.73f, 23.81f, 184.48f, 23.68f, 184.17f, 23.59f)
                curveTo(183.86f, 23.5f, 183.45f, 23.41f, 182.93f, 23.32f)
                curveTo(182.25f, 23.19f, 181.7f, 23.06f, 181.29f, 22.94f)
                curveTo(180.87f, 22.8f, 180.51f, 22.57f, 180.21f, 22.25f)
                curveTo(179.93f, 21.93f, 179.78f, 21.49f, 179.78f, 20.92f)
                curveTo(179.78f, 20.22f, 180.08f, 19.64f, 180.66f, 19.19f)
                curveTo(181.25f, 18.74f, 182.07f, 18.52f, 183.11f, 18.52f)
                curveTo(183.65f, 18.52f, 184.2f, 18.59f, 184.74f, 18.74f)
                curveTo(185.29f, 18.88f, 185.74f, 19.07f, 186.09f, 19.3f)
                lineTo(185.59f, 20.22f)
                curveTo(184.9f, 19.74f, 184.07f, 19.5f, 183.11f, 19.5f)
                curveTo(182.38f, 19.5f, 181.84f, 19.62f, 181.46f, 19.88f)
                curveTo(181.1f, 20.14f, 180.92f, 20.47f, 180.92f, 20.89f)
                curveTo(180.92f, 21.21f, 181.02f, 21.46f, 181.22f, 21.66f)
                curveTo(181.44f, 21.85f, 181.7f, 21.99f, 182.01f, 22.09f)
                curveTo(182.32f, 22.17f, 182.74f, 22.26f, 183.29f, 22.36f)
                curveTo(183.96f, 22.49f, 184.5f, 22.62f, 184.9f, 22.74f)
                curveTo(185.31f, 22.87f, 185.65f, 23.09f, 185.94f, 23.4f)
                curveTo(186.23f, 23.71f, 186.38f, 24.14f, 186.38f, 24.68f)
                curveTo(186.38f, 25.42f, 186.07f, 26.0f, 185.45f, 26.44f)
                curveTo(184.84f, 26.87f, 183.99f, 27.08f, 182.9f, 27.08f)
                close()
                moveTo(182.6f, 30.52f)
                curveTo(182.08f, 30.52f, 181.63f, 30.4f, 181.26f, 30.15f)
                lineTo(181.53f, 29.54f)
                curveTo(181.84f, 29.75f, 182.19f, 29.85f, 182.58f, 29.85f)
                curveTo(182.9f, 29.85f, 183.15f, 29.78f, 183.32f, 29.66f)
                curveTo(183.49f, 29.53f, 183.57f, 29.34f, 183.57f, 29.1f)
                curveTo(183.57f, 28.87f, 183.49f, 28.69f, 183.32f, 28.55f)
                curveTo(183.16f, 28.42f, 182.91f, 28.36f, 182.58f, 28.36f)
                horizontalLineTo(182.21f)
                lineTo(182.6f, 26.9f)
                horizontalLineTo(183.29f)
                lineTo(183.05f, 27.83f)
                curveTo(183.48f, 27.87f, 183.82f, 28.01f, 184.05f, 28.23f)
                curveTo(184.29f, 28.47f, 184.41f, 28.77f, 184.41f, 29.13f)
                curveTo(184.41f, 29.55f, 184.24f, 29.89f, 183.91f, 30.14f)
                curveTo(183.58f, 30.39f, 183.14f, 30.52f, 182.6f, 30.52f)
                close()
                moveTo(201.96f, 15.8f)
                verticalLineTo(23.75f)
                curveTo(201.96f, 25.35f, 201.54f, 26.57f, 200.71f, 27.42f)
                curveTo(199.88f, 28.26f, 198.73f, 28.68f, 197.25f, 28.68f)
                curveTo(196.34f, 28.68f, 195.51f, 28.53f, 194.77f, 28.23f)
                curveTo(194.05f, 27.94f, 193.44f, 27.52f, 192.95f, 26.97f)
                lineTo(193.49f, 26.06f)
                curveTo(194.44f, 27.1f, 195.7f, 27.62f, 197.25f, 27.62f)
                curveTo(198.41f, 27.62f, 199.28f, 27.3f, 199.88f, 26.66f)
                curveTo(200.48f, 26.02f, 200.77f, 25.06f, 200.77f, 23.78f)
                verticalLineTo(22.28f)
                curveTo(200.05f, 23.55f, 198.84f, 24.18f, 197.14f, 24.18f)
                curveTo(195.76f, 24.18f, 194.67f, 23.79f, 193.89f, 23.0f)
                curveTo(193.12f, 22.2f, 192.73f, 21.05f, 192.73f, 19.56f)
                verticalLineTo(15.8f)
                horizontalLineTo(193.91f)
                verticalLineTo(19.51f)
                curveTo(193.91f, 20.7f, 194.2f, 21.6f, 194.79f, 22.22f)
                curveTo(195.38f, 22.82f, 196.2f, 23.13f, 197.25f, 23.13f)
                curveTo(198.36f, 23.13f, 199.23f, 22.81f, 199.85f, 22.17f)
                curveTo(200.46f, 21.52f, 200.77f, 20.55f, 200.77f, 19.26f)
                verticalLineTo(15.8f)
                horizontalLineTo(201.96f)
                close()
                moveTo(212.95f, 18.58f)
                verticalLineTo(27.0f)
                horizontalLineTo(211.86f)
                verticalLineTo(25.34f)
                curveTo(211.52f, 25.9f, 211.07f, 26.33f, 210.5f, 26.63f)
                curveTo(209.95f, 26.93f, 209.32f, 27.08f, 208.62f, 27.08f)
                curveTo(207.83f, 27.08f, 207.11f, 26.9f, 206.47f, 26.54f)
                curveTo(205.83f, 26.17f, 205.33f, 25.67f, 204.97f, 25.02f)
                curveTo(204.6f, 24.37f, 204.42f, 23.62f, 204.42f, 22.79f)
                curveTo(204.42f, 21.96f, 204.6f, 21.22f, 204.97f, 20.57f)
                curveTo(205.33f, 19.92f, 205.83f, 19.42f, 206.47f, 19.06f)
                curveTo(207.11f, 18.7f, 207.83f, 18.52f, 208.62f, 18.52f)
                curveTo(209.3f, 18.52f, 209.91f, 18.66f, 210.46f, 18.95f)
                curveTo(211.01f, 19.23f, 211.46f, 19.64f, 211.82f, 20.18f)
                verticalLineTo(18.58f)
                horizontalLineTo(212.95f)
                close()
                moveTo(208.71f, 26.07f)
                curveTo(209.3f, 26.07f, 209.83f, 25.94f, 210.3f, 25.67f)
                curveTo(210.78f, 25.39f, 211.15f, 25.01f, 211.42f, 24.5f)
                curveTo(211.69f, 24.0f, 211.83f, 23.43f, 211.83f, 22.79f)
                curveTo(211.83f, 22.15f, 211.69f, 21.58f, 211.42f, 21.08f)
                curveTo(211.15f, 20.58f, 210.78f, 20.19f, 210.3f, 19.93f)
                curveTo(209.83f, 19.65f, 209.3f, 19.51f, 208.71f, 19.51f)
                curveTo(208.11f, 19.51f, 207.58f, 19.65f, 207.1f, 19.93f)
                curveTo(206.63f, 20.19f, 206.25f, 20.58f, 205.98f, 21.08f)
                curveTo(205.71f, 21.58f, 205.58f, 22.15f, 205.58f, 22.79f)
                curveTo(205.58f, 23.43f, 205.71f, 24.0f, 205.98f, 24.5f)
                curveTo(206.25f, 25.01f, 206.63f, 25.39f, 207.1f, 25.67f)
                curveTo(207.58f, 25.94f, 208.11f, 26.07f, 208.71f, 26.07f)
                close()
                moveTo(220.45f, 18.52f)
                curveTo(221.24f, 18.52f, 221.96f, 18.7f, 222.6f, 19.06f)
                curveTo(223.24f, 19.42f, 223.74f, 19.92f, 224.1f, 20.57f)
                curveTo(224.46f, 21.22f, 224.64f, 21.96f, 224.64f, 22.79f)
                curveTo(224.64f, 23.63f, 224.46f, 24.38f, 224.1f, 25.03f)
                curveTo(223.74f, 25.68f, 223.24f, 26.19f, 222.6f, 26.55f)
                curveTo(221.97f, 26.9f, 221.25f, 27.08f, 220.45f, 27.08f)
                curveTo(219.77f, 27.08f, 219.15f, 26.94f, 218.6f, 26.66f)
                curveTo(218.05f, 26.38f, 217.6f, 25.96f, 217.25f, 25.42f)
                verticalLineTo(30.1f)
                horizontalLineTo(216.12f)
                verticalLineTo(18.58f)
                horizontalLineTo(217.2f)
                verticalLineTo(20.25f)
                curveTo(217.54f, 19.69f, 217.99f, 19.27f, 218.55f, 18.97f)
                curveTo(219.11f, 18.67f, 219.75f, 18.52f, 220.45f, 18.52f)
                close()
                moveTo(220.37f, 26.07f)
                curveTo(220.96f, 26.07f, 221.49f, 25.94f, 221.97f, 25.67f)
                curveTo(222.45f, 25.39f, 222.82f, 25.01f, 223.09f, 24.5f)
                curveTo(223.37f, 24.0f, 223.51f, 23.43f, 223.51f, 22.79f)
                curveTo(223.51f, 22.15f, 223.37f, 21.59f, 223.09f, 21.1f)
                curveTo(222.82f, 20.59f, 222.45f, 20.21f, 221.97f, 19.93f)
                curveTo(221.49f, 19.65f, 220.96f, 19.51f, 220.37f, 19.51f)
                curveTo(219.77f, 19.51f, 219.24f, 19.65f, 218.76f, 19.93f)
                curveTo(218.29f, 20.21f, 217.91f, 20.59f, 217.63f, 21.1f)
                curveTo(217.37f, 21.59f, 217.24f, 22.15f, 217.24f, 22.79f)
                curveTo(217.24f, 23.43f, 217.37f, 24.0f, 217.63f, 24.5f)
                curveTo(217.91f, 25.01f, 218.29f, 25.39f, 218.76f, 25.67f)
                curveTo(219.24f, 25.94f, 219.77f, 26.07f, 220.37f, 26.07f)
                close()
                moveTo(226.96f, 18.58f)
                horizontalLineTo(228.1f)
                verticalLineTo(27.0f)
                horizontalLineTo(226.96f)
                verticalLineTo(18.58f)
                close()
                moveTo(235.54f, 18.52f)
                curveTo(236.6f, 18.52f, 237.44f, 18.83f, 238.06f, 19.45f)
                curveTo(238.68f, 20.06f, 239.0f, 20.95f, 239.0f, 22.12f)
                verticalLineTo(27.0f)
                horizontalLineTo(237.86f)
                verticalLineTo(22.23f)
                curveTo(237.86f, 21.36f, 237.65f, 20.69f, 237.21f, 20.23f)
                curveTo(236.77f, 19.77f, 236.15f, 19.54f, 235.34f, 19.54f)
                curveTo(234.43f, 19.54f, 233.71f, 19.82f, 233.18f, 20.36f)
                curveTo(232.65f, 20.89f, 232.39f, 21.63f, 232.39f, 22.58f)
                verticalLineTo(27.0f)
                horizontalLineTo(231.26f)
                verticalLineTo(18.58f)
                horizontalLineTo(232.34f)
                verticalLineTo(20.14f)
                curveTo(232.65f, 19.62f, 233.08f, 19.23f, 233.62f, 18.95f)
                curveTo(234.18f, 18.66f, 234.82f, 18.52f, 235.54f, 18.52f)
                close()
            }
        }
            .build()
        return _icLoginWithAccount!!
    }

private var _icLoginWithAccount: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcLoginWithAccount, contentDescription = null)
    }
}