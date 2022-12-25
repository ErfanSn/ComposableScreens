package ir.erfansn.composablescreens.music.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

internal val DarkColorScheme = darkColorScheme()

internal val LightColorScheme = lightColorScheme()

@Composable
internal fun MusicTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicTheme: Boolean = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val colorScheme = if (darkTheme) {
        if (dynamicTheme) dynamicDarkColorScheme(context) else DarkColorScheme
    } else {
        if (dynamicTheme) dynamicLightColorScheme(context) else LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = MusicShapes,
        typography = MusicTypography,
        content = content
    )
}
