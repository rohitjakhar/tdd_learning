package com.rohitjakhar.unittesting

import org.junit.Assert.assertEquals
import org.junit.Test

class EngineTest {
    val engine = Engine(
        cc = 2400,
        horsePower = 244,
        temperture = 50,
        isTurnOn = false
    )

    @Test
    fun engineTurnOn() {
        engine.engineOn()

        assertEquals(95, engine.temperture)
        assertEquals(true, engine.isTurnOn)
    }

    @Test
    fun engineTurnOff() {
        engine.engineOff()

        assertEquals(15, engine.temperture)
        assertEquals(false, engine.isTurnOn)
    }
}
