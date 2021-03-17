package com.medical.controller;

import com.medical.entity.RespBean;
import com.medical.entity.User;
import com.medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    public static UserController userController;

    @PostConstruct
    public void init(){
        userController=this;
        userController.userService=this.userService;
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public RespBean login(@RequestBody User user){
        int result=userController.userService.log_in(user);
        if(result==0){
            return new RespBean("success","登录成功");
        }else{
            return new RespBean("failed","用户名或密码错误");
        }
    }

    @RequestMapping(value="/logout")
    public RespBean logout(){
        int result=userController.userService.log_out();
        if(result==0){
            return new RespBean("success","登出成功");
        }else{
            return new RespBean("failed","无效账户名或已登出");
        }
    }

    @RequestMapping(value="/register",method = RequestMethod.POST)
    public RespBean register(@RequestBody User user){
        int result=userController.userService.register(user);
        if(result==0){
            return new RespBean("success","注册成功");
        }else{
            return new RespBean("failed","账户名已使用");
        }
    }

    @RequestMapping(value="/update",method = RequestMethod.POST)
    public RespBean update(@RequestBody User user){
        int result=userController.userService.update(user);
        if(result==0){
            return new RespBean("success","更新成功");
        }else{
            return new RespBean("failed","成功");
        }
    }
    @RequestMapping("/test")
    public User test(){
        return userController.userService.getUserByUid("abc");
    }

}
