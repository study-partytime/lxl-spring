package com.dida.pojo;

/**
 * @ClassName user
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/9
 * @Version 1.0
 **/
public class user {

    private String name;


    public user(String name){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                '}';
    }
}
