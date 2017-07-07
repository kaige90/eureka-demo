package com.rfchina.consumer0.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 服务降级处理
 * Created by chenkai2 on 2017/7/7.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String say(){
        String url = "http://service0/service0";
        String message = restTemplate.getForObject(url, String.class);
        return message;
    }

    public String helloFallback(){
        return "service 0 error";
    }
}
