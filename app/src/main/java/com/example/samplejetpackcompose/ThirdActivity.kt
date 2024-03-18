package com.example.samplejetpackcompose

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplejetpackcompose.ui.theme.SampleJetPackComposeTheme

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    SampleData("Dolo 650","10:30 Am")
                   // Greeting("Dayamed","Med App")
                }
            }
        }
    }
}

@Composable
fun SampleData(name: String,desc: String){
    Row(modifier = Modifier.padding(top = 32.dp, start = 16.dp, end = 16.dp, bottom = 32.dp)) {
        Image(
            painter = painterResource(id = R.drawable.iv_default_med),
            contentDescription = "Sample Image",
            modifier = Modifier
                // Set image size to 40 dp
                .size(90.dp)
                .wrapContentSize(Alignment.Center)
        )
        Spacer(modifier = Modifier.width(16.dp))


        Column() {
            Text(text = "$name", fontSize = 16.sp, color = Color.Blue)
            Spacer(modifier = Modifier.width(16.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Row() {
                Text(text = "Scheduled Time $desc", fontSize = 13.sp)
                Spacer(modifier = Modifier.width(16.dp))
        Text(text = "Qty: 1.0", fontSize = 13.sp)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Pharmacy N/A", fontSize = 13.sp)
            Spacer(modifier = Modifier.height(16.dp))
//            Text(text = "*As Needed", fontSize = 13.sp, color = Color.Red)
            Row() {
                Text(text = "*As Needed", fontSize = 13.sp, color = Color.Red)
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = {

                }) {
                    
                }
            }
        }
//        Spacer(modifier = Modifier.height(16.dp))
//        Text(text = "Qty: 1.0")
    }
}



//@Composable
//fun SampleImage(name: String,desc: String) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.iv_blue_email), // Replace with your image resource
//            contentDescription = "Sample Image",
//            modifier = Modifier
//                .fillMaxWidth()
//                .size(50.dp)
//                .wrapContentSize(Alignment.CenterStart)
//        )
//        Row(modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//            ){
//            Text(text = "$name!")
//            Text(text = "$desc")
//        }
//    }
//
////    val context = LocalContext.current
////    val density = LocalDensity.current.density
////    val imageModifier = Modifier
////        .fillMaxWidth(0.5f)
////        .wrapContentSize(Alignment.Center)
////        .clip(MaterialTheme.shape.medium)
////
////    Column(
////        modifier = Modifier
////            .fillMaxSize()
////            .padding(16.dp),
////        verticalArrangement = Arrangement.Center,
////        horizontalAlignment = Alignment.CenterHorizontally
////    ) {
////        Image(
////            painter = painterResource(id = R.drawable.your_image_resource_id),
////            contentDescription = null, // Set content description if needed
////            modifier = imageModifier,
////            contentScale = ContentScale.Crop
////        )
////    }
//}

//@Composable
//fun Greeting(name: String,desc: String) {
//
//   //  --------- Using Column  ----------
//
////    Column(modifier = Modifier
////        .fillMaxSize()
////        .padding(16.dp),
////    verticalArrangement = Arrangement.Center,
////    horizontalAlignment = Alignment.CenterHorizontally) {
////        Text(text = "$name!")
////        Text(text = "$desc")
////    }
//
//    //  --------- Using Row  ----------
//
//    Row(modifier = Modifier
//        .fillMaxSize()
//        .padding(16.dp),
//    verticalAlignment = Alignment.CenterVertically,
//    horizontalArrangement = Arrangement.spacedBy(16.dp)){
//        Text(text = "$name!")
//        Text(text = "$desc")
//    }
//
//
////    Text(text = "$name!")
////    Text(text = "$desc")
//
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SampleJetPackComposeTheme {
        SampleData("Dayamed","Med App")
       // Greeting("Dayamed","Med App")
    }
}