package com.jmpark.springkotlin.repository

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface CrudRepository<Any, ID> {
    fun create(): Any?
    fun update(): Any?
    fun delete()
    fun one(id: ID): Any?
    fun all(): List<Any>
    fun page(pageable: Pageable): Page<Any>
}