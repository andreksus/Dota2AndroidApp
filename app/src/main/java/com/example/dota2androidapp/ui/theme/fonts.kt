package com.example.dota2androidapp.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.example.dota2androidapp.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val fontName = GoogleFont("Sk-modernist")

internal val FontFamily = FontFamily(
    Font(R.font.sk_modernist_regular),
    Font(R.font.sk_modernist_bold, weight = FontWeight.Bold),
    Font(R.font.sk_modernist_mono, weight = FontWeight.Medium)
)
