package com.example.dota2androidapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dota2androidapp.R

@Composable
fun CardPicture(imageId: Int){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(240.dp)
            .clip(RoundedCornerShape(15.dp))
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
            //.clip(shape = RoundedCornerShape(20.dp))
        )
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .alpha(0.3f)
                .background(colorResource(id = R.color.white))
        )
        Image(
            painter = painterResource(id = R.drawable.arrow___right_2),
            contentDescription = null,
            modifier = Modifier
                .size(25.dp)
        )
    }
}

@Composable
fun VideoPlay(){
    Box(
        modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
            .alpha(0.5f)
            .background(Color.Red),
    )
}

@Composable
@Preview
fun VideoPlayPreview(){
    VideoPlay()
}


@Composable
@Preview
fun CardPicturePreview(){
    CardPicture(imageId = R.drawable.image_18)
}