package com.dida.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName lo
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/18
 * @Version 1.0
 **/
public class log implements MethodBeforeAdvice {

    //method：要执行的目标对象的方法
    //args：参数
    //o：目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
