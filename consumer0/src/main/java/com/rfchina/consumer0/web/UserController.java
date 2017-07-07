package com.rfchina.consumer0.web;

import com.rfchina.consumer0.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenkai on 2017/6/12.
 */
@RestController
public class UserController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/api/hello")
    public String getMessage(){
        return helloService.say();
    }
}
