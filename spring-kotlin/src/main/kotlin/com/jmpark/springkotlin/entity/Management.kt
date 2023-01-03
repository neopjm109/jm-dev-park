package com.jmpark.springkotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Management (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Int = 0,

    var name : String? = null,
    var tel : String? = null
) : BaseTimeEntity()