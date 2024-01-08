package com.example.composeapp.customCompose.hiltAndNew.Screens.CommonComposView


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text

import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.R
import com.example.composeapp.ui.theme.EditBorder
import com.example.composeapp.ui.theme.EditTextField
import com.example.composeapp.ui.theme.TextColor
import com.example.composeapp.ui.theme.tertiary


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun showMyView() {
    val name = remember {
        mutableStateOf("")
    }
    EditText(name = name, Modifier, "Enter Your Name")
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditText(name: MutableState<String>, modifier: Modifier, placeholder: String) {


    TextField(value = name.value, onValueChange = {
        name.value = it
    },
        modifier = modifier
            .fillMaxWidth()
            .border(2.dp, color = EditBorder, shape = RoundedCornerShape(10.dp)),
        placeholder = {
            Text(text = placeholder, color = Color.Gray)
        },
        textStyle = TextStyle(
            color = TextColor,
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight(200)
        ),
        leadingIcon = {
            Icon(Icons.Default.AccountCircle, contentDescription = "")
        },
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.textFieldColors(
            textColor = TextColor,
            containerColor = Color.LightGray,
            placeholderColor = Color.Gray,

            ),
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Words,
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Next
        ),
        singleLine = true,
        maxLines = 1


    )


}


@Preview
@Composable
fun CustomTextField() {

    val name = remember {
        mutableStateOf("")
    }
    BasicTextField(
        value = name.value, onValueChange = {
            name.value = it
        },

        textStyle = TextStyle(fontSize = 16.sp)

    ) {
        Box(modifier = Modifier.border(2.dp, Color.Black, RoundedCornerShape(10.dp))) {

            Row {

            }
        }
    }
}


@Preview
@Composable
fun showButton() {

    custom_Button(
        modifier = Modifier.height(50.dp),
        "Hi Let's Start The Game",
        Color.LightGray,
        Color.Blue
    ) {

    }

}


@Composable
fun custom_Button(
    modifier: Modifier,
    text: String = stringResource(R.string.get_started),
    backgroundColor: Color = Color.White,
    textColor: Color = Color.Black,
    elevation: ButtonElevation = ButtonDefaults.buttonElevation(0.dp),
    color: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = backgroundColor,
        contentColor = textColor

    ),
    onButtonClick: () -> Unit

) {

    Button(
        onClick = onButtonClick, modifier = modifier
            .fillMaxWidth(),
        elevation = elevation,
        colors = color,
        shape = RoundedCornerShape(20.dp)
    ) {

        Text(
            text = text, style = TextStyle(
                fontSize = 16.sp, fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            )
        )
    }


}

@Preview
@Composable
fun CustomBoxWithImage() {


    Column {
        Box(
            modifier = Modifier
                .border(4.dp, shape = CircleShape, color = Color.Red)
                .background(Color.Yellow, CircleShape)
                .size(80.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(modifier = Modifier
                .size(25.dp)
                .background(Color.Black, CircleShape)
                .padding(4.dp)

                ,
                contentAlignment = Alignment.Center
                ){
                Icon(imageVector = Icons.Default.Add, contentDescription = "", tint = Color.White)
            }



        }


        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Add Story", style = TextStyle(color = Color.White,
            fontSize = 16.sp), modifier = Modifier.align(CenterHorizontally))


    }

}