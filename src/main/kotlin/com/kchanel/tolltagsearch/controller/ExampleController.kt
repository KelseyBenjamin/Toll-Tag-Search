package com.kchanel.tolltagsearch.controller


import com.kchanel.tolltagsearch.repository.ExampleRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController(private val exampleRepository: ExampleRepository) {

    @GetMapping("/example")
    suspend fun example(): String {
        return "example using profile: " + exampleRepository.getProfile()
    }

    @GetMapping("/example1")
    fun example1(): String {
        return "example1"
        }
}