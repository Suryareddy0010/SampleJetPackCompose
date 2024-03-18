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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplejetpackcompose.ui.theme.SampleJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeTheme {
                Column() {
                    Image(
                        painter = painterResource(R.drawable.iv_login),
                        modifier = Modifier
                            .padding(top = 32.dp, start = 16.dp)
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center),
                        contentDescription = "Contact profile picture",
                    )

                    Text(text = "Sign in to continue", color = Color.Black, fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 8.dp))

                    Text(text = "Email ID", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 32.dp, start = 32.dp))

                    var text by remember {
                        mutableStateOf(TextFieldValue(""))
                    }
                    TextField(value = text, onValueChange = {newText -> text = newText},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 32.dp, top = 8.dp, end = 16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        placeholder = { Text(text = "Enter your email Id here...")}
                    )
                    Text(text = "Login via Verification Code", color = colorResource(id = R.color.color_teal), fontSize = 12.sp, modifier = Modifier
                        .padding(top = 8.dp, end = 16.dp)
                        .align(Alignment.End))
                    Text(text = "Password", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 16.dp, start = 32.dp))
                    var text1 by remember {
                        mutableStateOf(TextFieldValue(""))
                    }
                    TextField(value = text1, onValueChange = {newText -> text1 = newText},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 32.dp, top = 8.dp, end = 16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        placeholder = { Text(text = "Enter your password here...")}
                    )
                    Text(text = "Forgot password?", color = colorResource(id = R.color.color_teal), fontSize = 12.sp, modifier = Modifier
                        .padding(top = 8.dp, end = 16.dp)
                        .align(Alignment.End))

                    Spacer(modifier = Modifier.width(16.dp))

                    Button(modifier = Modifier
                        .padding(top = 32.dp)
                        .height(50.dp)
                        .width(150.dp)
                        .align(Alignment.CenterHorizontally),

                        shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
                        onClick = {
                            val intent = Intent(this@MainActivity,SixthActivity::class.java)
                            startActivity(intent)
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(
                            id = R.color.blue_color
                        )
                        )) {
                        Text(text = "Login", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                    Row() {
                        Text(text = "Dont have an account yet?", color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight.Normal, modifier = Modifier.padding(start = 54.dp, top = 16.dp))

                        Text(text = "Sign Up Here", color = colorResource(id = R.color.color_teal), fontSize = 12.sp, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 8.dp, top = 16.dp))
                    }
                }

            }
        }
    }
}



