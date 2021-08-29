package com.hachi.hachiserver.controller.advice;

import com.hachi.hachiserver.exception.common.ServiceError;
import com.hachi.hachiserver.exception.common.ServiceException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
@AllArgsConstructor
public class HandlerExceptionController {
    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<ServiceError> serviceErrorHandler(ServiceException e){
        return new ResponseEntity<>(e.getErr(), e.getErr().getErrCode());
    }
}
