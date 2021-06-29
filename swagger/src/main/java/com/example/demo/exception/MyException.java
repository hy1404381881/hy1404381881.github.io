package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 14043
 */
@Getter
@Setter
public class MyException extends RuntimeException {

    public MyException(Integer code, Exception exception) {
        this.code = code;
        this.exception = exception;
    }

    private Integer code;
    private Exception exception;
}