package fr.esgi.profilcompose

import android.content.ClipData
import android.content.ClipboardManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import fr.esgi.profilcompose.ui.theme.ProfilComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ProfilComposeTheme {
                DeveloperProfileScreen(
                    profile = melvynProfile,
                    onContactClick = { copyEmail(melvynProfile.email) }
                )
            }
        }
    }

    private fun copyEmail(email: String) {
        val clipboard = getSystemService(ClipboardManager::class.java)
        clipboard.setPrimaryClip(ClipData.newPlainText(getString(R.string.contact_email), email))

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
            Toast.makeText(this, R.string.email_copied, Toast.LENGTH_SHORT).show()
        }
    }
}
