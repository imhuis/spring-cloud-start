package com.imhui.cloud.hystrixdashboard.controller;

import com.imhui.cloud.hystrixdashboard.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zyixh
 * @date: 2020/3/21
 * @description:
 */
@RestController
public class CustomerHelloController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return helloRemote.hello(name);
    }
}
