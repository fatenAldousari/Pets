package com.joincoded.pets.model

import androidx.core.app.GrammaticalInflectionManagerCompat.GrammaticalGender

data class Pet
    (var id: Int,
     var name: String,
     var adopted: String,
     var image: String,
     var age: String,
     var gender: String
     )
