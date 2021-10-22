package com.dida.demo03;

/**
 * @ClassName Host
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/13
 * @Version 1.0
 **/
public class Host implements Rent {

    @Override
    public void rent(){
        System.out.println("房东");
    }
}
