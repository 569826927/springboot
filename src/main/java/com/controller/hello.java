package com.controller;

//import com.model.user;
//import com.service.UserService;
import com.model.Users;
import com.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@RequestMapping(value = "/first")
@Controller
public class hello {

    @Autowired
    UserService userService;


    @RequestMapping("/hello")
    @ResponseBody
    public String Hello() {
        //Users user = new Users();
        System.out.println(userService);
        userService.addUser();
        return "hello world!!!";
    }
}
