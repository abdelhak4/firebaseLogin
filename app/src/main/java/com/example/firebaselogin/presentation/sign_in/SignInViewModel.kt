package com.example.firebaselogin.presentation.sign_in

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SignInViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(SignInState())
    val state = _uiState.asStateFlow()


    fun onSignInResult(signInResult: SignInResult): Unit {
        _uiState.update { it.copy(
            isSignInSuccessful = signInResult.data != null,
            signInError = signInResult.errorMessage
        ) }
    }

    fun resetState(): Unit {
         _uiState.update { SignInState() }
    }
}