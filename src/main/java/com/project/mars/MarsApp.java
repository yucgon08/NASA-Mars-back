package com.project.mars;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.project.mars.dao.mappers")
public class MarsApp {
    public static void main(String[] args) {
        SpringApplication.run(MarsApp.class, args);
    }
}
