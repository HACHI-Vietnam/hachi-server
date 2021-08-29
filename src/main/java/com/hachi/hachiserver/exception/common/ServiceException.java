package com.hachi.hachiserver.exception.common;

import lombok.Getter;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

@Getter
public class ServiceException extends RuntimeException{

    private final ServiceError err;
    private final Map<String, Object> params;

    public ServiceException(ServiceError err, Map<String, Object> params) {
        super(err.getMessage());
        this.err = err;
        this.params = Objects.nonNull(params) ? params: Collections.emptyMap();
    }
}
