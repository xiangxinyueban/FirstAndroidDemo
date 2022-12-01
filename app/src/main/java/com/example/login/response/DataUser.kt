package com.example.login.response

data class DataUser(
    val user: User,
    val token: String,
)

data class User(
    val id: Int,
    val user_name: String,
    val create_at: Int,
)