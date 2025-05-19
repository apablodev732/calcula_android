package com.example.calculadora.views

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import com.example.calculadora.components.CardResult
import com.example.calculadora.components.BasicButtonGrid


@Composable
fun HomeView() {
    ContentHomeView()
}

@Composable
fun ContentHomeView(){
    Column {
        CardResult(displayText = "0")
        BasicButtonGrid(onButtonClick = { buttonName ->
            println("$buttonName clicked")
        })
    }
}