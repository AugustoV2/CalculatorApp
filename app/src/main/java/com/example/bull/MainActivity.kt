package com.example.bull

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
                val offset = Offset(5.0f, 10.0f)
                var in1 by remember{
                    mutableStateOf("")
                }
                var in2 by remember{
                    mutableStateOf("")
                }
                var op by remember {
                    mutableStateOf("")
                }
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        //.background(Color.Black)
                        .clip(
                            RoundedCornerShape(topEnd = 10.dp, topStart = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp)
                        )
                        .padding(15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

                ){
                    Text(

                        text ="Calculator",

                        style = TextStyle(
                            fontSize = 34.sp,
                            fontWeight = FontWeight.Black,
                            )
                    )
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
                       Button(

                           modifier = Modifier
                                .padding(horizontal = 5.dp, vertical = 2.dp),


                           onClick ={
                           val i= in1.length
                           var t=0
                           var a=""
                           for(t in 0 until i-1){
                               a+=in1[t]

                           }
                           in1=a
                       },
                           colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="C",
                               fontSize = 10.sp,
                              color = Color(0xFFFF9800),
                           )

                       }
                       Button(  modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={
                           in1=""
                       },
                           colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="AC",
                               fontSize = 10.sp,
                               color = Color(0xFFFF9800),
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={
                           in1+= 0.toString()
                       },
                           colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="0",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={
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



                       },
                           colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="=",
                               fontSize = 10.sp,
                               color = Color(0xFFFF9800),
                           )

                       }


                   }
                   Row{
                       Button(  modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1= in1 + 7.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(

                               text ="7",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1= in1 + 8.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               modifier = Modifier.padding(3.dp),
                               text ="8",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1= in1 + 9.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               modifier = Modifier.padding(3.dp),
                               text ="9",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           op ="X"
                           in2=in1
                           in1="X"
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               modifier = Modifier.padding(4.dp),
                               text ="X",
                               fontSize = 10.sp,
                               color = Color(0xFFFF9800),
                           )

                       }


                   }
                   Row{
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1=in1 + 4.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="4",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1=in1 + 5.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="5",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1=in1 + 6.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="6",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={
                           op ="-"
                           in2=in1
                           in1="-"

                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="-",
                               fontSize = 10.sp,
                               color = Color(0xFFFF9800),
                           )

                       }


                   }
                   Row{
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1=in1 + 1.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="1",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1=in1 + 2.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="2",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={

                           in1=in1 + 3.toString()
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="3",
                               fontSize = 10.sp,
                           )

                       }
                       Button(modifier = Modifier
                           .padding(horizontal = 5.dp, vertical = 2.dp),
                           onClick ={
                           op ="+"
                           in2=in1
                           in1="+"
                       }, colors = ButtonDefaults.buttonColors(
                               containerColor = Color.Black
                           )
                       ){
                           Text(
                               text ="+",
                               fontSize = 10.sp,
                               color = Color(0xFFFF9800),
                           )

                       }


                   }
                 //  Divider()
               }

            }
        }
    }
}




