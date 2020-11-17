package de.taskmaster.auth

class AuthManager {

    companion object {

        fun login(userInformation: UserInformation): Boolean {
            return userInformation.isValid()
        }
    }
}