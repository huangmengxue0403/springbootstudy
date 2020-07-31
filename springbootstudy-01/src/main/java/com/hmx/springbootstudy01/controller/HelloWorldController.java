/*
 * Copyright (C) GSX Techedu Inc. All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.hmx.springbootstudy01.controller;

import com.hmx.springbootstudy01.dto.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bjhl
 * @description
 * @team wuhan operational dev.
 * @date 2020/7/31 5:16 下午
 **/
@RestController
public class HelloWorldController {
    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return "Hello World !";
    }

    @RequestMapping("/person")
    @ResponseBody
    public Person getPerson(){
        Person person = new Person();
        person.setAge(18);
        person.setName("Hello World !");
        return person;

    }
}
