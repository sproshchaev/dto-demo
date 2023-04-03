package com.prosoft.domain;

import java.util.List;

public class User {
    private long id;
    private String fullName;
    private String password;
    private List<Role> roles;

    public User() {
    }

    public User(long id, String fullName, List<Role> roles) {
        this.id = id;
        this.fullName = fullName;
        this.roles = roles;
    }

    public User(long id, String fullName, String password, List<Role> roles) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
