package com.example.calculadora.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardResult(displayText: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(100.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.CenterEnd
            ) {
                Text(
                    text = displayText,
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.End
                )
            }
        }
    }
}

@Composable
fun BasicButtonGrid(onButtonClick: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            BtnC(texto = "AC", onClick = { onButtonClick("AC") })
            BtnC(texto = "<-", onClick = { onButtonClick("<-") })
            BtnC(texto = "%", onClick = { onButtonClick("%") })
            BtnC(texto = "/", onClick = { onButtonClick("/") })
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            BtnC(texto = "7", onClick = { onButtonClick("7") })
            BtnC(texto = "8", onClick = { onButtonClick("8") })
            BtnC(texto = "9", onClick = { onButtonClick("9") })
            BtnC(texto = "X", onClick = { onButtonClick("X") })
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { onButtonClick("4") }) {
                Text("4", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick("5") }) {
                Text("5", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick("6") }) {
                Text("6", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick("-") }) {
                Text("-", fontSize = 18.sp)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { onButtonClick("1") }) {
                Text("1", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick("2") }) {
                Text("2", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick("3") }) {
                Text("3", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick("+") }) {
                Text("+", fontSize = 18.sp)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { onButtonClick("_") }) {
                Text("_", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick("0") }) {
                Text("0", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick(".") }) {
                Text(".", fontSize = 18.sp)
            }
            Button(onClick = { onButtonClick("=") }) {
                Text("=", fontSize = 18.sp)
            }
        }
    }
}



@Composable
fun BtnC(
    texto: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier,
    ) {
        Text(
            text = texto,
            fontSize = 18.sp
        )
    }
}