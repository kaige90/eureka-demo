package com.rfchina.service1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenkai on 2017/6/12.
 */
@RestController
public class MessageController {
    @RequestMapping(value = "/service1", method = RequestMethod.GET)
    public String service0(){
        return "Welcome to service 1";
    }

}
