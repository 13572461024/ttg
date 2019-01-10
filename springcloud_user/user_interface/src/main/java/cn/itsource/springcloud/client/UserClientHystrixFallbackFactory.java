package cn.itsource.springcloud.client;

import cn.itsource.springcloud.domian.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
//UserClient 表示对那个接口进行托底处理
public class UserClientHystrixFallbackFactory implements FallbackFactory<UserCilent> {

    public UserCilent create(Throwable throwable) {
        return new UserCilent() {
            public User getUser(Long id) {
                return new User(id,"大佬，出错了");
            }
        };
    }
}
