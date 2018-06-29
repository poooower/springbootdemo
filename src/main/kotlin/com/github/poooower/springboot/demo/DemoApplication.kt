package com.github.poooower.springboot.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@Controller
class Controller {
	@RequestMapping("/")
	@ResponseBody
	fun home() : String {
		return "Hello World! ${System.currentTimeMillis()}"
	} 
}
