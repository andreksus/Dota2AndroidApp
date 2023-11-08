package com.example.dota2androidapp.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.example.dota2androidapp.R

internal val ModernistFontFamily = FontFamily(
    Font(R.font.sk_modernist_regular, weight = FontWeight.Normal),
    Font(R.font.sk_modernist_bold, weight = FontWeight.Bold),
    Font(R.font.sk_modernist_mono, weight = FontWeight.Medium)
)

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val fontNameMonserrat = GoogleFont("Montserrat")

val MonserratFontFamily = FontFamily(
    Font(
        googleFont = fontNameMonserrat,
        fontProvider = provider,
        weight = FontWeight.Bold,
        style = FontStyle.Normal
    )
)
