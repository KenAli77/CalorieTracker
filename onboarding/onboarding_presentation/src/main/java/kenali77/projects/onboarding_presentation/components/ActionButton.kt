package kenali77.projects.onboarding_presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import kenali77.projects.core_ui.LocalSpacing

@Composable
fun ActionButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isEnabled: Boolean = false,
    textStyle: TextStyle = MaterialTheme.typography.button
) {
    val spacing = LocalSpacing.current

    Button(
        modifier = modifier,
        onClick = onClick,
        enabled = isEnabled,
        shape = RoundedCornerShape(100.dp)

    ) {
        Text(
            text = text,
            style = textStyle,
            color = MaterialTheme.colors.onPrimary,
            modifier = Modifier.padding(spacing.spaceSmall)
        )
    }
}