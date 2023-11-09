package com.example.dota2androidapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2androidapp.R
import com.example.dota2androidapp.classes.Comment
import com.example.dota2androidapp.classes.Date
import com.example.dota2androidapp.classes.User
import com.example.dota2androidapp.ui.theme.ModernistFontFamily

@Composable
@Preview
fun CommentElementPreview(){
    CommentElement()
}

val user = User("Auguste Conte", 1)
val date = Date("February 14, 2019")
const val text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
val comment1 = Comment(user, date, text)

@Composable
fun CommentElement(commentP: Comment = comment1){
    Column(
        modifier = Modifier
            .background(colorResource(id = R.color.background))
            .padding(start = 20.dp)
    ) {
        Row() {
            Image(
                painterResource(id = R.drawable.firstuser),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            )

            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
            ) {
                Text(
                    commentP.user.username,
                    fontFamily = ModernistFontFamily,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = 0.5.sp,
                    color = Color.White
                )

                Text(
                    commentP.date.dateText,
                    fontFamily = ModernistFontFamily,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = 0.5.sp,
                    color = Color.White,
                    modifier = Modifier
                        .alpha(0.4f)
                        .padding(top = 7.dp)
                )
            }
        }
        Text(
            commentP.text,
            fontFamily = ModernistFontFamily,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.5.sp,
            color = Color.White,
            lineHeight = 20.sp,
            modifier = Modifier
                .alpha(0.4f)
                .padding(top = 16.dp)
        )

        CommentLine()
    }
}

@Composable
@Preview
fun CommentLinePreview(){
    CommentLine()
}

@Composable
fun CommentLine(){
        Box(
            modifier = Modifier
                .padding(horizontal = 38.dp, vertical = 24.dp)
                .size(height = 1.dp, width = 300.dp)
                .background(colorResource(id = R.color.comment_line))
        )
}