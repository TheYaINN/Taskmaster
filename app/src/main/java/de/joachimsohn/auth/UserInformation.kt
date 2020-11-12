package de.joachimsohn.auth

class UserInformation(private val username: String?, private val password: String?) {

    fun isValid(): Boolean {
        return username != null && password != null
    }

}
