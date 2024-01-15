package com.hazel.myblogbackend.user.model.service;

import com.hazel.myblogbackend.user.model.UserDto;
import com.hazel.myblogbackend.user.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void regist(UserDto userDto) throws Exception {
        userMapper.regist(userDto);
    }
}
