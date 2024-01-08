package com.example.composeapp.customCompose.hiltAndNew.Screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.OverscrollEffect
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composeapp.R
import com.example.composeapp.customCompose.hiltAndNew.Elite.GuidScreens
import com.example.composeapp.customCompose.hiltAndNew.Elite.Splash
import com.example.composeapp.ui.theme.BackGroundApp
import com.example.composeapp.ui.theme.SplashColor
import kotlinx.coroutines.delay
import java.nio.file.WatchEvent


@Composable
fun SplashScreen(navController: NavController) {




    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp), contentAlignment = Alignment.Center
    ) {


        val scale = remember { Animatable(0f) }

        LaunchedEffect(key1 = true) {
            scale.animateTo(5f, animationSpec = tween(850, easing = {
                OvershootInterpolator(5f).getInterpolation(it)
            }))

            delay(2000)

            navController.navigate(GuidScreens){
                popUpTo(Splash){
                    inclusive=true
                }

            }
        }

        Icon(
            painter = painterResource(id = R.drawable.splash_logo),
            contentDescription = "",
            modifier = Modifier.scale(scale.value)
        )

//        Text(
//            text = "Splash Screen",
//            textAlign = TextAlign.Center,
//            fontSize = 17.sp,
//            fontStyle = FontStyle.Italic,
//            modifier = Modifier.scale(scale.value).align(Alignment.BottomCenter)
//                .padding(bottom = 40.dp)
//        )


    }

}