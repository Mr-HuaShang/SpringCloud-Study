package com.cyq.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}") //获取application.yml 文件的端口配置
    private String serverPort;

    @RequestMapping(value = "payment/zk")
    public String paymentZk(){
        return "PaymentController" + serverPort + UUID.randomUUID().toString();
    }
}
