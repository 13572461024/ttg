package cn.itsource.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix //开启Hystrix
public class UserServiceHystrixApplication_8002 {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceHystrixApplication_8002.class);
    }
}
