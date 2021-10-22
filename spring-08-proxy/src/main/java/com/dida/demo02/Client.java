package com.dida.demo02;

/**
 * @ClassName Client
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/13
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);

        userServiceProxy.add();


    }
}
