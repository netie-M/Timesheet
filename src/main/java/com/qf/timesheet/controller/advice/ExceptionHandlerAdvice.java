
package com.qf.timesheet.controller.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.qf.timesheet.controller.vo.BaseResponse;


@RestControllerAdvice
public class ExceptionHandlerAdvice {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    
    /**
     * 基础状态：成功
     */
    public static final String OK = "OK";
    /**
     * 状态：失败
     */
    public static final String FAIL = "FAIL";

    
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public BaseResponse<String> handleNotFound(Exception e) {
        logger.info(e.getMessage());
        return new BaseResponse<String>(HttpStatus.NOT_FOUND.name(),e.getMessage());
    }
}
