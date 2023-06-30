package com.test.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    //处理异常
    @ExceptionHandler(Exception.class) //指定能够处理的异常类型
    @ResponseBody
    public String  ex(Exception e){
        log.info("报错信息:{}",e.getMessage());//打印堆栈中的异常信息
        //捕获到异常之后，响应一个标准的Result
        return "error";
    }
}