WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<GlobalException> globalExceptionHandler(){
        // log
        // switch case
        return new ResponseEntity<>(new GlobalException(), HttpStatus.BAD_REQUEST);
    }


}
