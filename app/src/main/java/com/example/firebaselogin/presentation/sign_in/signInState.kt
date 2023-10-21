package com.example.firebaselogin.presentation.sign_in

import java.lang.Error

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)
