package com.dida.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyInvocationHandler
 * @Description 自动代理
 * @Author lxl
 * @Date 2021/10/13
 * @Version 1.0
 **/
public class ProxyInvocationHandler implements InvocationHandler {

//    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader()),
//            new Class<?>[]{Foo.class},
//            handler);

    private Rent rent;

    public void setRent(Rent rent){
        this.rent = rent;
    }

    public Object getProxy(){
        //getClassLoader()：取得该Class对象的类装载器
        //类装载器负责从Java字符文件将字符流读入内存，并构造Class类对象，在你说的问题哪里，通过它可以得到一个文件的输入流
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object resulet = method.invoke(rent, args);

        return resulet;
    }
}
