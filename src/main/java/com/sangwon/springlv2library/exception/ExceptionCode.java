package com.sangwon.springlv2library.exception;

import lombok.Getter;

public enum ExceptionCode {
    BOOK_NOT_FOUND(404, "BOOK not found");



    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}
