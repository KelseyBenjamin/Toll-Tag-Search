package com.kchanel.tolltagsearch.controller


import com.kchanel.tolltagsearch.repository.ExampleRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/example")
class ExampleController(private val exampleRepository: ExampleRepository) {

    @GetMapping("/profile")
    suspend fun example(): String {
        return "example using profile: " + exampleRepository.getProfile()
    }

    @GetMapping("/demo")
    fun example1(): String {
        return "example"
        }
}