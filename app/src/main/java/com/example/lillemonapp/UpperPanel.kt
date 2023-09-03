package com.example.lillemonapp


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lillemonapp.R

@Composable
fun UpperPanel(){
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0XFF495E57))

    ) {
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 32.sp,
            color = Color(0XFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),


            )
        Text(
            text = stringResource(id = R.string.city),
            fontSize = 24.sp,
            color = Color(0XFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)

        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            horizontalArrangement = Arrangement.Start

        )
        {

            Text(
                text = stringResource(id = R.string.descriptionOne),
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 28.dp)
                    .fillMaxWidth(0.6f)

            )
            Image(
                painter = painterResource(id = R.drawable.upperpanelimage) ,
                contentDescription ="Main Image",
                Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .fillMaxSize()
            )

        }
        Button(

            onClick = {
                Toast.makeText(context,"Order Successful",Toast.LENGTH_SHORT).show()
            },
            Modifier.padding(start = 20.dp),
            colors = ButtonDefaults.buttonColors(Color(0XFFF4CE14)),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(

                text = stringResource(id = R.string.order),
                color = Color.Black
            )
        }


    }

}
@Preview
@Composable
fun UpperPanelPreview() {
    UpperPanel()
}