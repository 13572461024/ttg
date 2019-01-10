package cn.itsource.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "cn.itsource.springcloud")
public class UserConsumerApplication_9001 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication_9001.class);
    }
}
