package com.doesnotreturnempty.BibleApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BibleApiApplication

fun main(args: Array<String>) {
    runApplication<BibleApiApplication>(*args)
}
