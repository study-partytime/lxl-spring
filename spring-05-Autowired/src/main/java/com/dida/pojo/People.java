package com.dida.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @ClassName People
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/10
 * @Version 1.0
 **/
public class People {
//    @Autowired(required = false) 设置为false
    @Autowired //先使用type查询再使用name查询
    @Qualifier("cat222")//使用这个注解强制指定bean的名字
    private Cat cat;
//    @Autowired
    @Resource(name = "dog2")//可以使用name参数指定bean 先使用name再使用type
    private Dog dog;
    private String name;


    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        System.out.println("使用了set方法");
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
