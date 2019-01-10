package cn.itsource.springcloud.client;

import cn.itsource.springcloud.domian.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//调用服务名字
//fallbackFactory = UserClientHystrixFallbackFactory.class 怎么进行降级处理，我们自己定义的
@FeignClient(value = "USER-PROVIDER",fallbackFactory = UserClientHystrixFallbackFactory.class)
@RequestMapping("/provider")
public interface UserCilent {
    @RequestMapping("/user/{id}") //user/1
    User getUser(@PathVariable("id") Long id);
}
