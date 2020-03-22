package com.imhui.cloud.hystrixdashboard.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: zyixh
 * @date: 2020/3/21
 * @description:
 */
@FeignClient(name = "eureka-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name);
}
