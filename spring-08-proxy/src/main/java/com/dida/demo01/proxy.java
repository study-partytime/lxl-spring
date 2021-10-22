package com.dida.demo01;


/**
 * @ClassName proxy
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/13
 * @Version 1.0
 **/
public class proxy implements Rent{
    private Host host;
    public proxy(){
        System.out.println("中介");
    }
    public proxy(Host host){
        System.out.println("通过中介");
        this.host =host;
    }

    public void seehouse(){
        System.out.println("看看房");
    }
    @Override
    public void Rent() {
        host.Rent();
    }
}
