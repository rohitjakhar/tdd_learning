package com.rohitjakhar.unittesting.unittest

import com.rohitjakhar.unittesting.Car
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ClassShould {

    private val car = Car(5.0)
    @Test
    fun loosingFuelWhenItTurnsOn(){
        car.turnsOn()

        assertEquals(4.5, car.fuel)
    }
}