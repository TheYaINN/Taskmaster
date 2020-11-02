package de.joachimsohn

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import de.joachimsohn.ui.NavigationHelper
import de.joachimsohn.ui.RegisterFragment

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        NavigationHelper.onStartReplace(this, Fragment(R.layout.fragment_login))
    }

    fun login(view: View) {
        //TODO: some checking and show error if wrong
        if (true) {
            startActivity(Intent(this, AppActivity::class.java))
            finish()
        } else {
            //TODO: show some error on UI
        }
    }

    fun changeView(view: View) {
        if (view is Button) {
            NavigationHelper.navigateDown(this, RegisterFragment())
        } else {
            //TODO:
        }
    }

}