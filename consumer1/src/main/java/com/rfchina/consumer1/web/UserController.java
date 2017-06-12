package com.rfchina.consumer1.web;

import com.rfchina.consumer1.depend.MessageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenkai on 2017/6/12.
 */
@RestController
public class UserController {
    @Autowired
    private MessageClient messageClient;

    @GetMapping("/hello")
    public String getMessage(){
        return messageClient.getMessage();
    }

}
