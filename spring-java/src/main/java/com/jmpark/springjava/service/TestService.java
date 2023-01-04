package com.jmpark.springjava.service;

import com.jmpark.springjava.entity.District;
import com.jmpark.springjava.repository.DistrictRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final DistrictRepository districtRepository;

    public List<District> findAllDistrict() {
        return districtRepository.all();
    }

    public Page<District> pageDistrict(int page, int size) {
        return districtRepository.page(PageRequest.of(page, size));
    }
}
