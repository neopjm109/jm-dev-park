package com.jmpark.springkotlin.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class TicketEntity (
    @Id
    val id : String = "",

    var areaId: Int? = null,
    var userId: String? = null,
    var type: String? = null,
    var minute: Int? = 0,
    var price: Int? = 0,
    var status: String? = null,
    var payMethod: String? = null,
    var payDate: String? = null,
    var cardCode: String? = null,
    var cardNumber: String? = null
) : BaseTimeEntity()