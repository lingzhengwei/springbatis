package com.ext.springbatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ext.springbatis.dao")//将项目中对应的mapper类的路径加进来就可以了
public class SpringbatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbatisApplication.class, args);
    }

}
