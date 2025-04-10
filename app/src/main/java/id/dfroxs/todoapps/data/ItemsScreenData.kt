package id.dfroxs.todoapps.data

import id.dfroxs.todoapps.R
import id.dfroxs.todoapps.model.DataInProgress
import id.dfroxs.todoapps.model.DataTaskGroup
import id.dfroxs.todoapps.ui.theme.Blue100
import id.dfroxs.todoapps.ui.theme.Orange100
import id.dfroxs.todoapps.ui.theme.Pink100
import id.dfroxs.todoapps.ui.theme.Purple100
import id.dfroxs.todoapps.ui.theme.Yellow100

val inProgressItems = listOf<DataInProgress>(
    DataInProgress(
        category = "Office Project",
        title = "Grocery shopping app design",
        primaryColor = Blue100,
        secondaryColor = Pink100,
        icon = R.drawable.ic_bag,
        progress = 0.65f
    ),
    DataInProgress(
        category = "Personal Project",
        title = "Uber Eats redesign challenge",
        primaryColor = Orange100,
        secondaryColor = Blue100,
        icon = R.drawable.ic_user,
        progress = 0.65f
    ),
    DataInProgress(
        category = "Office Project",
        title = "Landing page revamp feature",
        primaryColor = Yellow100,
        secondaryColor = Pink100,
        icon = R.drawable.ic_bag,
        progress = 0.65f
    )
)

val taskGroupItems = listOf<DataTaskGroup>(
    DataTaskGroup(
        category = "Office Project",
        totalTask = 5,
        icon = R.drawable.ic_bag,
        progress = 0.65f,
        primaryColor = Pink100
    ),
    DataTaskGroup(
        category = "Personal Project",
        totalTask = 30,
        icon = R.drawable.ic_user,
        progress = 0.5f,
        primaryColor = Purple100
    ),
    DataTaskGroup(
        category = "Daily Study",
        totalTask = 80,
        icon = R.drawable.ic_document,
        progress = 0.8f,
        primaryColor = Orange100
    ),
    DataTaskGroup(
        category = "Daily Chores",
        totalTask = 14,
        icon = R.drawable.ic_calendar,
        progress = 0.4f,
        primaryColor = Yellow100
    )
)