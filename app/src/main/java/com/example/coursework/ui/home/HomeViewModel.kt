package com.example.coursework.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coursework.domain.CarParameters
import com.example.coursework.domain.FactoryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: FactoryRepository,
) : ViewModel() {

    private val _selectListLiveData = MutableLiveData<List<CarParameters>>().apply {
        value = mutableListOf()
    }
    val selectListLiveData: LiveData<List<CarParameters>> = _selectListLiveData

    fun getCarType() {
        _selectListLiveData.value = repository.getCarType()
    }
}