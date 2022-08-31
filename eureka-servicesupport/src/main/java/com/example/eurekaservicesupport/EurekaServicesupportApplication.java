package com.example.eurekaservicesupport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.eurekaservicesupport.*"})
@EntityScan("com.example.eurekaservicesupport.entity")
@MapperScan("com.example.eurekaservicesupport.dao")

public class EurekaServicesupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServicesupportApplication.class, args);
        System.out.print("服务启动成功");
    }

}
