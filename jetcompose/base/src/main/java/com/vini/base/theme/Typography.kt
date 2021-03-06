package com.vini.base.theme
import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.vini.base.R

private val poppinsDisplayFontFamily = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_black, FontWeight.Black)
)

internal val typography = Typography(
    defaultFontFamily = poppinsDisplayFontFamily,
    h1 = TextStyle(fontSize = 64.sp, fontWeight = FontWeight.Black),
    h2 = TextStyle(fontSize = 48.sp, fontWeight = FontWeight.Black),
    h3 = TextStyle(fontSize = 36.sp, fontWeight = FontWeight.Bold),
    h4 = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
    h5 = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold),
    h6 = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
    body1 = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
    body2 = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Medium),
    subtitle1 = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
    subtitle2 = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Medium),
    button = TextStyle(fontWeight = FontWeight.Medium),
    overline = TextStyle(fontWeight = FontWeight.Medium),
)