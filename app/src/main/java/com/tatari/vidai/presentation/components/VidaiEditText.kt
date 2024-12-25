package com.tatari.vidai.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmail
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmailError
import com.furkandogan.doganlarkuyumculuk.ui.drawables.IcEmailSelected
import com.tatari.vidai.ui.theme.DarkBlue
import com.tatari.vidai.ui.theme.Gray
import com.tatari.vidai.ui.theme.LightGray
import com.tatari.vidai.ui.theme.Orange

@Composable
fun VidaiEditTextWithoutIcons(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(
        fontSize = 14.sp,
    ),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
) {
    var focused by remember { mutableStateOf(false) }


    VidaiOutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
            .height(136.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .onFocusChanged { focusState -> focused = focusState.isFocused },
        value = value,
        onValueChange = onValueChange,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            focusedTextColor = MaterialTheme.colorScheme.onBackground,
            focusedBorderColor = DarkBlue,
            unfocusedBorderColor = LightGray,
            cursorColor = DarkBlue,
            disabledContainerColor = Color.Transparent,
            errorBorderColor = Orange,
            errorTextColor = Orange,
        ),
        placeholder = {
            Text(
                text = label,
                style = TextStyle(
                    fontSize = 14.sp,
                    color = if (focused) Color.Black else Gray,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(136.dp)
            )
        },
        textStyle = textStyle,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        minLines = 10
    )
}

@Composable
fun VidaiEditText(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    isEnabled: Boolean = true,
    errorText: String? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    leadingIcon: ImageVector? = null,
    leadingIconFocused: ImageVector? = null,
    leadingIconError: ImageVector? = null,
    textStyle: TextStyle = TextStyle(
        fontSize = 14.sp,
    ),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
) {
    var focused by remember { mutableStateOf(false) }


    VidaiOutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .onFocusChanged { focusState -> focused = focusState.isFocused },
        value = value,
        enabled = isEnabled,
        singleLine = true,
        onValueChange = onValueChange,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            focusedTextColor = MaterialTheme.colorScheme.onBackground,
            focusedBorderColor = DarkBlue,
            unfocusedBorderColor = LightGray,
            cursorColor = DarkBlue,
            disabledContainerColor = Color.Transparent,
            errorBorderColor = Orange,
            errorTextColor = Orange,
        ),
        trailingIcon = trailingIcon,
        placeholder = {
            Text(
                text = label,
                style = TextStyle(
                    fontSize = 14.sp,
                    color = if (focused) Color.Black else Gray,
                ),
            )
        },
        textStyle = textStyle,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        isError = if (focused.not()) isError else false,
        leadingIcon = {
            if (focused && leadingIconFocused != null) {
                Image(
                    imageVector = leadingIconFocused, contentDescription = null
                )
            } else if (isError && leadingIconError != null) {
                Image(
                    imageVector = leadingIconError, contentDescription = null
                )
            } else {
                leadingIcon?.let {
                    Image(
                        imageVector = leadingIcon, contentDescription = null
                    )
                }
            }

        }

    )

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VidaiOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(),
) {
    BasicTextField(
        value = value,
        modifier = modifier.defaultMinSize(
            minWidth = OutlinedTextFieldDefaults.MinWidth,
            minHeight = OutlinedTextFieldDefaults.MinHeight,
        ),
        onValueChange = { onValueChange(it) },
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        cursorBrush = SolidColor(DarkBlue),
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        decorationBox = @Composable { innerTextField ->
            OutlinedTextFieldDefaults.DecorationBox(
                value = value,
                visualTransformation = visualTransformation,
                innerTextField = innerTextField,
                placeholder = placeholder,
                label = label,
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
                prefix = prefix,
                suffix = suffix,
                supportingText = supportingText,
                singleLine = singleLine,
                enabled = enabled,
                isError = isError,
                interactionSource = interactionSource,
                colors = colors,
                container = {
                    OutlinedTextFieldDefaults.ContainerBox(
                        enabled = enabled,
                        isError = isError,
                        interactionSource = interactionSource,
                        colors = colors,
                        shape = RoundedCornerShape(12.dp),
                        focusedBorderThickness = 2.dp,
                        unfocusedBorderThickness = 1.dp,
                    )
                },
            )
        },
    )
}

@Preview
@Composable
private fun DKEditTextPreview() {
    VidaiEditText(
        value = "",
        onValueChange = {},
        label = "Email",
        modifier = Modifier.fillMaxWidth(),
        leadingIcon = Icons.IcEmail,
        leadingIconFocused = Icons.IcEmailSelected,
        leadingIconError = Icons.IcEmailError,
    )
}

@Preview
@Composable
private fun DKEditTextWithoutIconsPreview() {
    VidaiEditTextWithoutIcons(
        value = "",
        onValueChange = {},
        label = "Email",
        modifier = Modifier.fillMaxWidth(),
    )
}