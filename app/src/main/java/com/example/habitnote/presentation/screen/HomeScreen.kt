package com.example.habitnote.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.habitnote.R
import com.example.habitnote.presentation.components.ListItem

@Preview()
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    val isGrid by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth().padding(end = 20.dp)
                    ) {
                        Row(

                        ){
                            Text(
                                text = "Notes",
                                fontSize = 35.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Row(
                        ){
                            Icon(
                                painter = painterResource(R.drawable.baseline_color_lens_24),
                                contentDescription = null,
                                modifier = Modifier.size(40.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Icon(
                                painter = painterResource(R.drawable.baseline_grid_view_24),
                                contentDescription = null,
                                modifier = Modifier.size(40.dp)
                            )
                        }
                    }


                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                shape = FloatingActionButtonDefaults.largeShape,
                containerColor = colorResource(R.color.orange),
                contentColor = colorResource(R.color.white)
            ) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "add icon button",
                    modifier = Modifier.size(40.dp)
                )
            }
        },
        bottomBar = {
            NavigationBar(
            ) {
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.outline_notes_24),
                            contentDescription = "Notes icon"
                        )
                    },
                    label = {
                        Text("Notes")
                    }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.outline_help_24),
                            contentDescription = "Notes icon"
                        )
                    },
                    label = {
                        Text("Help")
                    }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.outline_person_24),
                            contentDescription = "Notes icon"
                        )
                    },
                    label = {
                        Text("Me")
                    }
                )
            }
        }
    ) {
        innerPadding ->
        if (false) {
            Column(
                modifier = Modifier.fillMaxSize().padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Create your first Note!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }else{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
            ) {
                if (!isGrid) {
                    LazyColumn(
                         Modifier.padding(horizontal = 20.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        items(10){
                            ListItem()
                        }
                    }
                }else{
                    LazyVerticalStaggeredGrid(
                        columns = StaggeredGridCells.Fixed(2),
                        modifier = Modifier.padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalItemSpacing = 20.dp
                    ) {
                        items(10){
                            ListItem()
                        }
                    }
                }
            }
        }

    }
}