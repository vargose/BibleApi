package com.doesnotreturnempty.BibleApi.greeting

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@ExtendWith(SpringExtension::class)
@WebMvcTest
class MyControllerTests(@Autowired val mvc: MockMvc) {

    @Test
    @Throws(Exception::class)
    fun greeting_ReturnsJson_AndReturnsDefaultNameWorld() {
        this.mvc.perform(get("/greeting"))
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(content().json("{ content:'Hello, World'}"))
    }

    @Test
    @Throws(Exception::class)
    fun greeting_ReturnsJson_AndReturnsNamePassedInQuery() {
        this.mvc.perform(get("/greeting").param("name","Bob"))
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(content().json("{ content:'Hello, Bob'}"))
    }

}