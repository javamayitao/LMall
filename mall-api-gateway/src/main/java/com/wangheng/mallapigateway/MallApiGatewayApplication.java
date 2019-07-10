package com.wangheng.mallapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@PropertySource(value = "classpath:parameter.properties")
public class MallApiGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(MallApiGatewayApplication.class, args);
    }

}
