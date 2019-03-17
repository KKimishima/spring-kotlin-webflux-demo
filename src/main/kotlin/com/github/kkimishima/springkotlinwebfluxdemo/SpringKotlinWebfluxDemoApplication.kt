package com.github.kkimishima.springkotlinwebfluxdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinWebfluxDemoApplication

fun main(args: Array<String>) {
  runApplication<SpringKotlinWebfluxDemoApplication>(*args)
}
