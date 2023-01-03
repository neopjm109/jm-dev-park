package com.jmpark.springkotlin.dto

data class ResponseDto (
    val code: String = "",
    val message: String = "",
    val data: Any?
) {
    companion object {
        fun generate(code: String = "", message: String = "", data: Any?): ResponseDto =
            ResponseDto(code, message, data)
    }
}