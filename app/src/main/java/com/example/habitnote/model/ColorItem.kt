package com.example.habitnote.model

import androidx.compose.ui.graphics.Color
import com.example.habitnote.ui.theme.blue
import com.example.habitnote.ui.theme.dark_violet
import com.example.habitnote.ui.theme.green
import com.example.habitnote.ui.theme.greyDark
import com.example.habitnote.ui.theme.greyWhite
import com.example.habitnote.ui.theme.orange
import com.example.habitnote.ui.theme.pink
import com.example.habitnote.ui.theme.red
import com.example.habitnote.ui.theme.rose
import com.example.habitnote.ui.theme.violet
import com.example.habitnote.ui.theme.yellow

data class ColorItem(val color : Color, val text : String = "")

val colors = listOf<ColorItem>(
    ColorItem(color = Color.White),
    ColorItem(color = red),
    ColorItem(color = orange),
    ColorItem(color = yellow),
    ColorItem(color = green),
    ColorItem(color = blue),
    ColorItem(color = pink),
    ColorItem(color = violet),
    ColorItem(color = dark_violet),
    ColorItem(color = rose),
    ColorItem(color = greyWhite),
    ColorItem(color = greyDark),

    )

