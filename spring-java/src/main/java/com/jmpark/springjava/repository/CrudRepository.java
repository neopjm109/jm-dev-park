package com.jmpark.springjava.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, ID> {
    Optional<T> create();
    Optional<T> update();
    void delete();
    Optional<T> one(ID id);
    List<T> all();
    Page<T> page(Pageable pageable);
}