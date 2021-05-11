package com.cyq.springcloud.controller;


import com.cyq.springcloud.entities.CommonResult;
import com.cyq.springcloud.entities.Payment;
import com.cyq.springcloud.services.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}") //获取application.yml 文件的端口配置
    private String serverPort;

    @PostMapping(value = "payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果：" + result);
        if(result > 0){
            return new CommonResult(200,"插入数据成功，serverPort=" + serverPort,result);
        }else {
            return new CommonResult(404,"插入数据失败，serverPort=" + serverPort,null);
        }
    }

    @GetMapping(value = "payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult(200,"数据查询成功，serverPort=" + serverPort,payment);
        }else {
            return new CommonResult(404,"没有ID=" + id + "对应的记录，serverPort=" + serverPort,null);
        }
    }


}