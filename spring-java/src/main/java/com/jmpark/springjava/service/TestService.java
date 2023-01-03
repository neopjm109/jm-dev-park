package com.jmpark.springjava.service;

import com.jmpark.springjava.entity.District;
import com.jmpark.springjava.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public List<District> findAllDistrict() {
        return testRepository.findAllDistrict();
    }

    public Page<District> pageDistrict(int page, int size) {
        return testRepository.pageDistrict(PageRequest.of(page, size));
    }
}
