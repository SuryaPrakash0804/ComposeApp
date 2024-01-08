package com.example.composeapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.R
import com.example.composeapp.customCompose.customCardButton
import com.example.composeapp.customCompose.customEmailField
import com.example.composeapp.customCompose.customInputField
import com.example.composeapp.customCompose.customPassWordView


@ExperimentalMaterial3Api
@Composable
fun showSignUpScreen(onClickCard:()->Unit,switchPageClick:(page:String)->Unit) {




    BackHandler {
        switchPageClick("Login")
    }


    val fullname = remember {
        mutableStateOf("")
    }

    val email = remember {
        mutableStateOf("")
    }

    val pass = remember {
        mutableStateOf(TextFieldValue())
    }


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(0.dp, 0.dp, 0.dp, 40.dp)
            .background(colorResource(id = R.color.bg))
    ) {


        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(10.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Image(
                painter = painterResource(id = R.drawable.good), contentDescription = "",
                modifier = Modifier.size(100.dp)

            )

            Spacer(modifier = Modifier.size(10.dp))

            Text(
                text = "Sign Up",
                style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive)
            )

            Spacer(modifier = Modifier.height(10.dp))

            customInputField(fullname, modifier = Modifier)

            Spacer(modifier = Modifier.height(10.dp))

            customEmailField(textType = email, modifier = Modifier)

            Spacer(modifier = Modifier.height(10.dp))

            customPassWordView(password = pass)

            Spacer(modifier = Modifier.height(20.dp))

          //  customButton(name = "Sign up")

            customCardButton(typeName = "Sign Up", modifier =Modifier.padding(35.dp,0.dp,35.dp,0.dp),onClickCard )



        }

    }


    Box(modifier = Modifier.fillMaxSize()) {

        ClickableText(
            text = AnnotatedString("Login here"),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(20.dp),
            onClick = { switchPageClick("Login")},
            style = TextStyle(
                fontSize = 19.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline,
                color = Color.Blue
            )
        )


    }


}


