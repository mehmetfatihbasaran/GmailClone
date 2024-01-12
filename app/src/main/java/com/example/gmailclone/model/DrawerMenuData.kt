package com.example.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val title: String? = null,
    val icon: ImageVector? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {

    data object DividerOne: DrawerMenuData(
        isDivider = true
    )
    data object AllInboxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All inboxes"
    )
    data object DividerTwo: DrawerMenuData(
        isDivider = true
    )
    data object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )
    data object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social"
    )
    data object Promotions: DrawerMenuData(
        icon = Icons.Outlined.Tag,
        title = "Promotions",
    )
    data object HeaderOne: DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS"
    )
    data object Starred: DrawerMenuData(
        icon = Icons.Outlined.StarOutline,
        title = "Starred"
    )

    data object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    )
    data object Important: DrawerMenuData(
        icon = Icons.Outlined.Label,
        title = "Important"
    )
    data object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )
    data object Schedule: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled"
    )
    data object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )
    data object Draft: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )
    data object AllMail: DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "All Mail"
    )
    data object HeaderTwo: DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )
    data object Calendar: DrawerMenuData(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )
    data object Contacts: DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )
    data object DividerThree: DrawerMenuData(
        isDivider = true
    )
    data object Setting: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )
    data object Help: DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help & FeedBack"
    )

    data object Drafts: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )

    data object Spam: DrawerMenuData(
        icon = Icons.Outlined.Report,
        title = "Spam"
    )

    data object Trash: DrawerMenuData(
        icon = Icons.Outlined.Delete,
        title = "Trash"
    )

    data object More: DrawerMenuData(
        icon = Icons.Outlined.MoreVert,
        title = "More"
    )

}