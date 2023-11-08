package com.example.dota2androidapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun ChipsRowPreview(){
    Box(
        modifier = Modifier
            .size(400.dp)
    ){
        ChipsRow()
    }
}

@Composable
fun ChipsRow(titles: List<String> = listOf("1", "2", "3")){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(start = 20.dp, end = 20.dp, bottom = 20.dp),
    ){
        items(titles){ text ->
            Chip(text = text)
        }
    }
}