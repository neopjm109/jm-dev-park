package com.jmpark.springkotlin.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass

@Entity
@IdClass(AreaId::class)
data class PayMethod (
    @Id
    val areaId: Int = 0,
    @Id
    var type: String = "",
) : BaseTimeEntity()