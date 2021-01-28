package de.taskmaster.db

import android.app.Application
import de.taskmaster.db.dao.UserDAO
import de.taskmaster.db.dao.model.User
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DBConnector {

    fun init(application: Application) {
        val instance = AppDataBase.getInstance(application)
        userDAO = instance.UserDAO()
    }

    companion object {

        val instance: DBConnector
            get() = DBConnector()


        private lateinit var userDAO: UserDAO

        fun saveUser(user: User) {
            GlobalScope.launch {
                userDAO.insert(user)
            }
        }
    }


}