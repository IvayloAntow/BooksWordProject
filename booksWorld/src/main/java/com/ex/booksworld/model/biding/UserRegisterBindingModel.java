package com.ex.booksworld.model.biding;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {
    @NotBlank(message = "First name cannot be empty str")
    @Size(min = 3 , max = 20 , message = "First name must be between 3 and 20 characters")
    private String firstName;

    @NotBlank(message = "Last name cannot be empty string")
    @Size(min = 3 , max = 20 , message = "Last name must be between 3 and 20 characters")
    private String lastName;

    @NotBlank(message = "Username cannot be empty string")
    @Size(min = 3 , max = 20 , message = "Username must be between 3 and 20 characters")
    private String username;

    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Password cannot be empty string")
    @Size(min = 3 , max = 20 , message = "Password must be between 3 and 20 characters")
    private String password;

    @NotBlank(message = "Password cannot be empty string")
    @Size(min = 3 , max = 20 , message = "Password must be between 3 and 20 characters")
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegisterBindingModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegisterBindingModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
