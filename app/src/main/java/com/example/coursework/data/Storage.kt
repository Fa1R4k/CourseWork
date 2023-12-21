package com.example.coursework.data

import com.example.coursework.domain.CarParameters
import com.example.coursework.domain.CarTypeEnum
import kotlin.random.Random

object Storage {
    private val listCarType =
        listOf(
            CarParameters.TypeCar("Седан"), CarParameters.TypeCar("Внедорожник"),
            CarParameters.TypeCar("Спортивный")
        )

    private val listCarSedan = listOf(
        CarParameters.CarBrand("Toyota"),
        CarParameters.CarBrand("Skoda"),
        CarParameters.CarBrand("Kia")
    )
    private val listCarOffRoadCar =
        listOf(
            CarParameters.CarBrand("Toyota"),
            CarParameters.CarBrand("Land Rover"),
            CarParameters.CarBrand("Nissan")
        )
    private val listCarSportCar =
        listOf(
            CarParameters.CarBrand("Porshe"),
            CarParameters.CarBrand("Lamborghini"),
            CarParameters.CarBrand("Ferrari")
        )

    private val mapCarModels = mapOf(
        "Toyota" to listOf(
            CarParameters.ModelsCar("Camry"),
            CarParameters.ModelsCar("Corolla"),
            CarParameters.ModelsCar("Avalon")
        ),
        "Skoda" to listOf(
            CarParameters.ModelsCar("Octavia"),
            CarParameters.ModelsCar("Superb"),
            CarParameters.ModelsCar("Rapid")
        ),
        "Kia" to listOf(
            CarParameters.ModelsCar("Optima"),
            CarParameters.ModelsCar("Forte"),
            CarParameters.ModelsCar("Cadenza")
        ),
        "Jeep" to listOf(
            CarParameters.ModelsCar("Wrangler"),
            CarParameters.ModelsCar("Grand Cherokee"),
            CarParameters.ModelsCar("Cherokee")
        ),
        "Land Rover" to listOf(
            CarParameters.ModelsCar("Range Rover"),
            CarParameters.ModelsCar("Discovery"),
            CarParameters.ModelsCar("Defender")
        ),
        "Nissan" to listOf(
            CarParameters.ModelsCar("Patrol"),
            CarParameters.ModelsCar("X-Trail"), CarParameters.ModelsCar("Armada")
        ),
        "Porsche" to listOf(
            CarParameters.ModelsCar("911"),
            CarParameters.ModelsCar("Cayman"), CarParameters.ModelsCar("Panamera")
        ),
        "Lamborghini" to listOf(
            CarParameters.ModelsCar("Aventador"),
            CarParameters.ModelsCar("Huracan"), CarParameters.ModelsCar("Urus")
        ),
        "Ferrari" to listOf(
            CarParameters.ModelsCar("488 GTB"),
            CarParameters.ModelsCar("F8 Tributo"), CarParameters.ModelsCar("Portofino")
        )

    )
    private val colorList =
        listOf(
            CarParameters.CarColor("Черный"),
            CarParameters.CarColor("Белый"), CarParameters.CarColor("Синий"),
            CarParameters.CarColor("Оранжевый"),
            CarParameters.CarColor("Красный"), CarParameters.CarColor("Фиолетовый"),
            CarParameters.CarColor("Зеленый")
        )

    fun getCarType(): List<CarParameters.TypeCar> = listCarType

    fun getCarBrandByType(type: CarTypeEnum): List<CarParameters.CarBrand> {
        return when (type) {
            CarTypeEnum.SPORTS -> listCarSportCar
            CarTypeEnum.OFFROAD -> listCarOffRoadCar
            CarTypeEnum.SEDAN -> listCarSedan
        }
    }

    fun getColor(): List<CarParameters.CarColor> {
        return colorList.shuffled().subList(0, Random.nextInt(2, colorList.size - 1))
    }

    fun getModelsByBrand(brand: String): List<CarParameters.ModelsCar> {
        return mapCarModels[brand] ?: emptyList()
    }
}