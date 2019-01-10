package cn.itsource.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //启用网关
public class ZuulGatewarApplicaion_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewarApplicaion_9527.class);
    }
}
