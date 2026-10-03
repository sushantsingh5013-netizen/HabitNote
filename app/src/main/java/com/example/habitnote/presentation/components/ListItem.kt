package com.example.habitnote.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.habitnote.R

@Composable
fun ListItem(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(
            color = colorResource(R.color.green),
            shape = RoundedCornerShape(12.dp)
        )
    ){
        Text(
            text = "UI concepts worth existing",
            fontSize = 24.sp,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp)
        )
    }
}