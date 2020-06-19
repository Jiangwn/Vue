package com.wj.controller;


import com.wj.pojo.User;
import com.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/show")
    @ResponseBody
    private List<User> showUser(){
        return userService.show();
    }



}
