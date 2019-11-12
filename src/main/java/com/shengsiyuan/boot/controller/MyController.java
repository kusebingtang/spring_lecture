package com.shengsiyuan.boot.controller;


import com.shengsiyuan.boot.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private  String myName;

    @Value("${myConfig.myObject.myAge}")
    private  int myAge;


    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Object test() {

        Person person = new Person();
        person.setId(4);
        person.setName("zhangsan");
        person.setBirthDate(new Date());

        System.out.println("======@Value============");
        System.out.println(myName);
        System.out.println(myAge);

        return person;
    }
}
