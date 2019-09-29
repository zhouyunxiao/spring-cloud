package com.zyx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者(feign)，Feign 采用的是基于接口的注解；Feign 整合了ribbon，具有负载均衡的能力；
 * 	整合了Hystrix，具有熔断的能力
 * 访问地址：http://localhost:8765/hi?name=zhouyx
 * @author zhouyx
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients		//开启Feign的功能
public class ServiceFeignApplication {
	
    public static void main(String[] args) {
        SpringApplication.run( ServiceFeignApplication.class, args );
    }
}
