package com.dida.demo03;

/**
 * @ClassName Clent
 * @Description 访问类
 * @Author lxl
 * @Date 2021/10/13
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：null
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
