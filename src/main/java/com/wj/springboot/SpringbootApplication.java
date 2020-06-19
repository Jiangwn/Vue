package com.wj.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//扫描controller的注解
//@ComponentScan(basePackages = {"com.wj"})
@ComponentScan("com.wj")
//扫描对mybatis的注解 dao层
@MapperScan(basePackages ="com.wj.mapper")
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
