package id.dfroxs.todoapps.model

import id.dfroxs.todoapps.R

sealed class NavScreen(val route: String, val title: String, val icon: Int) {
    object Home : NavScreen("home", "Home", R.drawable.ic_home)
    object Calendar : NavScreen("calendar", "Calendar", R.drawable.ic_calendar)
    object Create : NavScreen("create", "Create", R.drawable.ic_add)
    object Task : NavScreen("task", "Task", R.drawable.ic_document)
    object Profile : NavScreen("profile", "Profile", R.drawable.ic_user)
}
