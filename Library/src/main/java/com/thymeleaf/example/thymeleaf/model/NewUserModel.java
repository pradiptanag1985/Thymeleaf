package com.thymeleaf.example.thymeleaf.model;

import java.util.Map;
import java.util.TreeMap;

public class NewUserModel {
    private String name;
    private String uname;
    private String password;
    private String role;


    public NewUserModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "NewUserModel{" +
                "name='" + name + '\'' +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
