package com.joincoded.pets.repo

import com.joincoded.pets.interfaceAPI.PetAPI

class PetRepo (private val api: PetAPI){


    suspend fun getAllPets () = api.getAllPets()
}