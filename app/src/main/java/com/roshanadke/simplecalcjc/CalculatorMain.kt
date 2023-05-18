package com.roshanadke.simplecalcjc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CalculatorMain(
    calcText: String,
    onCalcButtonsClicked1: (clickedText: String) -> Unit,
    onCalcClearClicked: () -> Unit,
    onCalcClearAllClicked: () -> Unit,
    onOperatorClicked: (operator: String) -> Unit,
    onDecimalClicked: () -> Unit,
    onBackClicked: () -> Unit,
    onResultClicked: () -> Unit,

    ) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp),

        ) {

        Column(
            modifier = Modifier.padding(top = 30.dp),
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(
                text = calcText,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)

            )

            CalcKeyboardLayout(
                onCalcButtonsClicked = {
                    onCalcButtonsClicked1(it)
                },
                onCalcClearClicked = {
                    onCalcClearClicked()
                },
                onCalcClearAllClicked = {
                    onCalcClearAllClicked()
                },
                onOperatorClicked = {
                    onOperatorClicked(it)
                },
                onDecimalClicked = {
                    onDecimalClicked()
                },
                onBackClicked = {
                    onBackClicked()
                },
                onResultClicked = {
                    onResultClicked()
                },
            )

        }


    }


}