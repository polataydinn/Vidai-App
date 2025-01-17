package com.tatari.vidai.common

object Session {
    var createAccount: User? = null
}

data class User(
    val name: String,
    val surname: String,
    val email: String,
    val password: String,
    val weight: String,
    val height: String,
)