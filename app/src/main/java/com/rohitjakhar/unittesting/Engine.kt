package com.rohitjakhar.unittesting

class Engine(
    val cc: Int,
    val horsePower: Int,
    var temperture: Int,
    var isTurnOn: Boolean
) {
    fun engineOn(){
        temperture = 95
        isTurnOn = true
    }
    fun engineOff() {
        temperture = 15
        isTurnOn = false
    }
}