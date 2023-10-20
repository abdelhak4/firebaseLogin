package com.example.firebaselogin.presentation.sign_in

//import android.service.autofill.UserData

data class SignInResult(
    val data: UserData?,
    val errorMessage: String?
)

data class UserData(
    val userId: String,
    val username: String?,
    val profilePictureUrl: String?
)