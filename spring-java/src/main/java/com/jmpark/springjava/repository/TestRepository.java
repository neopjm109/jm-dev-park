package com.jmpark.springjava.repository;

import com.jmpark.springjava.entity.District;
import com.jmpark.springjava.entity.QDistrict;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TestRepository extends PageableRepository {
    private final JPAQueryFactory jpaQueryFactory;

    public List<District> findAllDistrict() {
        QDistrict district = QDistrict.district;
        return jpaQueryFactory.selectFrom(district)
                .orderBy(district.id.desc())
                .fetch();
    }

    public Page<District> pageDistrict(Pageable pageable) {
        QDistrict district = QDistrict.district;
        JPAQuery<District> query = jpaQueryFactory.selectFrom(district)
                .orderBy(district.id.desc());
        JPAQuery<Long> countQuery = jpaQueryFactory.select(district.count())
                .from(district)
                .orderBy(district.id.desc());
        return generatePage(query, countQuery, pageable);
    }
}
