package com.example.login.data

import com.example.login.response.BaseResponse
import com.example.login.response.DataUser
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginApi {
    @FormUrlEncoded
    @POST("/user/login")
    suspend fun Login(@Field("username") username: String?, @Field("password") password: String?) : Response<BaseResponse<DataUser>>
}