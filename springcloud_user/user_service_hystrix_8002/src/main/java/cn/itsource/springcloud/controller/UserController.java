package cn.itsource.springcloud.controller;

import cn.itsource.springcloud.domian.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {

    @RequestMapping("/user/{id}")
    @HystrixCommand(fallbackMethod = "failget")
    public User getUser(@PathVariable("id") Long id) throws Exception {
        if (id==2){
            throw new Exception("出错啦");
        }
        return new User(id,"zzz");

    }

    public User failget(Long id){
        return new User(id,"你的网有问题，兄弟");
    }
}
