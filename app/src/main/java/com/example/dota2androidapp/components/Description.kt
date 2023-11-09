package com.example.dota2androidapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2androidapp.R
import com.example.dota2androidapp.ui.theme.ModernistFontFamily

@Composable
fun Description(){
    Box(
        modifier = Modifier
            .padding(horizontal = 20.dp)
    )
    {
        Text(
            text = stringResource(id = R.string.game_description),
            color = colorResource(id = R.color.description),
            fontFamily = ModernistFontFamily,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 19.sp
        )
    }
}

@Composable
@Preview
fun DPreview(){
    Description()
}