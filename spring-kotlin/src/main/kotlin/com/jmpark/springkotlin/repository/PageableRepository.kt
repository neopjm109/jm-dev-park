package com.jmpark.springkotlin.repository

import com.querydsl.jpa.impl.JPAQuery
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.support.PageableExecutionUtils

open class PageableRepository {
    protected fun <Any> generatePage(query: JPAQuery<Any>, countQuery: JPAQuery<Long>, pageable: Pageable): Page<Any> {
        val list = query
            .offset(pageable.offset)
            .limit(pageable.pageSize.toLong())
            .fetch()
        return PageableExecutionUtils.getPage(
            list, pageable
        ) { countQuery.fetchOne()!! }
    }
}