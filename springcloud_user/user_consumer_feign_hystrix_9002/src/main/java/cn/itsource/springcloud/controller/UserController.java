package cn.itsource.springcloud.controller;

import cn.itsource.springcloud.client.UserCilent;
import cn.itsource.springcloud.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class UserController {
    @Autowired
    private UserCilent userCilent;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userCilent.getUser(id);
    }
}
