package com.jmpark.springkotlin.repository

import com.jmpark.springkotlin.entity.District
import com.jmpark.springkotlin.entity.QDistrict
import com.querydsl.jpa.impl.JPAQuery
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository

@Repository
class DistrictRepository (
    private val jpaQueryFactory: JPAQueryFactory
) : PageableRepository<District, Int>() {

    override fun all(): List<District> {
        val district: QDistrict = QDistrict.district
        return jpaQueryFactory.selectFrom(district)
            .orderBy(district.id.desc())
            .fetch()
    }

    override fun page(pageable: Pageable): Page<District> {
        val district: QDistrict = QDistrict.district
        val query: JPAQuery<District> = jpaQueryFactory.selectFrom(district)
            .orderBy(district.id.desc())
        val countQuery: JPAQuery<Long> = jpaQueryFactory.select(district.count())
            .from(district)
            .orderBy(district.id.desc())
        return generatePage(query, countQuery, pageable)
    }
}