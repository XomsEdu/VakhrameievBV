package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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

                        // Spacer for additional separation
                        Spacer(modifier = Modifier.height(32.dp))

                        // Contact Section
                        ContactSection()
                    }
                }
            }
        }
    }
}

@Composable
fun ContactSection() {
    // Dummy contact numbers, replace them with actual data
    val contactNumbers = listOf("123-456-7890", "987-654-3210", "555-123-4567")

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        // Display the contact numbers in a column
        contactNumbers.forEach { number ->
            Text(
                text = number,
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CenteredSectionWithContactPreview() {
    VakhrameievBVTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = CenterVertically,
            horizontalAlignment = CenterHorizontally
        ) {
            // Centered section with logo, name, title, and contact
            CenteredSection()
            ContactSection()
        }
    }
}
