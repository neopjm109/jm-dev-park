package com.jmpark.springkotlin.repository

import com.jmpark.springkotlin.entity.District
import com.jmpark.springkotlin.entity.QDistrict
import com.querydsl.jpa.impl.JPAQuery
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository

@Repository
class TestRepository (
    private val jpaQueryFactory: JPAQueryFactory
) : PageableRepository() {

    fun findAllDistrict(): List<District> {
        val district: QDistrict = QDistrict.district
        return jpaQueryFactory.selectFrom(district)
            .orderBy(district.id.desc())
            .fetch()
    }

    fun pageDistrict(pageable: Pageable): Page<District> {
        val district: QDistrict = QDistrict.district
        val query: JPAQuery<District> = jpaQueryFactory.selectFrom(district)
            .orderBy(district.id.desc())
        val countQuery: JPAQuery<Long> = jpaQueryFactory.select(district.count())
            .from(district)
            .orderBy(district.id.desc())
        return generatePage(query, countQuery, pageable)
    }
}