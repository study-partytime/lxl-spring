package com.dida.demo02;

/**
 * @ClassName UserServiceImpl
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/13
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService
{
    @Override
    public void add() {
        System.out.println("添加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新一个用户");
    }

    @Override
    public void query() {
        System.out.println("查找一个用户");
    }
}
