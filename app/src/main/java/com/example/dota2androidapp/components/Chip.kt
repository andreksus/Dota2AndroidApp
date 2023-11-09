package com.example.dota2androidapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2androidapp.R
import com.example.dota2androidapp.ui.theme.ModernistFontFamily
import com.example.dota2androidapp.ui.theme.MonserratFontFamily

@Composable
fun Chip(text: String){
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(colorResource(id = R.color.chip_background))
        )
    {
        Text(
            text,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 5.dp),
            color = colorResource(id = R.color.chip_text),
            fontFamily = MonserratFontFamily,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 19.sp
        )
    }
}

@Composable
@Preview
fun ChipPreview(){
    Chip("MOBA")
}