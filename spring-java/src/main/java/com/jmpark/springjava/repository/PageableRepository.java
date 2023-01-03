package com.jmpark.springjava.repository;

import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;

import java.util.List;

public class PageableRepository {
    protected <T> Page<T> generatePage(JPAQuery<T> query, JPAQuery<Long> countQuery,  Pageable pageable) {
        List<T> list = query
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();
        return PageableExecutionUtils.getPage(list, pageable, countQuery::fetchOne);
    }
}
