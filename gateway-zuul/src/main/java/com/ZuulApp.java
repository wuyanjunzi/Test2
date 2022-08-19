package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 32902
 * @title: ZuulAPP
 * @projectName springchloud-eureka
 * @description:
 * @date 2022/8/17 19:14
 */
@SpringBootApplication
@EnableZuulProxy//启动断路器
@EnableEurekaClient
public class ZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }
}
