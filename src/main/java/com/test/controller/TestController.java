package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by TangZz on 2018/6/21.
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "helloWorld";
    }

}
