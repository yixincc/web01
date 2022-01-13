package com.yjxxt.service;

import com.yjxxt.mapper.UserMapper;
import com.yjxxt.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
