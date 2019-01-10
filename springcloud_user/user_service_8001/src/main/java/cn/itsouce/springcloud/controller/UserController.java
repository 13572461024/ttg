package cn.itsouce.springcloud.controller;

import cn.itsource.springcloud.client.UserCilent;
import cn.itsource.springcloud.domian.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController implements UserCilent {

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return new User(id,"hhh");
    }
}
