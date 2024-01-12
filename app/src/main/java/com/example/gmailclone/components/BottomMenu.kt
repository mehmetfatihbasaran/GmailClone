package com.example.gmailclone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.gmailclone.model.BottomMenuData

@Composable
fun BottomMenu() {

    val items = listOf(
        BottomMenuData.Home,
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        contentColor = Color.Black
    ) {
        items.forEach { bottomItem ->
            BottomNavigationItem(
                selected = false,
                alwaysShowLabel = true,
                onClick = { /*TODO*/ },
                icon = { Icon(imageVector = bottomItem.icon, contentDescription = bottomItem.title) },
                label = { Text(text = bottomItem.title) })
        }
    }

}