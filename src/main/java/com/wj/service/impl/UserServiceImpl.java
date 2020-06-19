package com.wj.service.impl;

import com.wj.mapper.UserMappr;
import com.wj.pojo.User;
import com.wj.service.UserService;
import com.wj.mapper.UserMappr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMappr userMappr;

    @Override
    public List<User> show() {
        return userMappr.show();
    }
}
