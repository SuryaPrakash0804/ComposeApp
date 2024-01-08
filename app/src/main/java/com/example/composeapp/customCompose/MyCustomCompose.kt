package com.example.composeapp.customCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ProduceStateScope
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.R
import kotlinx.coroutines.delay


@ExperimentalMaterial3Api
@Composable
fun customPassWordView(password: MutableState<TextFieldValue>) {

    OutlinedTextField(
        value = password.value, // Set your desired value
        onValueChange = {
            password.value = it
        },
        label = { Text(text = "Password") },
        textStyle = LocalTextStyle.current.copy(color = Color.Red), // Change text color here
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        // Other modifiers and attributes as needed
        shape = RoundedCornerShape(12.dp)
    )


}


@Composable
fun customButton(name: String) {
    Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
        Button(
            onClick = { },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)

        ) {
            Text(text = name)
        }
    }

}


@ExperimentalMaterial3Api
@Composable
fun customCardButton(typeName: String, modifier: Modifier, onClickCard: () -> Unit) {
    Card(
        shape = RoundedCornerShape(10.dp),
        onClick = {
            onClickCard
        }, modifier = modifier
            .fillMaxWidth()
            .height(50.dp)


    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.cardBg)),
            contentAlignment = Alignment.Center
        ) {
            ClickableText(
                text = AnnotatedString(typeName),
                onClick = {
                },

                style = TextStyle(
                    textAlign = TextAlign.Center,
                    color = Color.Blue
                )
            )
        }


    }
}


@ExperimentalMaterial3Api
@Composable
fun customInputField(textType: MutableState<String>, modifier: Modifier) {
    OutlinedTextField(
        value = textType.value, // Set your desired value
        onValueChange = {
            textType.value = it
        },
        label = { Text(text = "Username") },
        textStyle = LocalTextStyle.current.copy(color = Color.Black), // Change text color here
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
        // Other modifiers and attributes as needed
        shape = RoundedCornerShape(12.dp)
    )

}


@ExperimentalMaterial3Api
@Composable
fun customEmailField(textType: MutableState<String>, modifier: Modifier) {
    OutlinedTextField(
        value = textType.value, // Set your desired value
        onValueChange = {
            textType.value = it
        },
        label = { Text(text = "Email") },
        textStyle = LocalTextStyle.current.copy(color = Color.Black), // Change text color here

        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        // Other modifiers and attributes as needed
        shape = RoundedCornerShape(12.dp)
    )

}



@Composable
fun customLoader() {

    val degree = produceState(initialValue = 0) {
        while (true) {
            delay(16)
            value = (value + 20) % 360
        }
    }

    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f),
        ) {
        Column {
            Image(painter = painterResource(id = R.drawable.baseline_refresh_24),
                contentDescription = "Loading",

                modifier = Modifier
                    .size(60.dp)
                    .rotate(degree.value.toFloat()))

            Text(text = "Loading...")
        }

    }


}



    
