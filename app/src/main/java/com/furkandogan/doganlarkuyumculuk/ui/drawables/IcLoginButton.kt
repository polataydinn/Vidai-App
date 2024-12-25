package com.furkandogan.doganlarkuyumculuk.ui.drawables

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

public val Icons.IcLoginButton: ImageVector
    get() {
        if (_icLoginButton != null) {
            return _icLoginButton!!
        }
        _icLoginButton = Builder(
            name = "IcLoginButton",
            defaultWidth = 343.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 343.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF007AFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.0f)
                lineTo(331.0f, 3.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 339.0f, 11.0f)
                lineTo(339.0f, 35.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 331.0f, 43.0f)
                lineTo(12.0f, 43.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 35.0f)
                lineTo(4.0f, 11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(146.21f, 23.4f)
                horizontalLineTo(147.35f)
                verticalLineTo(29.0f)
                horizontalLineTo(146.31f)
                verticalLineTo(28.06f)
                curveTo(145.88f, 28.4f, 145.38f, 28.66f, 144.8f, 28.84f)
                curveTo(144.24f, 29.01f, 143.63f, 29.1f, 142.98f, 29.1f)
                curveTo(141.98f, 29.1f, 141.04f, 28.87f, 140.18f, 28.42f)
                curveTo(139.33f, 27.98f, 138.64f, 27.33f, 138.12f, 26.47f)
                curveTo(137.59f, 25.62f, 137.33f, 24.61f, 137.33f, 23.43f)
                curveTo(137.33f, 22.34f, 137.59f, 21.37f, 138.1f, 20.5f)
                curveTo(138.61f, 19.63f, 139.32f, 18.95f, 140.21f, 18.46f)
                curveTo(141.11f, 17.95f, 142.12f, 17.7f, 143.25f, 17.7f)
                curveTo(144.1f, 17.7f, 144.89f, 17.84f, 145.6f, 18.12f)
                curveTo(146.32f, 18.39f, 146.92f, 18.79f, 147.41f, 19.32f)
                lineTo(146.68f, 20.07f)
                curveTo(145.79f, 19.2f, 144.66f, 18.76f, 143.3f, 18.76f)
                curveTo(142.39f, 18.76f, 141.57f, 18.96f, 140.84f, 19.37f)
                curveTo(140.11f, 19.76f, 139.54f, 20.32f, 139.12f, 21.03f)
                curveTo(138.71f, 21.75f, 138.5f, 22.55f, 138.5f, 23.43f)
                curveTo(138.5f, 24.38f, 138.71f, 25.21f, 139.12f, 25.91f)
                curveTo(139.55f, 26.61f, 140.11f, 27.14f, 140.8f, 27.51f)
                curveTo(141.51f, 27.87f, 142.26f, 28.06f, 143.06f, 28.06f)
                curveTo(143.65f, 28.06f, 144.21f, 27.96f, 144.76f, 27.77f)
                curveTo(145.31f, 27.57f, 145.8f, 27.26f, 146.21f, 26.86f)
                verticalLineTo(23.4f)
                close()
                moveTo(150.01f, 20.58f)
                horizontalLineTo(151.15f)
                verticalLineTo(29.0f)
                horizontalLineTo(150.01f)
                verticalLineTo(20.58f)
                close()
                moveTo(150.59f, 18.74f)
                curveTo(150.35f, 18.74f, 150.15f, 18.66f, 149.99f, 18.5f)
                curveTo(149.83f, 18.34f, 149.75f, 18.15f, 149.75f, 17.93f)
                curveTo(149.75f, 17.71f, 149.83f, 17.53f, 149.99f, 17.37f)
                curveTo(150.15f, 17.21f, 150.35f, 17.13f, 150.59f, 17.13f)
                curveTo(150.82f, 17.13f, 151.02f, 17.21f, 151.18f, 17.37f)
                curveTo(151.34f, 17.52f, 151.42f, 17.7f, 151.42f, 17.91f)
                curveTo(151.42f, 18.15f, 151.34f, 18.34f, 151.18f, 18.5f)
                curveTo(151.02f, 18.66f, 150.82f, 18.74f, 150.59f, 18.74f)
                close()
                moveTo(154.94f, 22.23f)
                curveTo(155.21f, 21.67f, 155.6f, 21.24f, 156.13f, 20.95f)
                curveTo(156.66f, 20.66f, 157.32f, 20.52f, 158.1f, 20.52f)
                verticalLineTo(21.62f)
                lineTo(157.82f, 21.61f)
                curveTo(156.94f, 21.61f, 156.24f, 21.88f, 155.74f, 22.42f)
                curveTo(155.24f, 22.97f, 154.99f, 23.73f, 154.99f, 24.71f)
                verticalLineTo(29.0f)
                horizontalLineTo(153.86f)
                verticalLineTo(20.58f)
                horizontalLineTo(154.94f)
                verticalLineTo(22.23f)
                close()
                moveTo(159.7f, 20.58f)
                horizontalLineTo(160.84f)
                verticalLineTo(29.0f)
                horizontalLineTo(159.7f)
                verticalLineTo(20.58f)
                close()
                moveTo(160.28f, 18.74f)
                curveTo(160.04f, 18.74f, 159.85f, 18.66f, 159.69f, 18.5f)
                curveTo(159.53f, 18.34f, 159.45f, 18.15f, 159.45f, 17.93f)
                curveTo(159.45f, 17.71f, 159.53f, 17.53f, 159.69f, 17.37f)
                curveTo(159.85f, 17.21f, 160.04f, 17.13f, 160.28f, 17.13f)
                curveTo(160.51f, 17.13f, 160.71f, 17.21f, 160.87f, 17.37f)
                curveTo(161.03f, 17.52f, 161.11f, 17.7f, 161.11f, 17.91f)
                curveTo(161.11f, 18.15f, 161.03f, 18.34f, 160.87f, 18.5f)
                curveTo(160.71f, 18.66f, 160.51f, 18.74f, 160.28f, 18.74f)
                close()
                moveTo(165.81f, 29.08f)
                curveTo(165.12f, 29.08f, 164.47f, 28.98f, 163.84f, 28.79f)
                curveTo(163.22f, 28.59f, 162.73f, 28.34f, 162.38f, 28.04f)
                lineTo(162.89f, 27.14f)
                curveTo(163.25f, 27.42f, 163.69f, 27.65f, 164.22f, 27.83f)
                curveTo(164.76f, 28.0f, 165.31f, 28.09f, 165.89f, 28.09f)
                curveTo(166.65f, 28.09f, 167.22f, 27.97f, 167.58f, 27.74f)
                curveTo(167.96f, 27.49f, 168.14f, 27.15f, 168.14f, 26.71f)
                curveTo(168.14f, 26.4f, 168.04f, 26.16f, 167.84f, 25.99f)
                curveTo(167.63f, 25.81f, 167.38f, 25.68f, 167.07f, 25.59f)
                curveTo(166.76f, 25.5f, 166.35f, 25.41f, 165.84f, 25.32f)
                curveTo(165.15f, 25.19f, 164.61f, 25.06f, 164.19f, 24.94f)
                curveTo(163.77f, 24.8f, 163.42f, 24.57f, 163.12f, 24.25f)
                curveTo(162.83f, 23.93f, 162.69f, 23.49f, 162.69f, 22.92f)
                curveTo(162.69f, 22.22f, 162.98f, 21.64f, 163.57f, 21.19f)
                curveTo(164.15f, 20.74f, 164.97f, 20.52f, 166.01f, 20.52f)
                curveTo(166.56f, 20.52f, 167.1f, 20.59f, 167.65f, 20.74f)
                curveTo(168.19f, 20.88f, 168.64f, 21.07f, 168.99f, 21.3f)
                lineTo(168.49f, 22.22f)
                curveTo(167.8f, 21.74f, 166.97f, 21.5f, 166.01f, 21.5f)
                curveTo(165.29f, 21.5f, 164.74f, 21.62f, 164.37f, 21.88f)
                curveTo(164.0f, 22.14f, 163.82f, 22.47f, 163.82f, 22.89f)
                curveTo(163.82f, 23.21f, 163.92f, 23.46f, 164.13f, 23.66f)
                curveTo(164.34f, 23.85f, 164.6f, 23.99f, 164.91f, 24.09f)
                curveTo(165.22f, 24.17f, 165.65f, 24.26f, 166.19f, 24.36f)
                curveTo(166.86f, 24.49f, 167.4f, 24.62f, 167.81f, 24.74f)
                curveTo(168.21f, 24.87f, 168.56f, 25.09f, 168.85f, 25.4f)
                curveTo(169.13f, 25.71f, 169.28f, 26.14f, 169.28f, 26.68f)
                curveTo(169.28f, 27.42f, 168.97f, 28.0f, 168.35f, 28.44f)
                curveTo(167.74f, 28.87f, 166.89f, 29.08f, 165.81f, 29.08f)
                close()
                moveTo(165.5f, 32.52f)
                curveTo(164.98f, 32.52f, 164.53f, 32.4f, 164.16f, 32.15f)
                lineTo(164.43f, 31.54f)
                curveTo(164.74f, 31.75f, 165.09f, 31.85f, 165.49f, 31.85f)
                curveTo(165.81f, 31.85f, 166.05f, 31.78f, 166.22f, 31.66f)
                curveTo(166.39f, 31.53f, 166.48f, 31.34f, 166.48f, 31.1f)
                curveTo(166.48f, 30.87f, 166.39f, 30.69f, 166.22f, 30.55f)
                curveTo(166.06f, 30.42f, 165.82f, 30.36f, 165.49f, 30.36f)
                horizontalLineTo(165.12f)
                lineTo(165.5f, 28.9f)
                horizontalLineTo(166.19f)
                lineTo(165.95f, 29.83f)
                curveTo(166.39f, 29.87f, 166.72f, 30.01f, 166.96f, 30.23f)
                curveTo(167.19f, 30.47f, 167.31f, 30.77f, 167.31f, 31.13f)
                curveTo(167.31f, 31.55f, 167.14f, 31.89f, 166.81f, 32.14f)
                curveTo(166.48f, 32.39f, 166.05f, 32.52f, 165.5f, 32.52f)
                close()
                moveTo(183.96f, 17.8f)
                verticalLineTo(25.75f)
                curveTo(183.96f, 27.35f, 183.54f, 28.57f, 182.71f, 29.42f)
                curveTo(181.88f, 30.26f, 180.73f, 30.68f, 179.26f, 30.68f)
                curveTo(178.34f, 30.68f, 177.51f, 30.53f, 176.78f, 30.23f)
                curveTo(176.05f, 29.94f, 175.44f, 29.52f, 174.95f, 28.97f)
                lineTo(175.5f, 28.06f)
                curveTo(176.45f, 29.1f, 177.7f, 29.62f, 179.26f, 29.62f)
                curveTo(180.41f, 29.62f, 181.28f, 29.3f, 181.88f, 28.66f)
                curveTo(182.48f, 28.02f, 182.78f, 27.06f, 182.78f, 25.78f)
                verticalLineTo(24.28f)
                curveTo(182.05f, 25.55f, 180.84f, 26.18f, 179.15f, 26.18f)
                curveTo(177.76f, 26.18f, 176.68f, 25.79f, 175.9f, 25.0f)
                curveTo(175.12f, 24.2f, 174.73f, 23.05f, 174.73f, 21.56f)
                verticalLineTo(17.8f)
                horizontalLineTo(175.91f)
                verticalLineTo(21.51f)
                curveTo(175.91f, 22.7f, 176.21f, 23.6f, 176.79f, 24.22f)
                curveTo(177.38f, 24.82f, 178.2f, 25.13f, 179.26f, 25.13f)
                curveTo(180.37f, 25.13f, 181.23f, 24.81f, 181.85f, 24.17f)
                curveTo(182.47f, 23.52f, 182.78f, 22.55f, 182.78f, 21.26f)
                verticalLineTo(17.8f)
                horizontalLineTo(183.96f)
                close()
                moveTo(194.51f, 20.58f)
                verticalLineTo(29.0f)
                horizontalLineTo(193.42f)
                verticalLineTo(27.34f)
                curveTo(193.07f, 27.9f, 192.62f, 28.33f, 192.06f, 28.63f)
                curveTo(191.5f, 28.93f, 190.87f, 29.08f, 190.17f, 29.08f)
                curveTo(189.38f, 29.08f, 188.66f, 28.9f, 188.02f, 28.54f)
                curveTo(187.38f, 28.17f, 186.88f, 27.67f, 186.52f, 27.02f)
                curveTo(186.16f, 26.37f, 185.98f, 25.62f, 185.98f, 24.79f)
                curveTo(185.98f, 23.96f, 186.16f, 23.22f, 186.52f, 22.57f)
                curveTo(186.88f, 21.92f, 187.38f, 21.42f, 188.02f, 21.06f)
                curveTo(188.66f, 20.7f, 189.38f, 20.52f, 190.17f, 20.52f)
                curveTo(190.85f, 20.52f, 191.46f, 20.66f, 192.01f, 20.95f)
                curveTo(192.56f, 21.23f, 193.02f, 21.64f, 193.37f, 22.18f)
                verticalLineTo(20.58f)
                horizontalLineTo(194.51f)
                close()
                moveTo(190.26f, 28.07f)
                curveTo(190.85f, 28.07f, 191.38f, 27.94f, 191.85f, 27.67f)
                curveTo(192.33f, 27.39f, 192.7f, 27.01f, 192.97f, 26.5f)
                curveTo(193.25f, 26.0f, 193.38f, 25.43f, 193.38f, 24.79f)
                curveTo(193.38f, 24.15f, 193.25f, 23.58f, 192.97f, 23.08f)
                curveTo(192.7f, 22.58f, 192.33f, 22.19f, 191.85f, 21.93f)
                curveTo(191.38f, 21.65f, 190.85f, 21.51f, 190.26f, 21.51f)
                curveTo(189.67f, 21.51f, 189.13f, 21.65f, 188.65f, 21.93f)
                curveTo(188.18f, 22.19f, 187.81f, 22.58f, 187.53f, 23.08f)
                curveTo(187.26f, 23.58f, 187.13f, 24.15f, 187.13f, 24.79f)
                curveTo(187.13f, 25.43f, 187.26f, 26.0f, 187.53f, 26.5f)
                curveTo(187.81f, 27.01f, 188.18f, 27.39f, 188.65f, 27.67f)
                curveTo(189.13f, 27.94f, 189.67f, 28.07f, 190.26f, 28.07f)
                close()
                moveTo(201.55f, 20.52f)
                curveTo(202.34f, 20.52f, 203.06f, 20.7f, 203.7f, 21.06f)
                curveTo(204.34f, 21.42f, 204.84f, 21.92f, 205.2f, 22.57f)
                curveTo(205.57f, 23.22f, 205.75f, 23.96f, 205.75f, 24.79f)
                curveTo(205.75f, 25.63f, 205.57f, 26.38f, 205.2f, 27.03f)
                curveTo(204.84f, 27.68f, 204.34f, 28.19f, 203.7f, 28.55f)
                curveTo(203.07f, 28.9f, 202.35f, 29.08f, 201.55f, 29.08f)
                curveTo(200.87f, 29.08f, 200.25f, 28.94f, 199.7f, 28.66f)
                curveTo(199.15f, 28.38f, 198.71f, 27.96f, 198.35f, 27.42f)
                verticalLineTo(32.1f)
                horizontalLineTo(197.22f)
                verticalLineTo(20.58f)
                horizontalLineTo(198.31f)
                verticalLineTo(22.25f)
                curveTo(198.65f, 21.69f, 199.1f, 21.27f, 199.65f, 20.97f)
                curveTo(200.22f, 20.67f, 200.85f, 20.52f, 201.55f, 20.52f)
                close()
                moveTo(201.47f, 28.07f)
                curveTo(202.06f, 28.07f, 202.59f, 27.94f, 203.07f, 27.67f)
                curveTo(203.55f, 27.39f, 203.93f, 27.01f, 204.19f, 26.5f)
                curveTo(204.47f, 26.0f, 204.61f, 25.43f, 204.61f, 24.79f)
                curveTo(204.61f, 24.15f, 204.47f, 23.59f, 204.19f, 23.1f)
                curveTo(203.93f, 22.59f, 203.55f, 22.21f, 203.07f, 21.93f)
                curveTo(202.59f, 21.65f, 202.06f, 21.51f, 201.47f, 21.51f)
                curveTo(200.88f, 21.51f, 200.34f, 21.65f, 199.86f, 21.93f)
                curveTo(199.39f, 22.21f, 199.02f, 22.59f, 198.74f, 23.1f)
                curveTo(198.47f, 23.59f, 198.34f, 24.15f, 198.34f, 24.79f)
                curveTo(198.34f, 25.43f, 198.47f, 26.0f, 198.74f, 26.5f)
                curveTo(199.02f, 27.01f, 199.39f, 27.39f, 199.86f, 27.67f)
                curveTo(200.34f, 27.94f, 200.88f, 28.07f, 201.47f, 28.07f)
                close()
            }
        }
            .build()
        return _icLoginButton!!
    }

private var _icLoginButton: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcLoginButton, contentDescription = null)
    }
}
