package com.stu.store.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContent
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.stu.store.core.presentation.components.Navigation
import com.stu.store.core.presentation.components.SearchBar
import com.stu.store.ui.theme.StoreTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StoreTheme(dynamicColor = false) {

                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                val searchQuery = remember { mutableStateOf(TextFieldValue()) }

                Scaffold(topBar = {
                    AnimatedContent(
                        targetState = currentDestination?.route == Screen.Search.route,
                        label = ""
                    ) {
                        if (it) {
                            SearchBar(query = searchQuery.value, onQueryChange = { textField ->
                                searchQuery.value = textField
                            }, onBackClick = {
                                navController.popBackStack()
                            }, onClearClick = {
                                searchQuery.value = TextFieldValue()
                            })
                        }
                    }
                }) { paddingValues ->
                    Navigation(
                        searchQuery = searchQuery.value.text,
                        navController = navController,
                        paddingValues = paddingValues
                    )
                }
            }
        }
    }
}

