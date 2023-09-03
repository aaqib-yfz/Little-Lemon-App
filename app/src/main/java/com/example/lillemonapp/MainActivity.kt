package com.example.lillemonapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lillemonapp.ui.theme.LilLemonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                LilLemonAppTheme {
                HomeScreen()
            }
        }
    }

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
//    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val   scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerContent = {
            DrawerPanel()
        },
        drawerState =  drawerState
    )
    {
        Scaffold(
            topBar = {
                TopAppBar(drawerState , scope = scope)
            },

            )
        {
            Column(modifier = Modifier.padding(top=20.dp)) {
                UpperPanel()
                LowerPanel()
            }
        }

    }
}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}