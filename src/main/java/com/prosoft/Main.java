package com.prosoft;

import com.prosoft.domain.Role;
import com.prosoft.domain.User;
import com.prosoft.dto.UserDto;
import com.prosoft.service.UserSendService;
import com.prosoft.service.UserSendServiceEmail;

import java.util.ArrayList;
import java.util.List;

/**
 * dto-demo
 *
 */
public class Main {
    public static void main(String[] args) {

        List<Role> roleList = new ArrayList();
        roleList.add(new Role(1, "user"));
        User user = new User(1, "John Doe", roleList);

        UserDto userDto = new UserDto(user.getFullName(), user.getRoles());

        UserSendService userSendService = new UserSendServiceEmail();
        userSendService.send(userDto);

    }
}
