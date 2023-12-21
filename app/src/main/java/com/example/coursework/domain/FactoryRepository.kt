package com.example.coursework.domain

interface FactoryRepository {

    fun getCarType(): List<CarParameters.TypeCar>

    fun getCarBrandByType(type: CarTypeEnum): List<CarParameters.CarBrand>

    fun getColor(): List<CarParameters.CarColor>

    fun getModels(brand: String): List<CarParameters.ModelsCar>
}