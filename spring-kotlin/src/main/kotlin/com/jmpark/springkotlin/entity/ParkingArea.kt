package com.jmpark.springkotlin.entity

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class ParkingArea (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Int = 0,

    var districtId: String? = null,
    var code: String? = null,
    var name: String? = null,
    var type: String? = null,
    var category: String? = null,
    var segment: Int? = 0,
    var level: String? = null,
    var isRotation: Int? = 0,
    var isPay: Int? = 0,
    var memo: String? = null,
    var managementId: Int? = 0,
    var latitude: BigDecimal? = BigDecimal.ZERO,
    var longitude: BigDecimal? = BigDecimal.ZERO,
    var lastUpdated: String? = null
) : BaseTimeEntity()