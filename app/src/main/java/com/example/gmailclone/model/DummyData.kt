package com.example.gmailclone.model

import com.example.gmailclone.R

val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Christy",
        subject = "Weekly Android News",
        body = "Hello Christy we have got exciting addition  to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 2,
        userName = "Agatha",
        subject = "Job Application",
        body = "This is regarding a job opportunity I found on your website.",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 3,
        userName = "Cecilia",
        subject = "Flutter News",
        body = "Hello Cecilia we have got exciting addition  to the Flutter api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 4,
        userName = "Angelo",
        subject = "Email regarding job opportunity",
        body = "This is regarding a job opportunity for the profile or android developer in our organisation.",
        timeStamp = "21:10"
    ),
    MailData(
        mailId = 5,
        userName = "Sam",
        subject = "New Event has been created",
        body = "A new event has been added to your dashboard go check it out",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 6,
        userName = "Medium",
        subject = "JetPack compose for beginners",
        body = "This article will teach you all the basics of jetpack compose.",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 7,
        userName = "Netflix",
        subject = "A new Device is using your account",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 8,
        userName = "Tutorials",
        subject = "Weekly Android News",
        body = "Hello Tutorials we have got exciting addition  to the android api",
        timeStamp = "20:10"

    ),
    MailData(
        mailId = 9,
        userName = "Denis",
        subject = "Weekly Android News",
        body = "Hello Denis we have got exciting addition  to the android api",
        timeStamp = "20:10"
    )
)

val accounts = listOf<Accounts>(
    Accounts(
        icon = R.drawable.tutorials,
        username = "TutorialsEu",
        email = "tutorial@eu.com",
        unReadMails = 99
    ),
    Accounts(
        icon = null,
        username = "Denis",
        email = "denis@gmail.com",
        unReadMails = 85
    ),
    Accounts(
        icon = null,
        username = "Christy",
        email = "christy@gmail",
        unReadMails = 10
    )
)