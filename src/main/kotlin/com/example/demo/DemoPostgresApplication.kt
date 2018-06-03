package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoPostgresApplication

fun main(args: Array<String>) {
    runApplication<DemoPostgresApplication>(*args)
}
