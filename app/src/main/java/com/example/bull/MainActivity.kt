package com.example.bull

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bull.ui.theme.BullTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BullTheme {
                var in1 by remember{
                    mutableStateOf("")
                }
                var in2 by remember{
                    mutableStateOf("")
                }
                var op by remember {
                    mutableStateOf("")
                }
               Column(

                   modifier = Modifier
                       .fillMaxSize()
                       .padding(20.dp),
                   verticalArrangement = Arrangement.Center,
                   horizontalAlignment = Alignment.CenterHorizontally
               ){
                   TextField(value =in1, onValueChange = { text ->
                       in1 =text

                   })
                   Row{
                       Button(onClick ={
                           val i= in1.length
                           var t=0
                           var a=""
                           for(t in 0 until i-1){
                               a+=in1[t]

                           }
                           in1=a
                       }){
                           Text(
                               text ="C",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={
                           in1=""
                       }){
                           Text(
                               text ="AC",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={
                           in1+= 0.toString()
                       }){
                           Text(
                               text ="0",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={
                           if(op=="+"){

                               var out = Integer.parseInt(in2) + Integer.parseInt(in1)

                               in1=out.toString()
                           }

                           else if(op=="-"){
                               var out = Integer.parseInt(in2) - Integer.parseInt(in1)
                               in1=out.toString()
                           }
                           else if(op == "X"){
                               var out = Integer.parseInt(in2) * Integer.parseInt(in1)
                               in1=out.toString()
                           }



                       }){
                           Text(
                               text ="=",
                               fontSize = 10.sp,
                           )

                       }


                   }
                   Row{
                       Button(onClick ={

                           in1= in1 + 7.toString()
                       }){
                           Text(
                               text ="7",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={

                           in1= in1 + 8.toString()
                       }){
                           Text(
                               text ="8",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={

                           in1= in1 + 9.toString()
                       }){
                           Text(
                               text ="9",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={

                           op ="X"
                           in2=in1
                           in1="X"
                       }){
                           Text(
                               text ="X",
                               fontSize = 10.sp,
                           )

                       }


                   }
                   Row{
                       Button(onClick ={

                           in1=in1 + 4.toString()
                       }){
                           Text(
                               text ="4",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={

                           in1=in1 + 5.toString()
                       }){
                           Text(
                               text ="5",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={

                           in1=in1 + 6.toString()
                       }){
                           Text(
                               text ="6",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={
                           op ="-"
                           in2=in1
                           in1="-"

                       }){
                           Text(
                               text ="-",
                               fontSize = 10.sp,
                           )

                       }


                   }
                   Row{
                       Button(onClick ={

                           in1=in1 + 1.toString()
                       }){
                           Text(
                               text ="1",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={

                           in1=in1 + 2.toString()
                       }){
                           Text(
                               text ="2",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={

                           in1=in1 + 3.toString()
                       }){
                           Text(
                               text ="3",
                               fontSize = 10.sp,
                           )

                       }
                       Button(onClick ={
                           op ="+"
                           in2=in1
                           in1="+"
                       }){
                           Text(
                               text ="+",
                               fontSize = 10.sp,
                           )

                       }


                   }
                   Divider()
               }

            }
        }
    }
}




