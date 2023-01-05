package com.jmpark.springkotlin.dto

data class ResponseDto (
    val code: String = "",
    val message: String = "",
    val data: Any?
)