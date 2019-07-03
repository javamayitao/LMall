package com.wangheng.malleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MallEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallEurekaServerApplication.class, args);
    }

}
