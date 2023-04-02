package com.ex.booksworld.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;



import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Column(nullable = false , unique = true)
    private String username;

    @Column(nullable = false)
    @Size(min = 3 , max = 20)
    private String password;

    @Column(nullable = false)
    @Size(min = 3 , max = 20)
    private String firstName;

    @Column(nullable = false)
    @Size(min = 3 , max = 20)
    private String lastName;

    @Email
    private String email;

    @ManyToMany
    private List<UserRoleEntity> userRole;

    @OneToMany
    private List<MessagesEntity>messages;

    public UserEntity() {
        userRole = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<UserRoleEntity> getUserRole() {
        return userRole;
    }

    public UserEntity setUserRole(List<UserRoleEntity> userRole) {
        this.userRole = userRole;
        return this;
    }

    public List<MessagesEntity> getMessages() {
        return messages;
    }

    public UserEntity setMessages(List<MessagesEntity> messages) {
        this.messages = messages;
        return this;
    }
}
