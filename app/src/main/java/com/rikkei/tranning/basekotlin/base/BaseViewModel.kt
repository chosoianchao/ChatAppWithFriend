package com.rikkei.tranning.basekotlin.base

import android.util.Patterns
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

abstract class BaseViewModel : ViewModel() {
    protected var auth: FirebaseAuth? = FirebaseAuth.getInstance()
    protected var databaseReference: DatabaseReference? = FirebaseDatabase.getInstance().reference

    protected var mUser: FirebaseUser? = auth?.currentUser

    fun isEmailInvalid(email: CharSequence): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
