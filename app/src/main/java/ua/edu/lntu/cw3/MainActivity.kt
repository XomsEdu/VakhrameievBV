package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Arrangement.CenterHorizontally
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.icons.Icons
import androidx.compose.material3.icons.filled.AccountCircle
import androidx.compose.material3.icons.filled.Person
import androidx.compose.material3.icons.filled.Title
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw3.ui.theme.VakhrameievBVTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VakhrameievBVTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    // Centered section with logo, name, and title
                    CenteredSection()
                }
            }
        }
    }
}

@Composable
fun CenteredSection() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = CenterVertically,
        horizontalAlignment = CenterHorizontally
    ) {
        // Logo image
        Image(
            painter = painterResource(id = R.drawable.your_logo), // Replace with your actual logo resource
            contentDescription = null,
            modifier = Modifier
                .size(100.dp) // Adjust the size as needed
                .clip(MaterialTheme.shapes.medium)
        )

        // Spacer for some separation
        Spacer(modifier = Modifier.height(16.dp))

        // Name
        Text(
            text = "Your Name",
            style = MaterialTheme.typography.h6
        )

        // Spacer for some separation
        Spacer(modifier = Modifier.height(8.dp))

        // Title
        Text(
            text = "Your Title",
            style = MaterialTheme.typography.subtitle1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CenteredSectionPreview() {
    VakhrameievBVTheme {
        CenteredSection()
    }
}