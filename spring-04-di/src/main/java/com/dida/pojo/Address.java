package com.dida.pojo;

/**
 * @ClassName Address
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/9
 * @Version 1.0
 **/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
