package com.prosoft.service;

import com.prosoft.dto.UserDto;

public class UserSendServiceEmail implements UserSendService {

    public void send(UserDto userDto) {
        System.out.println("Roles" + userDto.getFullName() + " has been sent by email!");
    }
}
