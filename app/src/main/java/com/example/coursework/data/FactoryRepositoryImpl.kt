package com.example.coursework.data

import com.example.coursework.domain.CarParameters
import com.example.coursework.domain.CarTypeEnum
import com.example.coursework.domain.FactoryRepository

class FactoryRepositoryImpl() : FactoryRepository {


    override fun getCarType(): List<CarParameters.TypeCar> = Storage.getCarType()

    override fun getCarBrandByType(type: CarTypeEnum): List<CarParameters.CarBrand> =
        Storage.getCarBrandByType(type)

    override fun getColor(): List<CarParameters.CarColor> = Storage.getColor()

    override fun getModels(brand: String): List<CarParameters.ModelsCar> = Storage.getModelsByBrand(brand)
}