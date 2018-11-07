package com.doesnotreturnempty.BibleApi.greeting

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class GreetingControllerTest {

    var greetingController: GreetingController = GreetingController()


    @BeforeEach
    internal fun setUp() {
       greetingController = GreetingController()
    }

    @Test
    internal fun greeting_GreetsNameGiven() {
        val result = greetingController.greeting("Bob")
        assertEquals(Greeting(1, "Hello, Bob"), result)
    }

    @Test
    internal fun greeting_IncrementsCounter() {
        assertEquals(Greeting(1, "Hello, Bob"), greetingController.greeting("Bob"))
        assertEquals(Greeting(2, "Hello, George"), greetingController.greeting("George"))
    }
}