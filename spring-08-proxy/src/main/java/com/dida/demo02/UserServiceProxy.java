package com.dida.demo02;

/**
 * @ClassName UserServiceProxy
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/13
 * @Version 1.0
 **/
public class UserServiceProxy implements UserService{

    UserServiceImpl userService;
    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }


    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {

        userService.delete();
    }

    @Override
    public void update() {
        userService.update();
    }

    @Override
    public void query() {
        userService.query();
    }

    public void log(String msg){
        System.out.println("[warning]方法"+msg+"被调用了");
    }

}
