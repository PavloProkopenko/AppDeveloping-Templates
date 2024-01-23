package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.ui.theme.Destinations
import com.example.littlelemon.ui.theme.Home
import com.example.littlelemon.ui.theme.Location
import com.example.littlelemon.ui.theme.Menu

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { MyBottomNavigation(navController = navController)}) {
        Box(Modifier.padding(it)) {
            NavHost(navController = navController, startDestination = Home.route){
                composable(Home.route){
                    HomeScreen()
                }
                composable(Location.route){
                    LocationScreen()
                }
                composable(Menu.route){
                    MenuScreen()
                }
            }
        }
    }
}

@Composable
fun MyBottomNavigation(navController: NavController) {
    val destinationList = listOf<Destinations>(
        Home,
        Location,
        Menu
    )
    val selectedIndex = rememberSaveable {
        mutableStateOf(0)
    }
    BottomNavigation {
        destinationList.forEachIndexed{index, destination -> 
            BottomNavigationItem(
                label = { Text(text = destination.title)},
                icon = {
                    Icon(
                        painter = painterResource(id = destination.icon),
                        contentDescription = destination.title
                    )
                },
                selected = index == selectedIndex.value,
                onClick = {
                    selectedIndex.value = index
                    navController.navigate(destinationList[index].route){
                        popUpTo(Home.route)
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}
