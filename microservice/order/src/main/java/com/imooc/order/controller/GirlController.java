package com.imooc.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 廖师兄
 * 2018-02-03 22:25
 */
@RestController
@Slf4j
public class GirlController {

    @GetMapping("/getMsg")
    public String print() {
        //第一种方式
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8762/msg",String.class);


        log.info("response={}",response);
        return response;
    }
}
