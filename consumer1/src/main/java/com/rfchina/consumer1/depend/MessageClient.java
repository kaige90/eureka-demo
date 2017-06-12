package com.rfchina.consumer1.depend;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chenkai on 2017/6/12.
 */
@FeignClient("service0")
public interface MessageClient {
    @RequestMapping(value = "service0", method = RequestMethod.GET)
    String getMessage();
}
