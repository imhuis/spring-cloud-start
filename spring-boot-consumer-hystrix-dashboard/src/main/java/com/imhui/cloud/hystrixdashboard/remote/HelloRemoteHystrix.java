package com.imhui.cloud.hystrixdashboard.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: zyixh
 * @date: 2020/3/22
 * @description:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam String name) {
        return "Hello "+ name + ",this message send failed";
    }
}
