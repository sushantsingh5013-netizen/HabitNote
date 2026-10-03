package com.example.habitnote.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.habitnote.model.ColorItem
import com.example.habitnote.model.colors
import com.example.habitnote.presentation.components.FilterColorComponent

@Preview
@Composable
fun FilterScreen(){
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(horizontal = 20.dp)

    ) {
        Text(
            text = "Filter by color",
            fontSize = 32.sp,
            fontWeight = FontWeight.SemiBold,
//            modifier = Modifier.
        )
        Spacer(modifier = Modifier.height(20.dp))
        FilterColorComponent(ColorItem(color = Color.White, text = "Reset"))
        Spacer(modifier = Modifier.height(20.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(colors){color->
                FilterColorComponent(color)
            }
        }
    }

}


