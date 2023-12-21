package com.example.coursework.domain

sealed class CarParameters {
    data class CarBrand(
        val brand: String,
    ) : CarParameters()

    data class CarColor(
        val color: String
    ) : CarParameters()

    data class ModelsCar(
        val model: String
    ) : CarParameters()

    data class TypeCar(
        val type: String
    ) : CarParameters()
}