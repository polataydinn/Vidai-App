package com.tatari.vidai.common

import com.tatari.vidai.data.model.Diets

object Session {
    var createAccount: User? = null
    var diets: Diets? = null
}

data class User(
    val name: String,
    val surname: String,
    val email: String,
    val password: String,
    val weight: String,
    val height: String,
)