package com.example.dota2androidapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2androidapp.R

@Composable
fun Stars(starsCount: Double){
    if (starsCount >= 4.5 && starsCount < 5){
        Image(
            painterResource(id = R.drawable.stars4_5),
            contentDescription = null,
            modifier = Modifier
                .size(height = 20.dp, width = 85.dp)
        )
    }

    if (starsCount == 5.0){
        Image(
            painterResource(id = R.drawable.stars5),
            contentDescription = null,
            modifier = Modifier
                .size(height = 20.dp, width = 85.dp)
        )
    }
}

@Composable
@Preview
fun StarsPreview4_5(){
    Stars(4.5)
}

@Composable
@Preview
fun StarsPreview5_0(){
    Stars(5.0)
}