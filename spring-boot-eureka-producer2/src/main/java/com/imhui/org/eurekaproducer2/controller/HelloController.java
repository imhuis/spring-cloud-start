package com.imhui.org.eurekaproducer2.controller;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${server.port}")
    private int port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "Hello "+ name +",this is a another server producer and port={"+ port +"}";
    }
}
