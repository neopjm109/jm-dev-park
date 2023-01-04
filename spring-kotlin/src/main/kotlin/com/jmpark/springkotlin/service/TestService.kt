package com.jmpark.springkotlin.service

import com.jmpark.springkotlin.entity.District
import com.jmpark.springkotlin.repository.DistrictRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class TestService (
    private val districtRepository: DistrictRepository
) {
    fun findAllDistrict(): List<District> {
        return districtRepository.all()
    }

    fun pageDistrict(page: Int, size: Int): Page<District> {
        return districtRepository.page(PageRequest.of(page, size))
    }
}