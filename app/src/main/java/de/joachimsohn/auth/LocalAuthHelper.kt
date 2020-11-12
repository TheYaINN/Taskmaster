package de.joachimsohn.auth

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity.MODE_PRIVATE

class LocalAuthHelper {

    companion object {
        private const val preferencesKey = "Taskmaster-Login"
        private const val usernameKey = "username"
        private const val passwordKey = "password"


        fun saveLoginInformation(context: Context, username: String, password: String) {
            val sp = context.getSharedPreferences("Taskmaster-Login", MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sp.edit()
            editor.putString("username", username)
            editor.putString("password", password)
            editor.apply()
        }

        fun getLoginInformation(context: Context): UserInformation {
            val loginInformation = context.getSharedPreferences(preferencesKey, MODE_PRIVATE)
            val username = loginInformation.getString(usernameKey, null)
            val password = loginInformation.getString(passwordKey, null)
            return UserInformation(username, password)
        }
    }


}

