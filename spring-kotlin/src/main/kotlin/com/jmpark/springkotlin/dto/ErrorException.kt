package com.jmpark.springkotlin.dto

import java.lang.RuntimeException

data class ErrorException (
    val code: String = "9999"
) : RuntimeException()