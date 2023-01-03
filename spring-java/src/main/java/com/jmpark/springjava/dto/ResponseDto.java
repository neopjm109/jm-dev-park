package com.jmpark.springjava.dto;

import lombok.Data;

@Data
public class ResponseDto<T> {
    String code = "";
    String message = "";
    T data;

    public static <T> ResponseDto<T> generate(String code, String message, T data) {
        ResponseDto<T> dto = new ResponseDto<>();
        dto.setCode(code);
        dto.setMessage(message);
        dto.setData(data);
        return dto;
    }
}
