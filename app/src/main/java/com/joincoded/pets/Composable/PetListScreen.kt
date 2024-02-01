package com.joincoded.pets.Composable

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.joincoded.pets.viewModel.PetViewModel

@Composable
fun PetListScreen(modifier: Modifier = Modifier, viewModel: PetViewModel = viewModel()){
    val pets = viewModel.pets
    LazyColumn(modifier = modifier){
        items(pets){ pets ->
            PetItem(pets)
        }
    }
}