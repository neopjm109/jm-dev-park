package com.jmpark.springkotlin.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class BaseCodeEntity (
    @Id
    val code : String = "",

    var data1 : String? = null,
    var data2 : String? = null,
    var data3 : String? = null,
    var data4 : String? = null
) : BaseTimeEntity()