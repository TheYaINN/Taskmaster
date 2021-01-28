package de.taskmaster.db

import android.content.Context
import de.taskmaster.db.dao.UserDAO
import de.taskmaster.db.dao.impl.UserDAOImpl
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

abstract class AppDataBase {

    companion object {

        private var instance: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase {
            if (instance == null) {
                instance = AppDataBaseImpl()
            }
            return instance as AppDataBase
        }
    }

    abstract fun UserDAO(): UserDAO

}

class AppDataBaseImpl : AppDataBase() {

    private val userDAO: UserDAO
        get() = UserDAOImpl(AppDataBaseContext())


    override fun UserDAO(): UserDAO {
        return userDAO
    }
}

class AppDataBaseContext<T> {

    fun fetchData(endPoint: String): T {
        val url = URL(endPoint)
        val con: HttpURLConnection = url.openConnection() as HttpURLConnection
        val sb = StringBuilder()
        val bufferedReader = BufferedReader(InputStreamReader(con.inputStream))
        var json: String
        while (bufferedReader.readLine().also { json = it } != null) {
            sb.append("""
    $json
    """.trimIndent())
        }
        return Any() as T //TODO: fucking fix this
//        return T::class.java.newInstance() //sb.toString().trim { it <= ' ' }

    }

}