package de.taskmaster.auth

class AuthManager {

    companion object {

        fun login(userInformation: _root_ide_package_.de.taskmaster.auth.UserInformation): Boolean {
            return userInformation.isValid()
        }
    }
}