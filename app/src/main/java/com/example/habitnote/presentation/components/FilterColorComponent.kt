package com.example.habitnote.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.habitnote.model.ColorItem


@Composable
fun FilterColorComponent(color: ColorItem){
    Box(
        modifier = Modifier
            .size(width = 70.dp, height = 32.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(color=color.color)
            .border(1.dp, Color.Black, shape = RoundedCornerShape(20.dp))
    ) {
        Text(
            text = color.text,
            modifier = Modifier.padding(8.dp),
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold
        )
    }
}