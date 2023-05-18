package com.roshanadke.simplecalcjc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.roshanadke.simplecalcjc.ui.theme.SimpleCalcJcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = CalcViewModel()



        setContent {
            SimpleCalcJcTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


                    val calcText by viewModel.calcText

                    CalculatorMain(
                        calcText = calcText,
                        onCalcButtonsClicked1 = {
                            Log.d("TAG", "onCreate: called $it ")
                            viewModel.updateCalcText(it)
                            Log.d("TAG", "onCreate: cvalue: ${viewModel.getCalcText()} ")
                        },
                        onCalcClearClicked = {
                            viewModel.deleteSingleCalcText()
                        },
                        onCalcClearAllClicked = {
                            viewModel.clearAllCalcText()
                        },
                        onOperatorClicked = {
                            viewModel.addOperatorToCalcText(it)
                        },
                        onDecimalClicked = {
                            viewModel.addDecimalToCalcText()
                        },
                        onBackClicked = {
                            viewModel.deleteSingleCalcText()
                        },
                        onResultClicked = {
                            viewModel.calculateOperation()
                        },
                    )

                }
            }
        }
    }
}

