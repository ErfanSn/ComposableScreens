package ir.erfansn.composablescreens.music.player

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import ir.erfansn.composablescreens.music.ui.MusicTheme

@Composable
fun PlayerScreen() {
    Column {
        ConstraintLayout {
            Row {
                Icon(painter =, contentDescription =)
                Surface {
                    Image(painter =, contentDescription =)
                }
                Icon(painter =, contentDescription =)
            }
            Row {
                Icon(painter =, contentDescription =)
                Column {
                    LinearProgressIndicator(progress =)
                    Row {
                        Text(text = )
                        Text(text = )
                    }
                }
                Icon(painter =, contentDescription =)
            }
        }
    }
}

@Preview
@Composable
fun PlayerScreenPreview() {
    MusicTheme {
        PlayerScreen()
    }
}
