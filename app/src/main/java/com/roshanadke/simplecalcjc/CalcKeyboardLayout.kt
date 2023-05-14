package com.roshanadke.simplecalcjc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.roshanadke.simplecalcjc.ui.theme.ButtonGreen

@Composable
fun CalcKeyboardLayout(

) {

    Box(
        modifier = Modifier
            .clip(
                RoundedCornerShape(
                    topStart = 24.dp,
                    topEnd = 24.dp
                )
            )
            .background(Color(0xFFF9F9F9))
            .padding(top = 48.dp)


    ) {


        val rowModifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)

        Column {

            Row(
                modifier = rowModifier,
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                CalcButton(
                    btnText = "C",
                    textColor = ButtonGreen,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "⌫",
                    textColor = ButtonGreen,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "%",
                    textColor = ButtonGreen,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "÷",
                    textColor = ButtonGreen,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )
            }

            Row(
                modifier = rowModifier,
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                CalcButton(
                    btnText = "7",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "8",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "9",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "x",
                    textColor = ButtonGreen,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )
            }


            Row(
                modifier = rowModifier,
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                CalcButton(
                    btnText = "4",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "5",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "6",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "-",
                    textColor = ButtonGreen,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )
            }


            Row(
                modifier = rowModifier,
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                CalcButton(
                    btnText = "1",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "2",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "3",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "+",
                    textColor = ButtonGreen,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )
            }


            Row(
                modifier = rowModifier,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                CalcButton(
                    btnText = "AC",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "0",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = ".",
                    textColor = Color.Black,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )

                CalcButton(
                    btnText = "=",
                    textColor = ButtonGreen,
                    btnBackgroundColor = Color.White,
                    onBtnClicked = {

                    }
                )
            }


        }


    }


}