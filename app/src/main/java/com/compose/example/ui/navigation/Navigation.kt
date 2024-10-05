package com.compose.example.ui.navigation

import android.graphics.drawable.Icon

sealed class Navigation(path:String ) {

    data object Home:Navigation("/")
    data object CashGame:Navigation("/cash-game")
    data object Tourneys:Navigation("/tourney-game")
    data object Settings:Navigation("/settings")
}

data class BottomNavigation(val path:String, val navItem: NavItem):Navigation(path)


class NavItem {

}
