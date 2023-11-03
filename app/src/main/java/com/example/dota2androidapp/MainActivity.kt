package com.example.dota2androidapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2androidapp.ui.theme.Dota2AndroidAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.math.max

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dota2AndroidAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Body()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Привет $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Dota2AndroidAppTheme {
        Greeting(stringResource(id = R.string.app_name))
    }
}
//Preview
@Preview
@Composable
fun DotaAppPreview() {
    Body()
}

@Preview
@Composable
fun CurrentlyPreview(){
    InstallButton()
}



//Components
@Composable
fun MainPicture(){
    Image(
        painterResource(id = R.drawable.dota_main_picture),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .fillMaxWidth()
    )
}

@Composable
fun Icon(){
    Image(
        painterResource(id = R.drawable.icon_box),
        contentDescription = null,
        modifier = Modifier
            .fillMaxHeight()
            .size(140.dp)
            .padding(top = 240.dp)
    )
}

@Composable
fun Header(){
    Box(
        modifier = Modifier
            .background(color = colorResource(id = R.color.background))
            .height(420.dp)
    ){
        MainPicture()
        Icon()
    }
}

@Composable
fun Body(){
    Column(
        modifier = Modifier
            .background(color = colorResource(id = R.color.background))
    ) {
        Header()
        Description()
        ListPictures()
        InstallButton()
    }
}

@Composable
fun Description(){
    Box(
        modifier = Modifier
            .background(color = colorResource(id = R.color.background))
            .padding(horizontal = 30.dp)
    )
    {
        Text(fontSize = 12.sp,text = stringResource(id = R.string.game_description), color = colorResource(id = R.color.description), fontStyle = FontStyle(R.font.roboto_mono_light))
    }
}

@Composable
fun CardPicture(imageId: Int){
    Image(
        painter = painterResource(id = imageId),
        contentDescription = null,
        modifier = Modifier
            .size(height = 135.dp, width = 240.dp)
            .clip(shape = RoundedCornerShape(30.dp))
    )
}

@Composable
fun ListPictures(imagesId: List<Int> = listOf(R.drawable.image_18, R.drawable.image_18)){
    LazyRow(
        contentPadding = PaddingValues(30.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ){
        items(imagesId){imageId ->
            CardPicture(imageId = imageId)
        }
    }
}

@Composable
fun InstallButton(){
        Button(
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.button))
        ) {
        Text("Install", color = colorResource(id = R.color.text_button), fontSize = 20.sp)
    }
}



