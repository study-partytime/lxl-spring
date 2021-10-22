package com.dida.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/12
 * @Version 1.0
 **/
@Component
public class User {
    @Value("dida")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
