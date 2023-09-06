package com.example.configclient.domain.test

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/client")
class CloudTestController {

    @GetMapping
    fun getUserName(@Value("\${spring.datasource.username}") username: String): String {
        return username
    }
}