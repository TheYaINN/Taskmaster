package de.taskmaster.db.dao.impl

import de.taskmaster.db.AppDataBaseContext
import de.taskmaster.db.dao.UserDAO
import de.taskmaster.db.dao.model.User

class UserDAOImpl(private val context: AppDataBaseContext<User>) : UserDAO {

    override fun get(id: Int) {
        TODO("Not yet implemented")
    }

    override fun insert(user: User) {
        //context.fetchData("/someEndpoint",user::class.java)
    }

    override fun delete(user: User) {
        TODO("Not yet implemented")
    }

    override fun update(user: User) {
        TODO("Not yet implemented")
    }
}