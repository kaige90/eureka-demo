package com.rfchina.consumer0.web;

import org.springframework.beans.factory.annotation.Autowired;
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
    private RestTemplate restTemplate;

    @RequestMapping(value = "/api/hello", method = RequestMethod.GET)
    public String getMessage(){
        String url = "http://service0/service0";
        String message = restTemplate.getForObject(url, String.class);
        return message;
    }
}
