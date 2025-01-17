package com.tatari.vidai.data.repository

import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.tatari.vidai.common.User
import com.tatari.vidai.presentation.create_password.USERS_REF
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred

suspend fun getUser(): User? {
    val uid = Firebase.auth.currentUser?.uid ?: return null
    val user = Firebase.database.getReference(USERS_REF).child(uid).toDefered().await().toUser()
    return user
}

fun DataSnapshot.toUser(): User = User(
    name = child("name").value.toString(),
    surname = child("surname").value.toString(),
    email = child("email").value.toString(),
    password = child("password").value.toString(),
    weight = child("weight").value.toString(),
    height = child("height").value.toString(),
)

fun DatabaseReference.toDefered(): Deferred<DataSnapshot> {
    val deferred = CompletableDeferred<DataSnapshot>()

    deferred.invokeOnCompletion {
        if (deferred.isCancelled) {
            // optional, handle coroutine cancellation however you'd like here
        }
    }

    this.addListenerForSingleValueEvent(object : ValueEventListener {
        override fun onCancelled(p0: DatabaseError) {
            deferred.completeExceptionally(p0.toException())
        }

        override fun onDataChange(p0: DataSnapshot) {
            deferred.complete(p0)
        }
    })
    return deferred
}
