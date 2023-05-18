package com.roshanadke.simplecalcjc

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel() {

    private var _calcText: MutableState<String> = mutableStateOf("")
    val calcText: State<String> = _calcText

    fun updateCalcText(newText: String) {
        _calcText.value = _calcText.value + newText
    }

    fun addOperatorToCalcText(operator: String) {
        _calcText.value = _calcText.value + operator
    }

    fun addDecimalToCalcText() {
        _calcText.value = _calcText.value + "."
    }

    fun calculateOperation() {

    }

    fun getCalcText(): String {
        return calcText.value
    }

    fun deleteSingleCalcText() {
        _calcText.value = _calcText.value.dropLast(1)
    }

    fun clearAllCalcText() {
        _calcText.value = ""
    }


}