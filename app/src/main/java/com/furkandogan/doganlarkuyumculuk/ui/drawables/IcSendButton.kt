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

public val Icons.IcSendButton: ImageVector
    get() {
        if (_icSendButton != null) {
            return _icSendButton!!
        }
        _icSendButton = Builder(
            name = "IcSendButton",
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
                fill = SolidColor(Color(0xFFF8F9F9)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(151.71f, 23.4f)
                horizontalLineTo(152.85f)
                verticalLineTo(29.0f)
                horizontalLineTo(151.81f)
                verticalLineTo(28.06f)
                curveTo(151.38f, 28.4f, 150.88f, 28.66f, 150.3f, 28.84f)
                curveTo(149.74f, 29.01f, 149.13f, 29.1f, 148.48f, 29.1f)
                curveTo(147.48f, 29.1f, 146.54f, 28.87f, 145.68f, 28.42f)
                curveTo(144.83f, 27.98f, 144.14f, 27.33f, 143.62f, 26.47f)
                curveTo(143.09f, 25.62f, 142.83f, 24.61f, 142.83f, 23.43f)
                curveTo(142.83f, 22.34f, 143.09f, 21.37f, 143.6f, 20.5f)
                curveTo(144.11f, 19.63f, 144.82f, 18.95f, 145.71f, 18.46f)
                curveTo(146.61f, 17.95f, 147.62f, 17.7f, 148.75f, 17.7f)
                curveTo(149.6f, 17.7f, 150.39f, 17.84f, 151.1f, 18.12f)
                curveTo(151.82f, 18.39f, 152.42f, 18.79f, 152.91f, 19.32f)
                lineTo(152.18f, 20.07f)
                curveTo(151.29f, 19.2f, 150.16f, 18.76f, 148.8f, 18.76f)
                curveTo(147.89f, 18.76f, 147.07f, 18.96f, 146.34f, 19.37f)
                curveTo(145.61f, 19.76f, 145.04f, 20.32f, 144.62f, 21.03f)
                curveTo(144.21f, 21.75f, 144.0f, 22.55f, 144.0f, 23.43f)
                curveTo(144.0f, 24.38f, 144.21f, 25.21f, 144.62f, 25.91f)
                curveTo(145.05f, 26.61f, 145.61f, 27.14f, 146.3f, 27.51f)
                curveTo(147.01f, 27.87f, 147.76f, 28.06f, 148.56f, 28.06f)
                curveTo(149.15f, 28.06f, 149.71f, 27.96f, 150.26f, 27.77f)
                curveTo(150.81f, 27.57f, 151.3f, 27.26f, 151.71f, 26.86f)
                verticalLineTo(23.4f)
                close()
                moveTo(158.95f, 29.08f)
                curveTo(158.14f, 29.08f, 157.41f, 28.9f, 156.76f, 28.54f)
                curveTo(156.11f, 28.16f, 155.59f, 27.65f, 155.22f, 27.0f)
                curveTo(154.85f, 26.35f, 154.66f, 25.61f, 154.66f, 24.79f)
                curveTo(154.66f, 23.97f, 154.85f, 23.23f, 155.22f, 22.58f)
                curveTo(155.59f, 21.93f, 156.11f, 21.43f, 156.76f, 21.06f)
                curveTo(157.41f, 20.7f, 158.14f, 20.52f, 158.95f, 20.52f)
                curveTo(159.76f, 20.52f, 160.49f, 20.7f, 161.14f, 21.06f)
                curveTo(161.79f, 21.43f, 162.3f, 21.93f, 162.66f, 22.58f)
                curveTo(163.03f, 23.23f, 163.22f, 23.97f, 163.22f, 24.79f)
                curveTo(163.22f, 25.61f, 163.03f, 26.35f, 162.66f, 27.0f)
                curveTo(162.3f, 27.65f, 161.79f, 28.16f, 161.14f, 28.54f)
                curveTo(160.49f, 28.9f, 159.76f, 29.08f, 158.95f, 29.08f)
                close()
                moveTo(158.95f, 28.07f)
                curveTo(159.55f, 28.07f, 160.08f, 27.94f, 160.55f, 27.67f)
                curveTo(161.03f, 27.39f, 161.4f, 27.01f, 161.67f, 26.5f)
                curveTo(161.94f, 26.0f, 162.07f, 25.43f, 162.07f, 24.79f)
                curveTo(162.07f, 24.15f, 161.94f, 23.58f, 161.67f, 23.08f)
                curveTo(161.4f, 22.58f, 161.03f, 22.19f, 160.55f, 21.93f)
                curveTo(160.08f, 21.65f, 159.55f, 21.51f, 158.95f, 21.51f)
                curveTo(158.35f, 21.51f, 157.81f, 21.65f, 157.33f, 21.93f)
                curveTo(156.86f, 22.19f, 156.49f, 22.58f, 156.21f, 23.08f)
                curveTo(155.95f, 23.58f, 155.81f, 24.15f, 155.81f, 24.79f)
                curveTo(155.81f, 25.43f, 155.95f, 26.0f, 156.21f, 26.5f)
                curveTo(156.49f, 27.01f, 156.86f, 27.39f, 157.33f, 27.67f)
                curveTo(157.81f, 27.94f, 158.35f, 28.07f, 158.95f, 28.07f)
                close()
                moveTo(157.51f, 18.9f)
                curveTo(157.32f, 18.9f, 157.15f, 18.84f, 157.01f, 18.71f)
                curveTo(156.88f, 18.58f, 156.82f, 18.42f, 156.82f, 18.22f)
                curveTo(156.82f, 18.02f, 156.88f, 17.86f, 157.01f, 17.74f)
                curveTo(157.15f, 17.6f, 157.32f, 17.53f, 157.51f, 17.53f)
                curveTo(157.69f, 17.53f, 157.85f, 17.6f, 157.99f, 17.74f)
                curveTo(158.13f, 17.86f, 158.2f, 18.02f, 158.2f, 18.22f)
                curveTo(158.2f, 18.41f, 158.13f, 18.57f, 157.99f, 18.71f)
                curveTo(157.86f, 18.84f, 157.7f, 18.9f, 157.51f, 18.9f)
                close()
                moveTo(160.36f, 18.9f)
                curveTo(160.16f, 18.9f, 160.0f, 18.84f, 159.86f, 18.71f)
                curveTo(159.73f, 18.57f, 159.67f, 18.41f, 159.67f, 18.22f)
                curveTo(159.67f, 18.02f, 159.74f, 17.86f, 159.88f, 17.74f)
                curveTo(160.02f, 17.6f, 160.18f, 17.53f, 160.36f, 17.53f)
                curveTo(160.55f, 17.53f, 160.71f, 17.6f, 160.84f, 17.74f)
                curveTo(160.98f, 17.86f, 161.04f, 18.02f, 161.04f, 18.22f)
                curveTo(161.04f, 18.42f, 160.98f, 18.58f, 160.84f, 18.71f)
                curveTo(160.71f, 18.84f, 160.55f, 18.9f, 160.36f, 18.9f)
                close()
                moveTo(169.38f, 20.52f)
                curveTo(170.43f, 20.52f, 171.27f, 20.83f, 171.89f, 21.45f)
                curveTo(172.52f, 22.06f, 172.83f, 22.95f, 172.83f, 24.12f)
                verticalLineTo(29.0f)
                horizontalLineTo(171.7f)
                verticalLineTo(24.23f)
                curveTo(171.7f, 23.36f, 171.48f, 22.69f, 171.04f, 22.23f)
                curveTo(170.6f, 21.77f, 169.98f, 21.54f, 169.17f, 21.54f)
                curveTo(168.26f, 21.54f, 167.54f, 21.82f, 167.01f, 22.36f)
                curveTo(166.49f, 22.89f, 166.23f, 23.63f, 166.23f, 24.58f)
                verticalLineTo(29.0f)
                horizontalLineTo(165.09f)
                verticalLineTo(20.58f)
                horizontalLineTo(166.18f)
                verticalLineTo(22.14f)
                curveTo(166.49f, 21.62f, 166.91f, 21.23f, 167.46f, 20.95f)
                curveTo(168.01f, 20.66f, 168.65f, 20.52f, 169.38f, 20.52f)
                close()
                moveTo(183.18f, 17.13f)
                verticalLineTo(29.0f)
                horizontalLineTo(182.09f)
                verticalLineTo(27.34f)
                curveTo(181.75f, 27.9f, 181.3f, 28.33f, 180.73f, 28.63f)
                curveTo(180.18f, 28.93f, 179.55f, 29.08f, 178.84f, 29.08f)
                curveTo(178.05f, 29.08f, 177.34f, 28.9f, 176.7f, 28.54f)
                curveTo(176.06f, 28.17f, 175.56f, 27.67f, 175.2f, 27.02f)
                curveTo(174.83f, 26.37f, 174.65f, 25.62f, 174.65f, 24.79f)
                curveTo(174.65f, 23.96f, 174.83f, 23.22f, 175.2f, 22.57f)
                curveTo(175.56f, 21.92f, 176.06f, 21.42f, 176.7f, 21.06f)
                curveTo(177.34f, 20.7f, 178.05f, 20.52f, 178.84f, 20.52f)
                curveTo(179.53f, 20.52f, 180.14f, 20.66f, 180.68f, 20.95f)
                curveTo(181.24f, 21.23f, 181.69f, 21.64f, 182.04f, 22.18f)
                verticalLineTo(17.13f)
                horizontalLineTo(183.18f)
                close()
                moveTo(178.94f, 28.07f)
                curveTo(179.53f, 28.07f, 180.05f, 27.94f, 180.52f, 27.67f)
                curveTo(181.0f, 27.39f, 181.38f, 27.01f, 181.64f, 26.5f)
                curveTo(181.92f, 26.0f, 182.06f, 25.43f, 182.06f, 24.79f)
                curveTo(182.06f, 24.15f, 181.92f, 23.58f, 181.64f, 23.08f)
                curveTo(181.38f, 22.58f, 181.0f, 22.19f, 180.52f, 21.93f)
                curveTo(180.05f, 21.65f, 179.53f, 21.51f, 178.94f, 21.51f)
                curveTo(178.34f, 21.51f, 177.8f, 21.65f, 177.32f, 21.93f)
                curveTo(176.85f, 22.19f, 176.48f, 22.58f, 176.2f, 23.08f)
                curveTo(175.94f, 23.58f, 175.8f, 24.15f, 175.8f, 24.79f)
                curveTo(175.8f, 25.43f, 175.94f, 26.0f, 176.2f, 26.5f)
                curveTo(176.48f, 27.01f, 176.85f, 27.39f, 177.32f, 27.67f)
                curveTo(177.8f, 27.94f, 178.34f, 28.07f, 178.94f, 28.07f)
                close()
                moveTo(189.49f, 28.07f)
                curveTo(190.02f, 28.07f, 190.5f, 27.98f, 190.93f, 27.8f)
                curveTo(191.38f, 27.61f, 191.76f, 27.33f, 192.07f, 26.97f)
                lineTo(192.71f, 27.7f)
                curveTo(192.34f, 28.15f, 191.87f, 28.49f, 191.32f, 28.73f)
                curveTo(190.76f, 28.96f, 190.15f, 29.08f, 189.48f, 29.08f)
                curveTo(188.61f, 29.08f, 187.85f, 28.9f, 187.17f, 28.54f)
                curveTo(186.5f, 28.16f, 185.98f, 27.65f, 185.6f, 27.0f)
                curveTo(185.23f, 26.35f, 185.04f, 25.61f, 185.04f, 24.79f)
                curveTo(185.04f, 23.97f, 185.22f, 23.23f, 185.57f, 22.58f)
                curveTo(185.94f, 21.93f, 186.43f, 21.43f, 187.06f, 21.06f)
                curveTo(187.69f, 20.7f, 188.4f, 20.52f, 189.21f, 20.52f)
                curveTo(189.95f, 20.52f, 190.62f, 20.69f, 191.22f, 21.03f)
                curveTo(191.83f, 21.37f, 192.31f, 21.85f, 192.66f, 22.46f)
                curveTo(193.02f, 23.06f, 193.22f, 23.76f, 193.24f, 24.54f)
                lineTo(186.32f, 25.88f)
                curveTo(186.54f, 26.56f, 186.92f, 27.1f, 187.48f, 27.5f)
                curveTo(188.04f, 27.88f, 188.71f, 28.07f, 189.49f, 28.07f)
                close()
                moveTo(189.21f, 21.5f)
                curveTo(188.62f, 21.5f, 188.09f, 21.63f, 187.62f, 21.91f)
                curveTo(187.16f, 22.18f, 186.8f, 22.56f, 186.53f, 23.05f)
                curveTo(186.28f, 23.53f, 186.15f, 24.08f, 186.15f, 24.71f)
                curveTo(186.15f, 24.87f, 186.15f, 24.99f, 186.16f, 25.06f)
                lineTo(192.1f, 23.91f)
                curveTo(191.97f, 23.21f, 191.65f, 22.63f, 191.13f, 22.18f)
                curveTo(190.6f, 21.73f, 189.96f, 21.5f, 189.21f, 21.5f)
                close()
                moveTo(196.19f, 22.23f)
                curveTo(196.45f, 21.67f, 196.85f, 21.24f, 197.37f, 20.95f)
                curveTo(197.9f, 20.66f, 198.56f, 20.52f, 199.34f, 20.52f)
                verticalLineTo(21.62f)
                lineTo(199.07f, 21.61f)
                curveTo(198.18f, 21.61f, 197.49f, 21.88f, 196.99f, 22.42f)
                curveTo(196.49f, 22.97f, 196.24f, 23.73f, 196.24f, 24.71f)
                verticalLineTo(29.0f)
                horizontalLineTo(195.1f)
                verticalLineTo(20.58f)
                horizontalLineTo(196.19f)
                verticalLineTo(22.23f)
                close()
            }
        }
            .build()
        return _icSendButton!!
    }

private var _icSendButton: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcSendButton, contentDescription = null)
    }
}
