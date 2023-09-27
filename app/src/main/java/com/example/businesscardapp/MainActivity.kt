package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.VectorProperty
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Start()
                }
            }
        }
    }
}


@Composable
fun Start(){

    Column(){
        Column (

            Modifier
                .fillMaxSize()
                .background(color = Color(0xFF1E2650)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,


            ) {
            MyPic()
            TextMaker(name = stringResource(id = R.string.user_name), job = stringResource(id = R.string.user_job))

        }
    }

}



@OptIn(ExperimentalTextApi::class)
@Composable
fun TextMaker(name: String, job: String, modifier: Modifier = Modifier){

        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color(0xFFFFFFFF),

            modifier = Modifier

                .padding(start = 15.dp, top = 15.dp, end = 15.dp)





        )
        Text(
            text = job,
            fontSize = 20.sp,
            color = Color.White

        )

}

@Composable
fun GitPic(modifier: Modifier = Modifier){
    

}


@Composable
fun MyPic(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.android_logo)

        Image(painter = image,
            contentDescription = null,
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFF0B193F))
        )



}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
             Start()
    }
}