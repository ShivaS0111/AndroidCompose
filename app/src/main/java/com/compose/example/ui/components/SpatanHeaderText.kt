package com.compose.example.ui.components

import androidx.compose.material3.Text
import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

@Composable
fun SpatanHeaderText(
    text: String,
    modifier: Modifier? = null,
    color: Color? = null,
    fontSize: TextUnit? = null,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    letterSpacing: TextUnit? = null,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit ? = null,
    overflow: TextOverflow? = null,
    softWrap: Boolean = true,
    maxLines: Int ? = null,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    Text(text, style=style,
        modifier =modifier ?: Modifier,
        color= color ?: Color.Unspecified,
        fontSize =fontSize ?: TextUnit.Unspecified,
    )
}

@Composable
fun SpatanSubHeaderText(){

}


@Composable
fun SpatanNormalText(){

}

@Composable
fun SpatanMediumText(){

}

@Composable
fun SpatanBoldText(){

}