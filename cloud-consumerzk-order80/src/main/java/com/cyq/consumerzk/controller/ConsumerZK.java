package com.cyq.consumerzk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerZK {

    public static String URL_ZK = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer/zk")
    public String getZKConsumer(){
        String result = restTemplate.getForObject(URL_ZK+"/payment/zk",String.class);
        return result;
    }

}
