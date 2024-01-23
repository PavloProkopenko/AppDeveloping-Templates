package com.example.littlelemon.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.littlelemon.R

interface Destinations {
    val route: String
    val icon: Int
    val title: String
}

object Home:Destinations{
    override val route: String = "Home"
    override val icon = R.drawable.ic_home
    override val title: String = "Home"
}

object Location:Destinations{
    override val route: String = "Location"
    override val icon = R.drawable.ic_location
    override val title: String = "Location"
}
object Menu:Destinations{
    override val route: String = "Menu"
    override val icon = R.drawable.ic_menu
    override val title: String = "Menu"
}