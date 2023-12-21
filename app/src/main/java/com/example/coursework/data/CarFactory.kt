package com.example.coursework.data

import com.example.coursework.domain.Bicycle
import com.example.coursework.domain.Bike
import com.example.coursework.domain.Car
import com.example.coursework.domain.CarTypeEnum
import com.example.coursework.domain.TransportFactory

class CarFactory : TransportFactory {
    override fun createCar(type: CarTypeEnum, brand: String, model: String, color: String): Car {
        return when (type) {
            CarTypeEnum.SEDAN -> SedanCar(brand, model, color)
            CarTypeEnum.OFFROAD -> OffRoadCar(brand, model, color)
            CarTypeEnum.SPORTS -> SportsCar(brand, model, color)
        }
    }

    override fun createBike(): Bike {
        TODO("Not yet implemented")
    }

    override fun createBicycle(): Bicycle {
        TODO("Not yet implemented")
    }
}