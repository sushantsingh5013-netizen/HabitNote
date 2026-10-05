package com.example.habitnote.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.habitnote.model.ColorItem

@Composable
fun CircleColorComponent(color : ColorItem) {

    Box(
        modifier = Modifier
            .size(60.dp)
            .background(
                color = color.color,
                shape = CircleShape
            )
            .border(1.dp, Color.Black, shape = CircleShape),
    ) {

    }
}