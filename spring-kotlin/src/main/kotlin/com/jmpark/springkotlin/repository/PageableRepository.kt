package com.jmpark.springkotlin.repository

import com.querydsl.jpa.impl.JPAQuery
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.support.PageableExecutionUtils

open class PageableRepository<Any, ID>: CrudRepository<Any, ID> {
    protected fun generatePage(query: JPAQuery<Any>, countQuery: JPAQuery<Long>, pageable: Pageable): Page<Any> {
        val list = query
            .offset(pageable.offset)
            .limit(pageable.pageSize.toLong())
            .fetch()
        return PageableExecutionUtils.getPage(
            list, pageable
        ) { countQuery.fetchOne()!! }
    }

    override fun create(): Any? {
        TODO("Not yet implemented")
    }

    override fun update(): Any? {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun one(id: ID): Any? {
        TODO("Not yet implemented")
    }

    override fun all(): kotlin.collections.List<Any> {
        TODO("Not yet implemented")
    }

    override fun page(pageable: Pageable): Page<Any> {
        TODO("Not yet implemented")
    }
}