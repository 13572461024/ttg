package cn.itsource.ttg.controller;

import cn.itsource.ttg.domain.Employee;
import cn.itsource.ttg.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
   public AjaxResult login(@RequestBody Employee employee){
       if ("admin".equals(employee.getUsername()) && "admin".equals(employee.getPassword())){
           return AjaxResult.me();
       }
       return AjaxResult.me().setSuccess(false).setMessage("账户或密码错误");
   }
}
