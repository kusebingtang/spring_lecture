package com.shengsiyuan.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        //打印MyApplication的类加载器
        //cdSystem.out.println("MyApplication classloader: " + MyApplication.class.getClassLoader());
        SpringApplication.run(MyApplication.class, args);
    }
}
