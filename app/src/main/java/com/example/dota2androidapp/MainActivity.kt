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
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.LocalPinnableContainer
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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.core.view.WindowCompat
import com.example.dota2androidapp.components.ChipsRow
import com.example.dota2androidapp.components.Description
import com.example.dota2androidapp.components.Header
import com.example.dota2androidapp.ui.theme.Dota2AndroidAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.math.max

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            Body()
            //ConstraintLayout - Header
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
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InstallButton()
    }
}

//@Composable
//fun Header(){
//    Box(
//        modifier = Modifier
//            .background(color = colorResource(id = R.color.background))
//            .height(420.dp)
//    ){
//        MainPicture()
//        Icon()
//    }
//}

@Composable
fun Body(){
    Surface(
        modifier = Modifier.fillMaxHeight(),
        color = colorResource(id = R.color.background)) {
        ConstraintLayout {
            val (installButtonSpace, mainSpace) = createRefs()

            LazyColumn(
                modifier = Modifier
                    .constrainAs(mainSpace) {

                    }
                    .windowInsetsPadding(WindowInsets.statusBars)
            ) {
                item {
                    Header()
                }
                item {
                    ChipsRow(titles = listOf("MOBA", "MULTIPLAYER", "STRATEGY"))
                }
                item {
                    Description()
                }
                item {
                    ListPictures()
                }

//        item {
//            InstallButton()
//        }
//        Header()
//        Description()
//        ListPictures()
//        InstallButton()
            }

            Box(Modifier
                .constrainAs(installButtonSpace) {
                    bottom.linkTo(parent.bottom)
                }
            ) {
                Column {
                    InstallButton()
                    Spacer()
                }
            }
        }
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
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.button))
        ) {
            Text("Install", color = colorResource(id = R.color.text_button), fontSize = 20.sp)
        }
}

@Composable
fun Spacer(horizontalPadding: Dp = 10.dp, verticalPadding: Dp = 10.dp ){
    Box(
        modifier = Modifier
            .padding(horizontal = horizontalPadding,vertical = verticalPadding)
    )
}

