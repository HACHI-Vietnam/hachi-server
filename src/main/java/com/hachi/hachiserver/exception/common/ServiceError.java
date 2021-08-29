package com.hachi.hachiserver.exception.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ServiceError {
    PASSWORD_NOT_MATCH(HttpStatus.UNAUTHORIZED, "err.authorize.password-not-match"),
    USER_NOT_FOUND(HttpStatus.UNAUTHORIZED, "err.authorize.user-not-found");

    ServiceError(HttpStatus errCode, String message) {
        this.errCode = errCode;
        this.message = message;
    }

    private final HttpStatus errCode;
    private final String message;
}
