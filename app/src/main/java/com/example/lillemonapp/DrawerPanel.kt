package com.example.lillemonapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerPanel(drawerState: DrawerState? = null , scope: CoroutineScope? = null) {
    List(10) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "item $it",
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
            )

            IconButton(
                onClick = {
                    scope?.launch { drawerState?.close() }

                },
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)

            ) {
                Icon(imageVector = Icons.Default.ExitToApp,
                    contentDescription = "Exit"

                )
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun DrawerPanelPreview(){
    DrawerPanel()
}
