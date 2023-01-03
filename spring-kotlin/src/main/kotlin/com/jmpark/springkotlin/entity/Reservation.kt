package com.jmpark.springkotlin.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Reservation (
    @Id
    val id : String = "",

    var ticketId: String? = null,
    var startAt: LocalDateTime? = null,
    var endAt: LocalDateTime? = null
) : BaseTimeEntity()