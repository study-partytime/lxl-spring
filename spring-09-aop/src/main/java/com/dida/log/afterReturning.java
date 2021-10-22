package com.dida.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName afterReturning
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/18
 * @Version 1.0
 **/
public class afterReturning implements AfterReturningAdvice {
    //第一个参数：返回值
    //method:要执行的对象的方法
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回值为"+o);
    }
}
