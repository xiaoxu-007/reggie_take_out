package com.xu007.reggie.common;

/**
 * 基于ThreadLocal封装工具类，
 * @author Xu007
 * @create 2022-05-14 23:16
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public  static Long getCurrentId(){
        return threadLocal.get();
    }
}
