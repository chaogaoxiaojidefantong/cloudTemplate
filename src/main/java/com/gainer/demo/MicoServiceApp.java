package com.gainer.demo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class MicoServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(MicoServiceApp.class,args);
    }
}
