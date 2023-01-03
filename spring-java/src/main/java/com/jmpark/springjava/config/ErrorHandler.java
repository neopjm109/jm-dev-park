package com.jmpark.springjava.config;

import com.jmpark.springjava.dto.ErrorException;
import com.jmpark.springjava.dto.ResponseDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(ErrorException.class)
    public ResponseDto<Boolean> exception(ErrorException exception) {
        return ResponseDto.generate(exception.getCode(), "error", false);
    }
}
