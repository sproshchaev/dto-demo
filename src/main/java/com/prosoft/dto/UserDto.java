package com.prosoft.dto;

import com.prosoft.domain.Role;

import java.util.List;

public class UserDto {
    private String fullName;
    private List<Role> roles;

    public UserDto(String fullName, List<Role> roles) {
        this.fullName = fullName;
        this.roles = roles;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
