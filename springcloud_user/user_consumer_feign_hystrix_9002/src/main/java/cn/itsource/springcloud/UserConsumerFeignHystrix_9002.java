package cn.itsource.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "cn.itsource.springcloud")
public class UserConsumerFeignHystrix_9002 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerFeignHystrix_9002.class);
    }
}
