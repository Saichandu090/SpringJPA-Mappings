package com.springjpa.manytomany.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<String> stringResponseEntity(SQLIntegrityConstraintViolationException e)
    {
        return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
