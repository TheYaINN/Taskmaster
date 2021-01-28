package de.taskmaster.db.dao

import de.taskmaster.db.dao.model.User

interface UserDAO {

    fun get(id: Int)

    fun insert(user: User)

    fun delete(user: User)

    fun update(user: User)

}