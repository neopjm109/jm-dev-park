package com.jmpark.springkotlin.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User (
    @Id
    val id : String = "",

    var loginId : String? = null,
    var loginPwd : String? = null,
    var status : String? = null,
    var role : String? = null,
    var name : String? = null
) : BaseTimeEntity()