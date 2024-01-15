package com.hazel.myblogbackend.user.model.mapper;

import com.hazel.myblogbackend.user.model.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface UserMapper {
    void regist(UserDto userDto) throws SQLException;
}
