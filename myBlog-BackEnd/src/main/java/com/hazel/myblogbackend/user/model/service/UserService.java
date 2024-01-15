package com.hazel.myblogbackend.user.model.service;

import com.hazel.myblogbackend.user.model.UserDto;

public interface UserService {
    public void regist(UserDto userDto) throws Exception;
}
