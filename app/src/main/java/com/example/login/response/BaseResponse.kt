package com.example.login.response

data class BaseResponse<T>(
    val code: Int,
    val data: T,
    val msg: String,
    val error: String
)
