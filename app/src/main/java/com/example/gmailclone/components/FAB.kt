package com.example.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun FAB(scrollState: ScrollState) {

    if (scrollState.value > 100) {
        ExtendedFloatingActionButton(
            text = {
                Text(text = "Compose", fontSize = 16.sp)
            },
            onClick = { },
            icon = {
                Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit")
            }
        )
    } else {
        FloatingActionButton(
            onClick = {

            },
            backgroundColor = MaterialTheme.colors.background
        ) {
            Icon(imageVector = Icons.Outlined.Edit, contentDescription = "Edit")
        }
    }
}