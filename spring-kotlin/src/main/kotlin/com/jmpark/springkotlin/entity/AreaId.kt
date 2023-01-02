package com.jmpark.springkotlin.entity

import java.io.Serializable

data class AreaId (
    val areaId: Int = 0,
    val type: String = "",
) : Serializable