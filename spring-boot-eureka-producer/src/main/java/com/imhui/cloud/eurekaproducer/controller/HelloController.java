package com.imhui.cloud.eurekaproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zyixh
 * @date: 2020/3/21
 * @description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "Hello "+ name +",this is a server producer";
    }
}
