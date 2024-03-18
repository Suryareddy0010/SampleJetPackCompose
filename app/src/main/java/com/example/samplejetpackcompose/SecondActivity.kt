package com.example.samplejetpackcompose

import android.media.Image
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplejetpackcompose.ui.theme.SampleJetPackComposeTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
               Box(
                   modifier = Modifier
                       .padding(top = 32.dp, bottom = 32.dp)
                       .fillMaxWidth()
                       .height(160.dp)
                       .background(colorResource(id = R.color.med_log)),
               ) {
                   Row {
                       Image(
                           painter = painterResource(R.drawable.iv_default_med),
                           modifier = Modifier
                               .padding(top = 32.dp, start = 16.dp)
                               .size(90.dp)
                               .wrapContentSize(Alignment.Center),
                           contentDescription = "Contact profile picture",
                       )
Spacer(modifier = Modifier.width(16.dp))
                       Column() {
                           Text(modifier = Modifier.padding(top = 16.dp),
                               text = "Dolo 650",
                               color = Color.Black,
                               fontSize = 16.sp,
                               fontWeight = FontWeight.Bold)
                          Row() {
                              Text(modifier = Modifier.padding(top = 16.dp),
                                  text = "Scheduled Time 10:30",
                                  color = Color.Black,
                                  fontSize = 13.sp,
                                  fontWeight = FontWeight.Normal)

                              Spacer(modifier = Modifier.width(16.dp))

                              Text(modifier = Modifier.padding(top = 16.dp),
                                  text = "Qty: 1.0",
                                  color = Color.Black,
                                  fontSize = 13.sp,
                                  fontWeight = FontWeight.Normal)
                          }
                           Text(modifier = Modifier.padding(top = 16.dp),
                               text = "Pharmacy N/A",
                               color = Color.Black,
                               fontSize = 13.sp,
                               fontWeight = FontWeight.Normal)

                           Button(onClick = { Toast.makeText(this@SecondActivity,"Clicked",Toast.LENGTH_LONG) }, colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(
                               id = R.color.blue_color
                           ))) {
                               Text(text = "Take Now", color = Color.White, fontWeight = FontWeight.Bold)
                           }
                       }

                   }
               }
            }
        }
    }
}

