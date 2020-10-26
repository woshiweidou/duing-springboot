package com.weidoubaobao.duying.controller;

import com.weidoubaobao.duying.dao.UserMapper;
import com.weidoubaobao.duying.entity.User;
import com.weidoubaobao.duying.listenner.TestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    private ApplicationEventPublisher publisher;
    @ResponseBody
    @RequestMapping("/event")
    public String event(){
        publisher.publishEvent(new TestEvent(this));
        return "Success";
    }
    @ResponseBody
    @RequestMapping("/show")
    public String AAA(){
        return userMapper.queryAll().toString();
    }

    @RequestMapping("/testTo")
    public String bbbTo(){
        return "thymeleaf/login";
    }

    @ResponseBody
    @RequestMapping("/test")
    public void bbb(User user){
        userMapper.insertUser(user);
    }


    @ResponseBody
    @RequestMapping("/testDemo")
    public String testDemo(){
        return "hello world";
    }
}
