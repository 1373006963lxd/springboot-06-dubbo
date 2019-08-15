package com.atguigu.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 1.将服务员提供者注册到注册中心-------dubbo官网-gihub
*       1.引入dubbo和zookeeper相关依赖
*       2.配置dubbo的扫描包和注册中心地址
*       3.使用@Service发布服务
*
* */

@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}
