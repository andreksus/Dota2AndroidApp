package com.example.dota2androidapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dota2androidapp.R
import com.example.dota2androidapp.ui.theme.ModernistFontFamily

@Composable
fun Header(){
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
                    top.linkTo(parent.bottom, margin = (-80).dp)
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
                    .padding(start = 8.dp)
            ){
                val (title, rowDown) = createRefs()
                Text(
                    "DoTA 2",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .constrainAs(title){},
                    fontFamily = ModernistFontFamily,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                    )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier
                        .constrainAs(rowDown){
                            top.linkTo(title.bottom, margin = 6.dp)
                        }
                ){
                    Image(
                        painterResource(id = R.drawable.stars),
                        contentDescription = null,
                        modifier = Modifier
                            .size(height = 20.dp, width = 85.dp)
                    )
                    Text(
                        "70M",
                        color = colorResource(id = R.color.text_70M),
                        fontFamily = ModernistFontFamily,
                        fontSize = 13.sp,
                        letterSpacing = 0.5.sp,
                        fontWeight = FontWeight.ExtraLight

                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HeaderPreview(){
    Header()
}
