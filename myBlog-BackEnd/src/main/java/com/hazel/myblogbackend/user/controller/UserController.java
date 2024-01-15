package com.hazel.myblogbackend.user.controller;

import com.hazel.myblogbackend.user.model.UserDto;
import com.hazel.myblogbackend.user.model.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }
    @PostMapping("/regist")
    @Operation(summary = "회원가입",description="회원 정보 받아 회원 가입 처리")
//    @Parameter(name="userDto",description = "회원가입을 위해 아이디,비밀번호 입력")
    public ResponseEntity<Object> regist(
            @RequestBody UserDto userDto
            )
    {
        log.debug("login user : {}",userDto);
        try{
            userService.regist(userDto);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (Exception e)
        {
            log.debug("회원가입 에러 발생 : {}",e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

    }
}
