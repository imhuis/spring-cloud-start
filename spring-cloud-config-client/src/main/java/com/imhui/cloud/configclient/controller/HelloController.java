package com.imhui.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zyixh
 * @date: 2020/3/22
 * @description:
 */
@RestController
public class HelloController {
    @Value("${hello-str}")
    private String str;

    @RequestMapping(value = "/hello")
    public String index(){
        return this.str;
    }
}
