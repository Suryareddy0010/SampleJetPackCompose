package com.example.samplejetpackcompose

import android.content.Intent
import android.graphics.Paint.Style
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplejetpackcompose.ui.theme.SampleJetPackComposeTheme

class FifthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                // Greeting()
                //SimpleTextField()
                SelectableText()
            }
        }
    }
}

@Composable
fun SimpleTextField() {
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

            shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),onClick = { "clicked" }, colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(
            id = R.color.blue_color
        ))) {
            Text(text = "Login", color = Color.White, fontWeight = FontWeight.Bold)
        }
Row() {
    Text(text = "Dont have an account yet?", color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight.Normal, modifier = Modifier.padding(start = 54.dp, top = 16.dp))

    Text(text = "Sign Up Here", color = colorResource(id = R.color.color_teal), fontSize = 12.sp, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 8.dp, top = 16.dp))
}
    }

}

@Composable
fun Greeting() {

        Log.d("surya", "BottomNavigationExample: if")
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

//   // SampleJetPackComposeTheme {
//        Column(modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(
//                text = "Hello World",
//                color = Color.Blue,
//                fontSize = 32.sp,
//                fontWeight = FontWeight.Bold)
//            Button(modifier = Modifier.height(50.dp),
//
//                shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
//                enabled = true,
//                colors = ButtonDefaults.buttonColors(
//                    contentColor = Color.Red,
//                    disabledContentColor = Color.Green,
//                    disabledBackgroundColor = Color.DarkGray
//                ),
//                onClick = {
//                    val intent = Intent(this@MainActivity,FifthActivity::class.java)
//                    startActivity(intent)
//                }) {
//                Text(text = "Second Activity")
//            }
//        }
//    }
}

@Composable
fun SelectableText(){

    Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.blue_color), contentColor = Color.White, disabledBackgroundColor = Color.Black, disabledContentColor = Color.White)
            ) {
                Text(text = "Second Activity")
            }

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Click", color = colorResource(id = R.color.white))
            Text(text = "Here", color = colorResource(id = R.color.black))

        }

        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(
            id = R.color.blue_color
        ))) {
            Image(painter = painterResource(id = R.drawable.iv_blue_email), contentDescription = null )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Clickable screen", color = colorResource(id = R.color.white))

        }
        }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    SampleJetPackComposeTheme {
        //Greeting()
        SelectableText()

    }
}