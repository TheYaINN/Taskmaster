package de.taskmaster

interface APIConnector {

    fun postRequest(vararg arguments: String): String

}