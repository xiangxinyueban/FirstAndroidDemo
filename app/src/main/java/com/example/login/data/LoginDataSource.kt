package com.example.login.data

import android.telecom.Call
import android.util.Log
import com.example.login.data.model.LoggedInUser
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            Log.d("login: ", "started")

            // launching a new coroutine

            GlobalScope.launch {
                val loginApi = RetrofitHelper.getInstance().create(LoginApi::class.java)
                val result = loginApi.Login(username, password)
                if (result != null)
                // Checking the results
                    Log.d("ayush: ", result.toString())

            }
            // TODO: handle loggedInUser authentication
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}
