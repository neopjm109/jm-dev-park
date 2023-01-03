package com.jmpark.springkotlin.config

import com.jmpark.springkotlin.dto.ErrorException
import com.jmpark.springkotlin.dto.ResponseDto
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorHandler {
    @ExceptionHandler(ErrorException::class)
    fun exception(exception: ErrorException): ResponseDto {
        return ResponseDto.generate(exception.code, "error", false)
    }
}