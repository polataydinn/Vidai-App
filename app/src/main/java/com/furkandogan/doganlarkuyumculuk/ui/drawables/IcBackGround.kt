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
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

public val Icons.IcBackGround: ImageVector
    get() {
        if (_icBackGround != null) {
            return _icBackGround!!
        }
        _icBackGround = Builder(
            name = "IcBackGround",
            defaultWidth = 375.0.dp,
            defaultHeight = 812.0.dp,
            viewportWidth = 375.0f,
            viewportHeight = 812.0f
        ).apply {
            group {
                path(
                    fill = linearGradient(
                        0.1f to Color(0xFF007AFF), 1.0f to Color(0xFF004999),
                        start = Offset(187.5f, 0.0f), end = Offset(187.5f, 812.0f)
                    ), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
                ) {
                    moveTo(25.0f, 0.0f)
                    lineTo(350.0f, 0.0f)
                    arcTo(25.0f, 25.0f, 0.0f, false, true, 375.0f, 25.0f)
                    lineTo(375.0f, 787.0f)
                    arcTo(25.0f, 25.0f, 0.0f, false, true, 350.0f, 812.0f)
                    lineTo(25.0f, 812.0f)
                    arcTo(25.0f, 25.0f, 0.0f, false, true, 0.0f, 787.0f)
                    lineTo(0.0f, 25.0f)
                    arcTo(25.0f, 25.0f, 0.0f, false, true, 25.0f, 0.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6BB2FF)), stroke = null, strokeLineWidth =
                    0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
                    4.0f, pathFillType = EvenOdd
                ) {
                    moveTo(147.19f, 350.58f)
                    curveTo(146.48f, 350.23f, 145.65f, 349.94f, 144.67f, 349.67f)
                    curveTo(145.65f, 349.39f, 146.48f, 349.1f, 147.19f, 348.76f)
                    curveTo(148.71f, 348.03f, 149.68f, 347.06f, 150.42f, 345.54f)
                    curveTo(150.77f, 344.82f, 151.06f, 343.99f, 151.33f, 343.0f)
                    curveTo(151.61f, 343.99f, 151.9f, 344.83f, 152.24f, 345.54f)
                    curveTo(152.98f, 347.07f, 153.96f, 348.03f, 155.47f, 348.76f)
                    curveTo(156.18f, 349.1f, 157.02f, 349.39f, 158.0f, 349.67f)
                    curveTo(157.02f, 349.94f, 156.18f, 350.23f, 155.47f, 350.58f)
                    curveTo(153.96f, 351.31f, 152.98f, 352.27f, 152.24f, 353.8f)
                    curveTo(151.9f, 354.51f, 151.61f, 355.34f, 151.33f, 356.33f)
                    curveTo(151.06f, 355.34f, 150.77f, 354.51f, 150.42f, 353.8f)
                    curveTo(149.68f, 352.27f, 148.71f, 351.31f, 147.19f, 350.58f)
                    close()
                    moveTo(150.27f, 350.7f)
                    curveTo(149.88f, 350.31f, 149.44f, 349.96f, 148.98f, 349.67f)
                    curveTo(149.44f, 349.37f, 149.88f, 349.02f, 150.27f, 348.63f)
                    curveTo(150.67f, 348.23f, 151.03f, 347.79f, 151.33f, 347.32f)
                    curveTo(151.64f, 347.79f, 152.0f, 348.23f, 152.4f, 348.64f)
                    curveTo(152.79f, 349.03f, 153.22f, 349.37f, 153.69f, 349.67f)
                    curveTo(153.22f, 349.97f, 152.79f, 350.31f, 152.4f, 350.7f)
                    curveTo(152.0f, 351.1f, 151.64f, 351.54f, 151.33f, 352.02f)
                    curveTo(151.03f, 351.54f, 150.67f, 351.1f, 150.27f, 350.7f)
                    moveTo(130.75f, 362.22f)
                    curveTo(129.85f, 361.89f, 128.93f, 361.59f, 128.0f, 361.33f)
                    curveTo(128.93f, 361.08f, 129.85f, 360.78f, 130.75f, 360.45f)
                    curveTo(134.99f, 358.86f, 137.18f, 356.72f, 138.78f, 352.44f)
                    curveTo(139.12f, 351.53f, 139.41f, 350.6f, 139.67f, 349.67f)
                    curveTo(139.92f, 350.6f, 140.22f, 351.53f, 140.55f, 352.44f)
                    curveTo(142.16f, 356.72f, 144.35f, 358.86f, 148.58f, 360.45f)
                    curveTo(149.41f, 360.76f, 150.33f, 361.05f, 151.33f, 361.33f)
                    curveTo(150.4f, 361.59f, 149.49f, 361.89f, 148.58f, 362.22f)
                    curveTo(144.34f, 363.81f, 142.16f, 365.95f, 140.55f, 370.23f)
                    curveTo(140.22f, 371.14f, 139.92f, 372.06f, 139.67f, 373.0f)
                    curveTo(139.41f, 372.06f, 139.12f, 371.14f, 138.78f, 370.23f)
                    curveTo(137.18f, 365.95f, 134.99f, 363.81f, 130.75f, 362.22f)
                    close()
                    moveTo(136.92f, 364.03f)
                    curveTo(135.8f, 362.92f, 134.49f, 362.05f, 132.95f, 361.33f)
                    curveTo(134.49f, 360.61f, 135.8f, 359.75f, 136.92f, 358.64f)
                    curveTo(138.05f, 357.52f, 138.93f, 356.2f, 139.67f, 354.63f)
                    curveTo(140.4f, 356.2f, 141.28f, 357.52f, 142.41f, 358.64f)
                    curveTo(143.53f, 359.75f, 144.84f, 360.61f, 146.38f, 361.33f)
                    curveTo(144.84f, 362.05f, 143.53f, 362.92f, 142.41f, 364.03f)
                    curveTo(141.28f, 365.15f, 140.4f, 366.47f, 139.67f, 368.03f)
                    curveTo(138.93f, 366.47f, 138.05f, 365.15f, 136.92f, 364.03f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0x00000000)), stroke =
                    SolidColor(Color(0xFF6BB2FF)), fillAlpha = 0.3f, strokeAlpha = 0.3f,
                    strokeLineWidth = 3.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero
                ) {
                    moveTo(69.53f, 230.23f)
                    curveTo(82.62f, 251.65f, 86.45f, 271.06f, 77.53f, 279.97f)
                    curveTo(64.22f, 293.28f, 27.57f, 278.22f, -4.32f, 246.32f)
                    curveTo(-36.21f, 214.44f, -51.28f, 177.79f, -37.97f, 164.48f)
                    curveTo(-29.05f, 155.57f, -9.65f, 159.39f, 11.78f, 172.49f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)), stroke =
                    SolidColor(Color(0xFF6BB2FF)), fillAlpha = 0.3f, strokeAlpha = 0.3f,
                    strokeLineWidth = 3.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero
                ) {
                    moveTo(8.79f, 175.47f)
                    curveTo(16.04f, 168.23f, 25.86f, 164.16f, 36.1f, 164.16f)
                    curveTo(46.34f, 164.16f, 56.16f, 168.23f, 63.4f, 175.47f)
                    lineTo(66.54f, 178.6f)
                    curveTo(73.78f, 185.84f, 77.85f, 195.66f, 77.85f, 205.9f)
                    curveTo(77.85f, 216.15f, 73.78f, 225.97f, 66.54f, 233.21f)
                    curveTo(65.51f, 234.24f, 64.2f, 234.93f, 62.78f, 234.67f)
                    curveTo(58.72f, 233.93f, 48.75f, 230.09f, 30.32f, 211.68f)
                    curveTo(11.91f, 193.25f, 8.06f, 183.28f, 7.33f, 179.22f)
                    curveTo(7.09f, 177.8f, 7.77f, 176.49f, 8.79f, 175.47f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6BB2FF)), stroke = null, fillAlpha = 0.3f,
                    strokeAlpha = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    NonZero
                ) {
                    moveTo(7.23f, 234.77f)
                    curveTo(10.41f, 237.96f, 15.59f, 237.96f, 18.77f, 234.77f)
                    curveTo(21.96f, 231.59f, 21.96f, 226.41f, 18.77f, 223.23f)
                    curveTo(15.59f, 220.04f, 10.41f, 220.04f, 7.23f, 223.23f)
                    curveTo(4.04f, 226.41f, 4.04f, 231.59f, 7.23f, 234.77f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6BB2FF)), stroke = null, fillAlpha = 0.3f,
                    strokeAlpha = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    NonZero
                ) {
                    moveTo(-15.88f, 200.12f)
                    curveTo(-12.69f, 203.31f, -7.52f, 203.31f, -4.33f, 200.12f)
                    curveTo(-1.14f, 196.93f, -1.14f, 191.76f, -4.33f, 188.57f)
                    curveTo(-7.52f, 185.38f, -12.69f, 185.38f, -15.88f, 188.57f)
                    curveTo(-19.07f, 191.76f, -19.07f, 196.93f, -15.88f, 200.12f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6BB2FF)), stroke = null, fillAlpha = 0.3f,
                    strokeAlpha = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    NonZero
                ) {
                    moveTo(41.88f, 257.87f)
                    curveTo(45.07f, 261.06f, 50.24f, 261.06f, 53.43f, 257.87f)
                    curveTo(56.62f, 254.68f, 56.62f, 249.51f, 53.43f, 246.32f)
                    curveTo(50.24f, 243.13f, 45.07f, 243.13f, 41.88f, 246.32f)
                    curveTo(38.69f, 249.51f, 38.69f, 254.68f, 41.88f, 257.87f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0x00000000)), stroke =
                    SolidColor(Color(0xFF6BB2FF)), fillAlpha = 0.3f, strokeAlpha = 0.3f,
                    strokeLineWidth = 3.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero
                ) {
                    moveTo(-55.31f, 297.31f)
                    lineTo(-21.65f, 263.64f)
                    moveTo(-3.33f, 310.67f)
                    lineTo(18.77f, 292.52f)
                    moveTo(-68.67f, 245.33f)
                    lineTo(-50.52f, 223.23f)
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF6BB2FF)), stroke = null, fillAlpha = 0.3f,
                    strokeAlpha = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    EvenOdd
                ) {
                    moveTo(380.03f, 123.79f)
                    curveTo(379.78f, 122.99f, 379.51f, 122.82f, 379.46f, 122.79f)
                    curveTo(379.41f, 122.76f, 379.12f, 122.61f, 378.3f, 122.79f)
                    curveTo(377.04f, 123.14f, 375.85f, 123.69f, 374.78f, 124.43f)
                    curveTo(371.79f, 126.31f, 368.07f, 129.63f, 363.84f, 134.23f)
                    curveTo(359.08f, 139.41f, 353.84f, 146.08f, 348.49f, 153.83f)
                    curveTo(350.79f, 157.21f, 353.08f, 160.77f, 355.38f, 164.49f)
                    curveTo(359.76f, 164.62f, 363.98f, 164.83f, 368.06f, 165.12f)
                    curveTo(372.1f, 156.62f, 375.24f, 148.75f, 377.36f, 142.04f)
                    curveTo(379.23f, 136.07f, 380.23f, 131.19f, 380.38f, 127.66f)
                    curveTo(380.48f, 126.36f, 380.36f, 125.05f, 380.03f, 123.79f)
                    close()
                    moveTo(351.72f, 164.41f)
                    curveTo(350.06f, 161.76f, 348.37f, 159.15f, 346.63f, 156.56f)
                    curveTo(344.94f, 159.08f, 343.24f, 161.69f, 341.55f, 164.4f)
                    curveTo(344.94f, 164.35f, 348.33f, 164.35f, 351.72f, 164.4f)
                    moveTo(346.63f, 151.12f)
                    curveTo(361.41f, 129.92f, 375.36f, 116.88f, 380.99f, 120.13f)
                    curveTo(386.62f, 123.38f, 382.3f, 141.99f, 371.33f, 165.39f)
                    curveTo(397.1f, 167.59f, 415.38f, 173.15f, 415.38f, 179.66f)
                    curveTo(415.38f, 186.16f, 397.1f, 191.7f, 371.34f, 193.9f)
                    curveTo(382.31f, 217.31f, 386.66f, 235.91f, 381.02f, 239.16f)
                    curveTo(375.39f, 242.41f, 361.44f, 229.36f, 346.64f, 208.15f)
                    curveTo(331.86f, 229.35f, 317.92f, 242.4f, 312.28f, 239.14f)
                    curveTo(306.64f, 235.89f, 310.98f, 217.29f, 321.94f, 193.88f)
                    curveTo(296.17f, 191.67f, 277.89f, 186.12f, 277.89f, 179.62f)
                    curveTo(277.89f, 173.11f, 296.17f, 167.57f, 321.93f, 165.37f)
                    curveTo(310.95f, 141.96f, 306.61f, 123.36f, 312.25f, 120.11f)
                    curveTo(317.88f, 116.86f, 331.83f, 129.92f, 346.63f, 151.12f)
                    close()
                    moveTo(325.2f, 165.11f)
                    curveTo(321.16f, 156.6f, 318.0f, 148.73f, 315.89f, 142.02f)
                    curveTo(314.02f, 136.06f, 313.01f, 131.17f, 312.87f, 127.63f)
                    curveTo(312.77f, 126.34f, 312.88f, 125.03f, 313.21f, 123.78f)
                    curveTo(313.46f, 122.97f, 313.73f, 122.79f, 313.79f, 122.78f)
                    curveTo(313.83f, 122.74f, 314.11f, 122.59f, 314.94f, 122.78f)
                    curveTo(315.78f, 122.97f, 316.96f, 123.46f, 318.46f, 124.41f)
                    curveTo(321.45f, 126.31f, 325.18f, 129.62f, 329.41f, 134.22f)
                    curveTo(334.17f, 139.41f, 339.41f, 146.07f, 344.77f, 153.83f)
                    curveTo(342.4f, 157.33f, 340.1f, 160.88f, 337.88f, 164.48f)
                    curveTo(333.51f, 164.61f, 329.28f, 164.82f, 325.2f, 165.11f)
                    close()
                    moveTo(323.34f, 168.34f)
                    curveTo(313.95f, 169.1f, 305.55f, 170.29f, 298.69f, 171.82f)
                    curveTo(292.59f, 173.18f, 287.85f, 174.75f, 284.72f, 176.39f)
                    curveTo(283.15f, 177.22f, 282.13f, 177.98f, 281.55f, 178.62f)
                    curveTo(280.97f, 179.24f, 280.96f, 179.56f, 280.97f, 179.62f)
                    curveTo(280.96f, 179.67f, 280.97f, 179.99f, 281.55f, 180.62f)
                    curveTo(282.14f, 181.25f, 283.15f, 182.02f, 284.72f, 182.85f)
                    curveTo(287.86f, 184.49f, 292.59f, 186.07f, 298.69f, 187.42f)
                    curveTo(305.56f, 188.95f, 313.96f, 190.16f, 323.35f, 190.93f)
                    curveTo(325.2f, 187.12f, 327.13f, 183.35f, 329.14f, 179.63f)
                    curveTo(327.12f, 175.91f, 325.19f, 172.15f, 323.34f, 168.34f)
                    close()
                    moveTo(330.89f, 176.42f)
                    curveTo(329.43f, 173.67f, 328.01f, 170.89f, 326.64f, 168.09f)
                    curveTo(329.67f, 167.88f, 332.78f, 167.73f, 335.98f, 167.61f)
                    curveTo(334.24f, 170.52f, 332.54f, 173.46f, 330.89f, 176.42f)
                    close()
                    moveTo(332.64f, 179.63f)
                    curveTo(334.88f, 175.54f, 337.21f, 171.5f, 339.63f, 167.51f)
                    curveTo(344.3f, 167.41f, 348.97f, 167.41f, 353.64f, 167.51f)
                    curveTo(356.06f, 171.5f, 358.39f, 175.55f, 360.64f, 179.64f)
                    curveTo(358.4f, 183.73f, 356.07f, 187.77f, 353.64f, 191.76f)
                    curveTo(348.97f, 191.86f, 344.3f, 191.86f, 339.64f, 191.76f)
                    curveTo(337.21f, 187.77f, 334.88f, 183.72f, 332.64f, 179.63f)
                    close()
                    moveTo(330.9f, 182.85f)
                    curveTo(329.4f, 185.67f, 327.98f, 188.44f, 326.65f, 191.17f)
                    curveTo(329.67f, 191.38f, 332.78f, 191.54f, 335.99f, 191.65f)
                    curveTo(334.25f, 188.74f, 332.55f, 185.8f, 330.9f, 182.84f)
                    moveTo(337.9f, 194.77f)
                    curveTo(333.52f, 194.65f, 329.29f, 194.44f, 325.22f, 194.14f)
                    curveTo(321.18f, 202.65f, 318.03f, 210.52f, 315.92f, 217.23f)
                    curveTo(314.05f, 223.19f, 313.04f, 228.08f, 312.9f, 231.61f)
                    curveTo(312.83f, 233.38f, 312.98f, 234.64f, 313.25f, 235.47f)
                    curveTo(313.49f, 236.28f, 313.77f, 236.45f, 313.82f, 236.48f)
                    curveTo(313.87f, 236.51f, 314.15f, 236.65f, 314.97f, 236.47f)
                    curveTo(315.83f, 236.28f, 317.0f, 235.78f, 318.49f, 234.84f)
                    curveTo(321.49f, 232.95f, 325.21f, 229.64f, 329.44f, 225.03f)
                    curveTo(334.19f, 219.85f, 339.43f, 213.19f, 344.78f, 205.44f)
                    curveTo(342.41f, 201.94f, 340.11f, 198.38f, 337.89f, 194.78f)
                    moveTo(348.5f, 205.44f)
                    curveTo(353.86f, 213.2f, 359.11f, 219.87f, 363.86f, 225.05f)
                    curveTo(368.09f, 229.66f, 371.82f, 232.97f, 374.81f, 234.86f)
                    curveTo(376.31f, 235.8f, 377.48f, 236.3f, 378.33f, 236.5f)
                    curveTo(379.16f, 236.68f, 379.44f, 236.52f, 379.49f, 236.5f)
                    curveTo(379.53f, 236.48f, 379.8f, 236.31f, 380.07f, 235.5f)
                    curveTo(380.39f, 234.24f, 380.5f, 232.93f, 380.4f, 231.64f)
                    curveTo(380.26f, 228.1f, 379.25f, 223.21f, 377.37f, 217.25f)
                    curveTo(375.26f, 210.55f, 372.11f, 202.68f, 368.06f, 194.16f)
                    curveTo(363.99f, 194.45f, 359.77f, 194.66f, 355.39f, 194.79f)
                    curveTo(353.17f, 198.39f, 350.88f, 201.94f, 348.5f, 205.44f)
                    close()
                    moveTo(369.92f, 190.93f)
                    curveTo(379.33f, 190.18f, 387.71f, 188.98f, 394.58f, 187.45f)
                    curveTo(400.68f, 186.1f, 405.42f, 184.52f, 408.55f, 182.88f)
                    curveTo(410.12f, 182.05f, 411.13f, 181.29f, 411.72f, 180.65f)
                    curveTo(412.3f, 180.03f, 412.31f, 179.71f, 412.3f, 179.66f)
                    curveTo(412.31f, 179.6f, 412.3f, 179.28f, 411.73f, 178.65f)
                    curveTo(410.8f, 177.74f, 409.72f, 176.98f, 408.55f, 176.42f)
                    curveTo(405.42f, 174.78f, 400.68f, 173.21f, 394.57f, 171.85f)
                    curveTo(387.71f, 170.32f, 379.32f, 169.12f, 369.92f, 168.35f)
                    curveTo(368.14f, 172.02f, 366.21f, 175.81f, 364.14f, 179.64f)
                    curveTo(366.21f, 183.49f, 368.14f, 187.25f, 369.92f, 190.93f)
                    close()
                    moveTo(362.37f, 182.86f)
                    curveTo(363.87f, 185.68f, 365.29f, 188.45f, 366.63f, 191.18f)
                    curveTo(363.6f, 191.39f, 360.49f, 191.55f, 357.29f, 191.66f)
                    curveTo(359.03f, 188.75f, 360.73f, 185.82f, 362.38f, 182.85f)
                    moveTo(362.38f, 176.43f)
                    curveTo(363.88f, 173.6f, 365.3f, 170.83f, 366.63f, 168.1f)
                    curveTo(363.61f, 167.89f, 360.5f, 167.73f, 357.3f, 167.62f)
                    curveTo(359.04f, 170.53f, 360.73f, 173.47f, 362.38f, 176.43f)
                    close()
                    moveTo(346.65f, 202.71f)
                    curveTo(344.96f, 200.2f, 343.26f, 197.58f, 341.57f, 194.86f)
                    curveTo(344.96f, 194.92f, 348.35f, 194.92f, 351.74f, 194.86f)
                    curveTo(350.04f, 197.58f, 348.35f, 200.19f, 346.65f, 202.71f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6BB2FF)), stroke = null, fillAlpha = 0.3f,
                    strokeAlpha = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    EvenOdd
                ) {
                    moveTo(318.23f, 141.02f)
                    curveTo(319.33f, 141.66f, 320.14f, 142.71f, 320.48f, 143.95f)
                    curveTo(320.81f, 145.19f, 320.63f, 146.51f, 319.99f, 147.62f)
                    curveTo(319.35f, 148.73f, 318.3f, 149.54f, 317.06f, 149.87f)
                    curveTo(315.82f, 150.2f, 314.5f, 150.02f, 313.39f, 149.38f)
                    curveTo(312.29f, 148.74f, 311.48f, 147.69f, 311.14f, 146.45f)
                    curveTo(310.81f, 145.21f, 310.99f, 143.9f, 311.63f, 142.79f)
                    curveTo(312.27f, 141.68f, 313.32f, 140.87f, 314.56f, 140.54f)
                    curveTo(315.8f, 140.2f, 317.12f, 140.38f, 318.23f, 141.02f)
                    close()
                    moveTo(393.02f, 165.08f)
                    curveTo(393.59f, 165.38f, 394.1f, 165.8f, 394.51f, 166.3f)
                    curveTo(394.92f, 166.81f, 395.23f, 167.39f, 395.4f, 168.01f)
                    curveTo(395.59f, 168.64f, 395.64f, 169.29f, 395.56f, 169.94f)
                    curveTo(395.48f, 170.59f, 395.27f, 171.21f, 394.95f, 171.77f)
                    curveTo(394.62f, 172.34f, 394.19f, 172.83f, 393.67f, 173.22f)
                    curveTo(393.15f, 173.61f, 392.55f, 173.89f, 391.92f, 174.05f)
                    curveTo(391.29f, 174.21f, 390.63f, 174.23f, 389.99f, 174.13f)
                    curveTo(389.35f, 174.03f, 388.73f, 173.79f, 388.18f, 173.45f)
                    curveTo(387.12f, 172.78f, 386.36f, 171.73f, 386.06f, 170.52f)
                    curveTo(385.76f, 169.3f, 385.94f, 168.02f, 386.57f, 166.93f)
                    curveTo(387.19f, 165.85f, 388.21f, 165.05f, 389.42f, 164.71f)
                    curveTo(390.62f, 164.36f, 391.91f, 164.49f, 393.02f, 165.08f)
                    close()
                    moveTo(318.16f, 209.48f)
                    curveTo(319.27f, 210.12f, 320.08f, 211.18f, 320.42f, 212.41f)
                    curveTo(320.75f, 213.65f, 320.57f, 214.97f, 319.93f, 216.08f)
                    curveTo(319.29f, 217.19f, 318.24f, 218.0f, 317.0f, 218.33f)
                    curveTo(315.76f, 218.67f, 314.44f, 218.49f, 313.33f, 217.85f)
                    curveTo(312.22f, 217.21f, 311.41f, 216.15f, 311.08f, 214.92f)
                    curveTo(310.75f, 213.68f, 310.92f, 212.36f, 311.56f, 211.25f)
                    curveTo(312.2f, 210.14f, 313.26f, 209.33f, 314.5f, 209.0f)
                    curveTo(315.73f, 208.66f, 317.05f, 208.84f, 318.16f, 209.48f)
                    close()
                    moveTo(350.51f, 172.38f)
                    curveTo(352.39f, 173.47f, 353.77f, 175.26f, 354.33f, 177.35f)
                    curveTo(354.89f, 179.45f, 354.59f, 181.68f, 353.51f, 183.57f)
                    curveTo(352.42f, 185.44f, 350.64f, 186.82f, 348.54f, 187.38f)
                    curveTo(346.44f, 187.94f, 344.21f, 187.65f, 342.33f, 186.56f)
                    curveTo(340.45f, 185.48f, 339.08f, 183.69f, 338.52f, 181.59f)
                    curveTo(337.95f, 179.49f, 338.25f, 177.26f, 339.33f, 175.38f)
                    curveTo(340.42f, 173.5f, 342.21f, 172.13f, 344.3f, 171.57f)
                    curveTo(346.4f, 171.01f, 348.63f, 171.3f, 350.51f, 172.38f)
                    close()
                }
            }
        }
            .build()
        return _icBackGround!!
    }

private var _icBackGround: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Icons.IcBackGround, contentDescription = null)
    }
}
