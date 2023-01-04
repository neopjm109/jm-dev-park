package com.jmpark.springjava.repository;

import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;

import java.util.List;
import java.util.Optional;

public class PageableRepository<T, ID> implements CrudRepository<T, ID> {
    protected Page<T> generatePage(JPAQuery<T> query, JPAQuery<Long> countQuery,  Pageable pageable) {
        List<T> list = query
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();
        return PageableExecutionUtils.getPage(list, pageable, countQuery::fetchOne);
    }

    @Override
    public Optional<T> create() {
        return Optional.empty();
    }

    @Override
    public Optional<T> update() {
        return Optional.empty();
    }

    @Override
    public void delete() {

    }

    @Override
    public Optional<T> one(ID id) {
        return Optional.empty();
    }

    @Override
    public List<T> all() {
        return null;
    }

    @Override
    public Page<T> page(Pageable pageable) {
        return null;
    }
}
