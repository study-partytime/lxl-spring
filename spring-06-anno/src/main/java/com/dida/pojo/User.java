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

//这个注解说明这个类被spring管理了就是bean
@Component
public class User {

    @Value("dida")
    public String name;
}
