package com.jmpark.springkotlin.controller

import com.jmpark.springkotlin.dto.ResponseDto
import com.jmpark.springkotlin.entity.District
import com.jmpark.springkotlin.service.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/test")
class TestController (
    private val testService: TestService
) {
    @GetMapping("/list")
    fun listDistrict() : ResponseDto = ResponseDto("0000", "", testService.findAllDistrict())

    @GetMapping("/page/{page}/{size}")
    fun pageDistrict(@PathVariable page: Int = 0, @PathVariable size: Int = 10) : ResponseDto =
        ResponseDto("0000", "", testService.pageDistrict(page, size))
}