package de.joachimsohn

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class AppActivity : AppCompatActivity() {

    /* val navView: BottomNavigationView = findViewById(R.id.nav_view)
     val navController = findNavController(R.id.nav_host_fragment)
     navView.setupWithNavController(navController)*/

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.fragment_login)
    }

}