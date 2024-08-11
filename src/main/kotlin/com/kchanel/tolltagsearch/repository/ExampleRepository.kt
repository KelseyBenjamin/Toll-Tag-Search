package com.kchanel.tolltagsearch.repository

import org.springframework.stereotype.Component
import com.kchanel.tolltagsearch.config.ExampleConfig

@Component
class ExampleRepository(private val config: ExampleConfig) {
    suspend fun getProfile(): String {
        return config.profile
    }
}