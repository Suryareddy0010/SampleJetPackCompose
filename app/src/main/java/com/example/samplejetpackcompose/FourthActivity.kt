package com.example.samplejetpackcompose

import android.media.Image
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplejetpackcompose.ui.theme.SampleJetPackComposeTheme

class FourthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BottomNavigationExample()
                }
            }
        }
    }
}



@Composable
fun BottomNavigationExample() {
    var selectedTab by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = colorResource(id = R.color.white),
                modifier = Modifier
                    .background(colorResource(id = R.color.white))
                    .fillMaxWidth()
                    .height(80.dp),
            ) {
                BottomNavigationItem(
                    icon = {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(painterResource(id = R.drawable.iv_schedule), contentDescription = null)
                            Spacer(modifier = Modifier.height(4.dp)) // Add some space between icon and text
                            Text(text = "Schedule", fontSize = 13.sp)
                        }
                    },
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 }
                )
                BottomNavigationItem(
                    icon = {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(painterResource(id = R.drawable.iv_asneeded), contentDescription = null)
                            Spacer(modifier = Modifier.height(4.dp)) // Add some space between icon and text
                            Text(text = "As Needed", fontSize = 13.sp)
                        }
                    },
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 }
                )
                BottomNavigationItem(
                    icon = {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(painterResource(id = R.drawable.iv_pending), contentDescription = null)
                            Spacer(modifier = Modifier.height(4.dp)) // Add some space between icon and text
                            Text(text = "Pending", fontSize = 13.sp)
                        }
                    },
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 }
                )
                BottomNavigationItem(
                    icon = {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(painterResource(id = R.drawable.iv_rewards), contentDescription = null)
                            Spacer(modifier = Modifier.height(4.dp)) // Add some space between icon and text
                            Text(text = "Rewards", fontSize = 13.sp)
                        }
                    },
                    selected = selectedTab == 3,
                    onClick = { selectedTab = 3 }
                )
                BottomNavigationItem(
                    icon = {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(painterResource(id = R.drawable.iv_more), contentDescription = null)
                            Spacer(modifier = Modifier.height(4.dp)) // Add some space between icon and text
                            Text(text = "More", fontSize = 13.sp)
                        }
                    },
                    selected = selectedTab == 4,
                    onClick = { selectedTab = 4 }
                )
            }
        }
    ) { innerPadding ->
        // Content of each tab
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
        ) {
            Log.d("surya", "BottomNavigationExample: "+selectedTab)
            if (selectedTab == 0){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .background(colorResource(id = R.color.blue_color)),
                ) {
                    Row{
                        Image(
                            painter = painterResource(R.drawable.iv_white_back_arrow),
                            modifier = Modifier
                                .size(90.dp)
                                .wrapContentSize(Alignment.Center),
                            contentDescription = "Contact profile picture",
                        )

                        Text(text = "Pause Medications",
                            color = Color.White, modifier = Modifier
                                .padding(top = 16.dp, bottom = 16.dp)
                                .wrapContentSize(Alignment.Center)
                        )

                    }
                }
                Log.d("surya", "BottomNavigationExample: if")
                Box(
                    modifier = Modifier
                        .padding(16.dp)
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

                            Button(onClick = { "clicked" }, colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(
                                id = R.color.blue_color
                            ))) {
                                Text(text = "Take Now", color = Color.White, fontWeight = FontWeight.Bold)
                            }
                        }

                    }
                }
            }else {
                Log.d("surya", "BottomNavigationExample: else")
                Text("Tab ${selectedTab + 1} Content")
            }
        }
    }
}

