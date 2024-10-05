package com.compose.example.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class Route {
    companion object {

        const val home = "/"

        const val Notes = "notes"
        const val AddNote = "add-note"
        const val Labels = "labels"
        const val LablesSelected = "labels/{selected}"
        const val EditNote = "edit-note"
        const val EditNoteById = "$EditNote/{noteId}"
        const val AddLabel = "add-label"


        const val startDestination = Notes
    }
}

@Composable
fun HomeNavigationComponent(navController: NavHostController) {

    NavHost(navController, startDestination = "/") {
        composable("/cash-games") {
            MovieListScreen(navHostController = navHostController)
        }
//        composable(NavItem.Tournament.path) { TournamentScreen() }
//        composable(NavItem.Contest.path) { ContestsScreen() }
//        composable(NavItem.Promotion.path) { PromotionsScreen() }
//
//        composable("Wallet") { WalletView(navController) }
//        composable("ReleaseNotes") { ReleaseNotesView(navController) }
//        composable("Withdraw") { WithdrawView(navController) }
//        composable("AddBankAccounts") { AddBankAccountView(navController) }
    }

}

@Composable
fun CashScreen() {
    TODO("Not yet implemented")
}
