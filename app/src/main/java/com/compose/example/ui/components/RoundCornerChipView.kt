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
fun RoundCornerChipView(
    text: String, currency: String? = null,
    textColor: Color? = null,
    borderColor: TextUnit? = null,
) {
    SpatanNormalText(
        text,
        color = textColor,
        modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.padding))
    )
}