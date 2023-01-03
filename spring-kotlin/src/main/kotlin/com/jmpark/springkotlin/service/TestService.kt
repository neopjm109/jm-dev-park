package com.jmpark.springkotlin.service

import com.jmpark.springkotlin.entity.District
import com.jmpark.springkotlin.repository.TestRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class TestService (
    private val testRepository: TestRepository
) {
    fun findAllDistrict(): List<District> {
        return testRepository.findAllDistrict()
    }

    fun pageDistrict(page: Int, size: Int): Page<District> {
        return testRepository.pageDistrict(PageRequest.of(page, size))
    }
}