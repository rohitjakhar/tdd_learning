package com.rohitjakhar.unittesting.acceptenceetest

import com.rohitjakhar.unittesting.Car
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class CarFeatures {

    private val engine = Engine()
    private val car = Car(6.0, engine)
    @Test
    fun carLoosingFuelWhenItTurnsOn(){
        car.turnsOn()

        assertEquals(5.5, car.fuel)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreaseTemperature(){
        car.turnsOn()

        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnOn)
    }
}