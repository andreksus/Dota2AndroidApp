package com.example.dota2androidapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.dota2androidapp.R

@Composable
fun CardsRow(imagesId: List<Int> = listOf(R.drawable.image_18, R.drawable.image_18)){
    LazyRow(
        contentPadding = PaddingValues(start = 20.dp, top = 15.dp, end = 20.dp, bottom = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ){
        items(imagesId){imageId ->
            CardPicture(imageId = imageId)
        }
    }
}