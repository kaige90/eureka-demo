package com.rfchina.service0.web;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenkai on 2017/6/12.
 */
@RestController
public class MessageController {
    @GetMapping("service0")
    public String service0(){
        System.out.println("service 0");
        return "Welcome to service 0";
    }

}
