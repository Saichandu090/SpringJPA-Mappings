package com.springjpa.onetomany.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handle(RuntimeException exception)
    {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
