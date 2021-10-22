package com.dida.service;

/**
 * @ClassName UserServiceImpl
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/18
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delte");

    }

    @Override
    public void update() {
        System.out.println("update");

    }

    @Override
    public void select() {
        System.out.println("select");

    }
}
