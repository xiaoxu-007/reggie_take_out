package com.xu007.reggie.common;

/**
 * 自定义业务异常类
 * @author Xu007
 * @create 2022-05-16 2:17
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
