package com.example.gmailclone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.gmailclone.R
import com.example.gmailclone.model.Accounts
import com.example.gmailclone.model.accounts

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {

    Dialog(
        onDismissRequest = { openDialog.value = false },
        properties = DialogProperties(decorFitsSystemWindows = false),
        content = {
            AccountsDialogPreview(openDialog = openDialog)
        }
    )

}

@Composable
fun AccountsDialogPreview(modifier: Modifier = Modifier, openDialog: MutableState<Boolean>) {

    Card {
        Column(
            modifier = modifier
                .padding(16.dp)
                .background(Color.Transparent)
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .background(Color.Transparent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = {openDialog.value = false}
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = "Close"
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google",
                    modifier = modifier
                        .size(40.dp)
                        .weight(2.0f)
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tutorials),
                    contentDescription = "Account",
                    modifier = modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = modifier
                        .weight(2.0f)
                        .padding(start = 16.dp, top = 3.dp),
                    verticalArrangement = Arrangement.Top
                ) {
                    Text(text = "Google", fontWeight = FontWeight.SemiBold)
                    Text(text = "Google Account")
                }
            }
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    modifier = modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(2.dp, Color.Gray)
                ) {
                    Text(
                        text = "Manage",
                        modifier = modifier.padding(8.dp),
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center
                    )
                }
            }
            LazyColumn {
                items(accounts) { account ->
                    AccountItem(account)
                }
            }
            Column {

            }
        }
    }
}

@Composable
fun AccountItem(accounts: Accounts, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        if (accounts.icon != null) {
            Image(
                painter = painterResource(id = accounts.icon),
                contentDescription = "Account",
                modifier = modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
        } else {
            Card(
                modifier = modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterVertically),
                backgroundColor = Color.Gray,
            ) {
                Text(
                    text = accounts.username.first().uppercase(),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            Column(
                modifier = modifier
                    .weight(2.0f)
                    .padding(start = 16.dp, top = 3.dp),
            ) {
                Text(
                    text = accounts.username,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = accounts.email,
                )
            }
            Text(text = "${accounts.unReadMails}+", modifier = Modifier.padding(end = 16.dp))
        }
    }
}

