package com.ex.booksworld.model.service;

import com.ex.booksworld.model.entity.UserRoleEntity;

import java.util.ArrayList;
import java.util.List;

public class UserServiceModel {

    private String firstName;
    private String lastName;
    private String username;
    private String email;

    private List<UserRoleEntity> userRole;

    public List<UserRoleEntity> getUserRole() {
        return userRole;
    }

    public UserServiceModel setUserRole(UserRoleEntity userRole) {
        this.userRole.add(userRole);
        return this;
    }

    private String password;
    private String confirmPassword;

    public UserServiceModel() {
        this.userRole = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public UserServiceModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserServiceModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserServiceModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
