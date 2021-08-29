package com.hachi.hachiserver.controller;

import com.hachi.hachiserver.dto.request.user.UserBasicInfoRequest;
import com.hachi.hachiserver.dto.request.user.UserLoginRequest;
import com.hachi.hachiserver.dto.request.user.UserRegisterRequest;
import com.hachi.hachiserver.entity.User;
import com.hachi.hachiserver.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody UserLoginRequest loginRequest){
        return userService.login(loginRequest);
    }

    @PostMapping("")
    public User register(@RequestBody UserRegisterRequest registerRequest){
        return userService.register(registerRequest);
    }

    @PatchMapping("/{id}")
    public User updateBasicInfo(@PathVariable Long id, @RequestBody UserBasicInfoRequest basicInfoRequest){
        return userService.updateBasicInfo(id, basicInfoRequest);
    }
}
