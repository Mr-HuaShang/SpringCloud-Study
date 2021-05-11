package com.cyq.consumerzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainConsumerZK80 {
    public static void main(String[] args) {
        SpringApplication.run(MainConsumerZK80.class,args);
    }
}
