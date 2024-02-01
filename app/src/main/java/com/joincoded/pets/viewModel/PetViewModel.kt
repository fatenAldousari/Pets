package com.joincoded.pets.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joincoded.pets.interfaceAPI.PetAPI
import com.joincoded.pets.model.Pet
import com.joincoded.pets.repo.PetRepo
import com.joincoded.pets.singelton.RetrofitHelper
import kotlinx.coroutines.launch
import retrofit2.create

class PetViewModel : ViewModel() {

    private val PetApi = RetrofitHelper.getInstance().create(PetAPI::class.java)
    private val repository = PetRepo(PetApi)

    var pets by mutableStateOf(listOf<Pet>())

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            try {

                pets = repository.getAllPets()

            } catch (e: Exception) {

            }

        }
    }

    fun addPet(pet: Pet) {
        viewModelScope.launch {
            try {
                var response = PetApi.addPet(pet)
                if (response.isSuccessful && response.body() != null) {
                } else {
                }
            } catch (e: Exception) {


            }
        }
    }
    fun deletePet(petID: Int){
        viewModelScope.launch {
            try {
                val response = PetApi.deletePet(petID)
                if (response.isSuccessful) {
                } else {
                }
            }catch (e: Exception) {


            }            }
    }
}