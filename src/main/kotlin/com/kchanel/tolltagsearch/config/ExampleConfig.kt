package com.kchanel.tolltagsearch.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component

@Configuration
@ConfigurationProperties(prefix = "spring.example")
@PropertySource("classpath:application.properties")
@Component
class ExampleConfig {
    @Value("\${spring.example.profile}")
    lateinit var profile: String
}