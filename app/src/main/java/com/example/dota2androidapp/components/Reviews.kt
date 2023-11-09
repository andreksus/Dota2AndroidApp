package com.example.dota2androidapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dota2androidapp.ui.theme.ModernistFontFamily
import com.example.dota2androidapp.R

@Composable
@Preview
fun ReviewsPreview(){
    Reviews()
}

@Composable
fun Reviews(){
    ConstraintLayout(
        modifier = Modifier
            .background(color = colorResource(id = R.color.background))
            .padding(start = 20.dp)
    ) {
        val (title, row) = createRefs()

        Text(
            "Review & Ratings",
            modifier = Modifier
                .constrainAs(title){},
            fontFamily = ModernistFontFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.6.sp,
            color = colorResource(id = R.color.reviews_text)
        )

        Row(
            modifier = Modifier
                .constrainAs(row){
                    top.linkTo(title.bottom, margin = 12.dp)
                }
        ) {
            Text(
                "4.9",
                fontFamily = ModernistFontFamily,
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.5.sp,
                color = colorResource(id = R.color.reviews_text)
            )

            Column(
                modifier = Modifier
                    .padding(start = 14.dp, top = 12.dp)
            ) {
                Stars(4.5)

                Text(
                    "70M Reviews",
                    fontFamily = ModernistFontFamily,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = 0.5.sp,
                    color = colorResource(id = R.color.reviews_count),
                    modifier = Modifier
                        .alpha(0.5f)
                        .padding(top = 3.dp)
                )
            }
        }
    }
}