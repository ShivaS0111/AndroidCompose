package com.compose.example.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.TextUnit
import com.compose.example.R

@Composable
fun BalanceView(
    balance: Long, currency: String? = null,
    textColor: Color? = null,
    borderColor: TextUnit? = null,
) {

    Row(
        modifier = Modifier
    ) {
        SpatanHeaderText(
            balance.toString(),
            color = textColor,
            modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.padding))
        )
    }

}