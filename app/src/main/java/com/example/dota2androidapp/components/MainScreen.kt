package com.example.dota2androidapp.components

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dota2androidapp.R
import com.example.dota2androidapp.ui.theme.fontFamily

@Composable
fun MainScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Header2()
    }
}


@Composable
fun Header2(){
    ConstraintLayout(
        modifier = Modifier
            .height(400.dp)
            .background(colorResource(id = R.color.background))
    ) {
        val (image, row) = createRefs()
        Image(
            painterResource(id = R.drawable.dota_main_picture),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(image) {}
        )
        Row(
            modifier = Modifier
                //RoundedCornerShape??
                .background(colorResource(id = R.color.background))
                .height(80.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, bottom = 10.dp)
                .constrainAs(row) {
                    top.linkTo(parent.bottom, margin = -80.dp)
                }
        ){
            Image(
                painterResource(id = R.drawable.icon_box),
                contentDescription = null,
                modifier = Modifier
                    .requiredSize(height = 150.dp, width = 100.dp),
                contentScale = ContentScale.FillHeight
            )
            ConstraintLayout(
                modifier = Modifier
                    .padding(start = 8.dp, top = 15.dp, bottom = 15.dp)
            ){
                val (title, row) = createRefs()
                Text("DoTA 2", color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .constrainAs(title){}
                    )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier
                        .constrainAs(row){
                            top.linkTo(title.bottom, margin = 6.dp)
                        }
                ){
                    Image(
                        painterResource(id = R.drawable.stars),
                        contentDescription = null,
                        modifier = Modifier
                            .size(height = 20.dp, width = 85.dp)
                    )
                    Text("70M", color = colorResource(id = R.color.white))
                }
            }
        }
    }
}

@Composable
fun MainImage(){
    Image(
        painterResource(id = R.drawable.dota_main_picture),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .fillMaxWidth()
    )
}


@Preview
@Composable
fun HeaderPreview(){
    Header2()
}

@Preview
@Composable
fun MainScreenPreview(){
    MainScreen()
}

@Preview
@Composable
fun CurrentlyPreview(){
    Image(
        painterResource(id = R.drawable.stars),
        contentDescription = null,
        modifier = Modifier
            .size(height = 20.dp, width = 80.dp)
    )
}



