package com.hachi.hachiserver.dto.request.user;

import lombok.Data;

@Data
public class UserRegisterRequest {

    private String username;
    private String password;
    private String email;
}
