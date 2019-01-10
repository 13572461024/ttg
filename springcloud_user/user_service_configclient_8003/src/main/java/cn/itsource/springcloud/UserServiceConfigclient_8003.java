package cn.itsource.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceConfigclient_8003 {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceConfigclient_8003.class);
    }
}
