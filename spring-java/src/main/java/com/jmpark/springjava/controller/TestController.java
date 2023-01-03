package com.jmpark.springjava.controller;

import com.jmpark.springjava.dto.ResponseDto;
import com.jmpark.springjava.entity.District;
import com.jmpark.springjava.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
public class TestController {
    private final TestService testService;

    @GetMapping("/list")
    public ResponseDto<List<District>> listDistrict() {
        return ResponseDto.generate("0000", "", testService.findAllDistrict());
    }
    @GetMapping("/page/{page}/{size}")
    public ResponseDto<Page<District>> pageDistrict(@PathVariable int page, @PathVariable int size) {
        return ResponseDto.generate("0000", "", testService.pageDistrict(page, size));
    }
}
