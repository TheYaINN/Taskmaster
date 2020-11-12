package de.joachimsohn.auth

class AuthManager {

    companion object {

        fun login(userInformation: UserInformation): Boolean {
            return userInformation.isValid()
        }
    }
}