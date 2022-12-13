package com.example.sanxuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.sanxuan.mapper")
public class SanxuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SanxuanApplication.class, args);
    }

}
