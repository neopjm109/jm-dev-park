package com.jmpark.springkotlin.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass

@Entity
@IdClass(AreaId::class)
data class TimeTableEntity (
    @Id
    var areaId: String = "",
    @Id
    var type: String = "",

    var openAt: String? = null,
    var closeAt: String? = null
) : BaseTimeEntity()