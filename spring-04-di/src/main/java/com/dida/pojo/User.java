package com.dida.pojo;

/**
 * @ClassName User
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/10
 * @Version 1.0
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
