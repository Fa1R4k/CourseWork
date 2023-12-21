package com.example.coursework.domain

interface TransportFactory {
    fun createCar(type: CarTypeEnum, brand: String, model: String, color: String): Car
    fun createBike(): Bike
    fun createBicycle(): Bicycle
}