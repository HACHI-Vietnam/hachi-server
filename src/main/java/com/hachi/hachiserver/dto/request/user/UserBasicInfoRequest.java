package com.hachi.hachiserver.dto.request.user;

import lombok.Data;

@Data
public class UserBasicInfoRequest {
    private int age;

    private String city;

    private boolean gender;
}
