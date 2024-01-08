package com.example.composeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text


import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.R


@Preview
@Composable
fun showPreview(){


    LazyColumn(content = {
        items(getDummyData()){
            RandorList(img = it.img, name = it.name, subtitle = it.subTitle)
        }
    })

//    Column (modifier = Modifier.verticalScroll(rememberScrollState())){
//        getDummyData().map {
//            RandorList(it.img, it.name,it.subTitle)
//
//        }
//    }

}





@Composable
fun RandorList(img:Int,name:String,subtitle:String){
   Card(shape = RoundedCornerShape(8.dp),
       modifier = Modifier
           .padding(8.dp)
           .fillMaxWidth()) {

       Row (verticalAlignment = Alignment.CenterVertically,
           modifier = Modifier.padding(8.dp)){
           Image(painter = painterResource(id = img),
               contentDescription ="",

               modifier = Modifier
                   .size(60.dp)
                   .padding(8.dp)
                   .weight(.15f))

           extracted(name, subtitle,Modifier.weight(.85f))
       }

   }

}

@Composable
private fun extracted(name: String, subtitle: String,modifier:Modifier) {
    Column(modifier) {
        Text(
            text = name,
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.labelLarge
        )

        Text(
            text = subtitle,
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
        )
    }
}






data class Sample(val img:Int,val name:String,val subTitle:String)




fun getDummyData(): MutableList<Sample> {

    val list= mutableListOf<Sample>()


    list.add(Sample(R.drawable.exce,"Excellent","Hi excellent"))
    list.add(Sample(R.drawable.exelent,"Excellent 2","Hi excellent"))
    list.add(Sample(R.drawable.good,"Good","Hi excellent"))
    list.add(Sample(R.drawable.good2,"Good 2","Hi excellent"))

    list.add(Sample(R.drawable.norm,"Excellent","Hi excellent"))
    list.add(Sample(R.drawable.normal,"Excellent 2","Hi excellent"))
    list.add(Sample(R.drawable.qa,"Good","Hi excellent"))
    list.add(Sample(R.drawable.rf,"Good 2","Hi excellent"))

    list.add(Sample(R.drawable.exce,"Excellent","Hi excellent"))
    list.add(Sample(R.drawable.exelent,"Excellent 2","Hi excellent"))
    list.add(Sample(R.drawable.good,"Good","Hi excellent"))
    list.add(Sample(R.drawable.good2,"Good 2","Hi excellent"))

    list.add(Sample(R.drawable.norm,"Excellent","Hi excellent"))
    list.add(Sample(R.drawable.normal,"Excellent 2","Hi excellent"))
    list.add(Sample(R.drawable.qa,"Good","Hi excellent"))
    list.add(Sample(R.drawable.rf,"Good 2","Hi excellent"))


    list.add(Sample(R.drawable.exce,"Excellent","Hi excellent"))
    list.add(Sample(R.drawable.exelent,"Excellent 2","Hi excellent"))
    list.add(Sample(R.drawable.good,"Good","Hi excellent"))
    list.add(Sample(R.drawable.good2,"Good 2","Hi excellent"))

    list.add(Sample(R.drawable.norm,"Excellent","Hi excellent"))
    list.add(Sample(R.drawable.normal,"Excellent 2","Hi excellent"))
    list.add(Sample(R.drawable.qa,"Good","Hi excellent"))
    list.add(Sample(R.drawable.rf,"Good 2","Hi excellent"))

    list.add(Sample(R.drawable.exce,"Excellent","Hi excellent"))
    list.add(Sample(R.drawable.exelent,"Excellent 2","Hi excellent"))
    list.add(Sample(R.drawable.good,"Good","Hi excellent"))
    list.add(Sample(R.drawable.good2,"Good 2","Hi excellent"))

    list.add(Sample(R.drawable.norm,"Excellent","Hi excellent"))
    list.add(Sample(R.drawable.normal,"Excellent 2","Hi excellent"))
    list.add(Sample(R.drawable.qa,"Good","Hi excellent"))
    list.add(Sample(R.drawable.rf,"Good 2","Hi excellent"))



    return list



}