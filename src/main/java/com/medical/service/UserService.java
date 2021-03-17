package com.medical.service;

import com.medical.dao.UserMapper;
import com.medical.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.List;

@Component
@Transactional
public class UserService {

    @Autowired
    UserMapper userMapper;

    public static UserService userService;

    @PostConstruct
    public void init(){
        userService=this;
        userService.userMapper=this.userMapper;
    }

    public boolean checkUidUseful(String uid){
        List<User> userList = userService.userMapper.getUserById(uid);
        return userList.size()==0;
    }

    public String get_current_uid(String uid){
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return (String) request.getSession().getAttribute("uid");
    }

    public int log_in(User user){
        List<User> users=userService.userMapper.getUserById(user.getUid());
        if(users.size()==0){
            // 用户不存在
            return -1;
        } else if(!user.getPassword().equals(users.get(0).getPassword())){
            // 密码错误
            return 1;
        }else{
            //登录成功
            HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session=request.getSession();
            User current=users.get(0);
            current.setPassword("");
            session.setAttribute("uid",current.getUid());
            session.setAttribute("user",current);

            // 可能还要加入积分功能和签到功能

            return 0;
        }

    }

    public int log_out(){
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        String uid= (String) session.getAttribute("uid");
        if(uid==null){
            return -1;
        }
        List<User> users=userService.userMapper.getUserById(uid);
        if(users.size()==0){
            // 用户不存在
            return -1;
        } else{
            //登录成功
            try{
                session.removeAttribute("uid");
                session.removeAttribute("user");
            }catch (Exception e){

            }
            // 可能还要加入积分功能和签到功能

            return 0;
        }

    }

    public int register(User user){
        List<User> users=userService.userMapper.getUserById(user.getUid());
        if(users.size()!=0){
            // 用户存在,不可注册
            return -1;
        }else{
            userService.userMapper.insert(user);
            return 0;
        }

    }

    public int update(User user){
        List<User> users=userService.userMapper.getUserById(user.getUid());
        if(users.size()==0){
            // 用户不存在,不可修改
            return -1;
        }else{
            userService.userMapper.update(user);
            return 0;
        }
    }

    public User getUserByUid(String uid){
        List<User> users=userService.userMapper.getUserById(uid);
        if(users.size()==0){
            // 用户不存在,不可修改
            return null;
        }else{
            return users.get(0);
        }
    }
}
