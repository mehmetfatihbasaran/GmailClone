package com.example.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String
) {

    data object Home : BottomMenuData(
        icon = Icons.Outlined.Home,
        title = "Home"
    )

    data object Mail : BottomMenuData(
        icon = Icons.Outlined.Email,
        title = "Mail"
    )

    data object Meet : BottomMenuData(
        icon = Icons.Outlined.VideoCall,
        title = "Meet"
    )

}