package com.nurlansuleymanli.practicespring.handler;

import com.nurlansuleymanli.practicespring.exception.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handle(UserNotFoundException e) {
        return ResponseEntity.status(404).body(e.getMessage());
    }
}
