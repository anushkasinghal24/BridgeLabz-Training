package com.payrollsuite.employeepayroll.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidRegisterRequestException.class)
    public ResponseEntity<ErrorResponse> handleInvalidRegisterRequest(
            InvalidRegisterRequestException invalidRegisterRequestException
    ){
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(
                ErrorResponse.builder()
                        .msg(invalidRegisterRequestException.getMessage())
                        .httpStatus(HttpStatus.NOT_ACCEPTABLE)
                        .statusCode(HttpStatus.NOT_ACCEPTABLE.value())
                        .dateTime(LocalDateTime.now())
                        .build()
        );
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleEmployeeNotFound(
            EmployeeNotFoundException employeeNotFoundException
    ){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                ErrorResponse.builder()
                        .msg(employeeNotFoundException.getMessage())
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .statusCode(HttpStatus.NOT_FOUND.value())
                        .dateTime(LocalDateTime.now())
                        .build()
        );
    }
}

