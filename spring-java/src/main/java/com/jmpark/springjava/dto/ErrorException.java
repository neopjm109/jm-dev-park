package com.jmpark.springjava.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
@Getter
public class ErrorException extends RuntimeException {
    String code = "9999";
}
