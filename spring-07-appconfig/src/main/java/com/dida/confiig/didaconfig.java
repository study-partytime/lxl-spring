package com.dida.confiig;

import com.dida.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName didaconfig
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/12
 * @Version 1.0
 **/
@Configuration
public class didaconfig {


    @Bean
    public User getUser(){
        return new User();
    }
}
