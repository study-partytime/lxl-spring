package com.dida.demo01;

/**
 * @ClassName Client
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/13
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        proxy proxy = new proxy(host);
        proxy.Rent();
        proxy.seehouse();
    }
}
