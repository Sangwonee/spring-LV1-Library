package com.sangwon.springlv2library.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private final int status;
    private final String message;

    public ErrorResponse(ExceptionCode exceptionCode) {
        this.status = exceptionCode.getStatus();
        this.message = exceptionCode.getMessage();
    }
}
