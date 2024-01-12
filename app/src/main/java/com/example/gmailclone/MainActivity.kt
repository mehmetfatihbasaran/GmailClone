package com.example.gmailclone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.gmailclone.components.BottomMenu
import com.example.gmailclone.components.DrawerMenu
import com.example.gmailclone.components.FAB
import com.example.gmailclone.components.HomeAppBar
import com.example.gmailclone.components.MailList
import com.example.gmailclone.ui.theme.GmailCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneTheme(
                darkTheme = false
            ) {
                Surface(modifier = Modifier.background(Color.Transparent)) {
                    GmailApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog = remember { mutableStateOf(false) }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            HomeAppBar(scaffoldState, coroutineScope, openDialog)
        },
        drawerContent = {
            DrawerMenu(scrollState)
        },
        drawerGesturesEnabled = true,
        bottomBar = {
            BottomMenu()
        },
        floatingActionButton = {
            FAB(scrollState = scrollState)
        }
    ) { paddingValues ->
        MailList(paddingValues = paddingValues, scrollState = scrollState)
    }
}

