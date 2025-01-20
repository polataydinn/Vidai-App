package com.tatari.vidai.common

import com.google.firebase.database.DataSnapshot
import com.tatari.vidai.data.model.Diets
import com.tatari.vidai.data.model.DietsItem
import com.tatari.vidai.data.repository.getUser

object Session {
    var createAccount: User? = null
    var diets: Diets? = null
    var selectedDiet: DietsItem? = null

    private var user: User? = null
    suspend fun authUser(): User? {
        if(user == null) {
            user = getUser()
        }
        return user
    }

}

data class User(
    val name: String,
    val surname: String,
    val email: String,
    val password: String,
    val weight: String,
    val height: String,
) {
    val fullName: String
        get() = "$name $surname"
}