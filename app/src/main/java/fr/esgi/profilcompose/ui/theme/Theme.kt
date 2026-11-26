package fr.esgi.profilcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val LightColors = lightColorScheme(
    primary = Color(0xFF255944),
    onPrimary = Color.White,
    primaryContainer = Color(0xFF1B4033),
    onPrimaryContainer = Color(0xFFF2FAEF),
    secondaryContainer = Color(0xFFE0ECE0),
    onSecondaryContainer = Color(0xFF254636),
    tertiaryContainer = Color(0xFFDAF1AA),
    onTertiaryContainer = Color(0xFF2E411D),
    background = Color(0xFFF2F6EF),
    onBackground = Color(0xFF1A2A21),
    surface = Color(0xFFF2F6EF),
    onSurface = Color(0xFF1A2A21),
    onSurfaceVariant = Color(0xFF4C6154),
    surfaceContainerLow = Color(0xFFFCFEFA),
    outline = Color(0xFF708376),
    outlineVariant = Color(0xFFD9E3D8)
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFBDE79E),
    onPrimary = Color(0xFF213618),
    primaryContainer = Color(0xFF224737),
    onPrimaryContainer = Color(0xFFF2FAEF),
    secondaryContainer = Color(0xFF2E4337),
    onSecondaryContainer = Color(0xFFD2EAD7),
    tertiaryContainer = Color(0xFFD2EBA4),
    onTertiaryContainer = Color(0xFF2B3D18),
    background = Color(0xFF111C17),
    onBackground = Color(0xFFE7F2E7),
    surface = Color(0xFF111C17),
    onSurface = Color(0xFFE7F2E7),
    onSurfaceVariant = Color(0xFFB7CABD),
    surfaceContainerLow = Color(0xFF1C2B22),
    outline = Color(0xFF899F91),
    outlineVariant = Color(0xFF364B3E)
)

private val ProfileTypography = Typography(
    headlineLarge = TextStyle(
        fontSize = 36.sp,
        lineHeight = 42.sp,
        letterSpacing = (-0.8).sp,
        fontWeight = FontWeight.Bold
    ),
    titleLarge = TextStyle(
        fontSize = 23.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight.Bold
    ),
    titleMedium = TextStyle(
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontWeight = FontWeight.SemiBold
    ),
    bodyLarge = TextStyle(fontSize = 16.sp, lineHeight = 23.sp),
    bodyMedium = TextStyle(fontSize = 14.sp, lineHeight = 20.sp),
    labelLarge = TextStyle(fontSize = 14.sp, lineHeight = 20.sp, fontWeight = FontWeight.SemiBold),
    labelMedium = TextStyle(fontSize = 12.sp, lineHeight = 16.sp, fontWeight = FontWeight.SemiBold)
)

private val ProfileShapes = Shapes(
    small = RoundedCornerShape(10.dp),
    medium = RoundedCornerShape(14.dp),
    large = RoundedCornerShape(18.dp),
    extraLarge = RoundedCornerShape(26.dp)
)

@Composable
fun ProfilComposeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) DarkColors else LightColors,
        typography = ProfileTypography,
        shapes = ProfileShapes,
        content = content
    )
}
