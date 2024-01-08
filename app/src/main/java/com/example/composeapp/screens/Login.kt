package com.example.composeapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.customCompose.customCardButton
import com.example.composeapp.customCompose.customPassWordView


@ExperimentalMaterial3Api
@Composable
fun Sample(onClickCard:()->Unit,switchPageClick:(page:String)->Unit) {


    Box(modifier = Modifier.fillMaxSize()) {

        ClickableText(
            text = AnnotatedString("Sign up here"),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(20.dp),
            onClick = {
                      switchPageClick("SignUp")
            },
            style = TextStyle(
                fontSize = 19.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline,
                color = Color.Blue
            )
        )


    }


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Column(
            modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState())
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val username = remember { mutableStateOf(TextFieldValue()) }
            val password = remember { mutableStateOf(TextFieldValue()) }

            Text(
                text = "Login",
                style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive)
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = username.value, // Set your desired value
                onValueChange = {
                    username.value = it
                },
                label = { Text(text = "Username") },
                textStyle = LocalTextStyle.current.copy(color = Color.Red), // Change text color here
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                // Other modifiers and attributes as needed
                shape = RoundedCornerShape(12.dp)
            )



            Spacer(modifier = Modifier.height(20.dp))

            customPassWordView(password)

            Spacer(modifier = Modifier.height(20.dp))

            customCardButton(typeName = "Login", modifier = Modifier.padding(35.dp,0.dp,35.dp,0.dp),onClickCard)


            Spacer(modifier = Modifier.height(20.dp))
            ClickableText(
                modifier = Modifier
                    .padding(10.dp)
                    .height(30.dp)
                    .fillMaxWidth(),
                text = AnnotatedString("Forgot password?"),

                onClick = { },
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Default,
                    textAlign = TextAlign.Center,
                    textDirection = TextDirection.Content

                )

            )


        }


    }


}