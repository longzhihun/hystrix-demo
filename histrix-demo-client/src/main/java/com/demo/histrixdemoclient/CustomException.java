package com.demo.histrixdemoclient;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FAILED_DEPENDENCY)
public class CustomException extends RuntimeException {
    public CustomException(String errmsg) {
        super(errmsg);
    }
}
