package com.utad.shop.ui.electronics

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.utad.shop.data.local.entities.ElectronicEntity
import com.utad.shop.data.repository.ElectronicRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ElectronicViewModel @Inject constructor(
    private val electronicRepository: ElectronicRepository
) : ViewModel() {
    private val _electronic = MutableStateFlow<List<ElectronicEntity>>(emptyList())
    val movies: StateFlow<List<ElectronicEntity>> = _electronic.asStateFlow()

    private val _loading = MutableStateFlow(false)
    val loading: StateFlow<Boolean> = _loading.asStateFlow()

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage.asStateFlow()

    val electronics: StateFlow<List<ElectronicEntity>> = electronicRepository.getAllElectronics()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

}