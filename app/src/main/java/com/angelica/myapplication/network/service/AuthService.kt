package com.angelica.myapplication.network.service

import com.angelica.myapplication.network.dto.LoginDto
import com.angelica.myapplication.network.dto.TokenDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST ("auth")
    suspend fun login(@Body loginDto: LoginDto): Response<TokenDto>
}