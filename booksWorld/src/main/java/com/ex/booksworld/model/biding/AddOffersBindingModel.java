package com.ex.booksworld.model.biding;

import com.ex.booksworld.model.entity.UserEntity;
import com.ex.booksworld.model.entity.enums.AdEntityEnum;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;

public class AddOffersBindingModel {


    private AdEntityEnum adType;


    private UserEntity user;

    @Column(columnDefinition = "text")
    private String description;

    @Email
    private String email;

    public AddOffersBindingModel() {
    }

    public AdEntityEnum getAdType() {
        return adType;
    }

    public AddOffersBindingModel setAdType(AdEntityEnum adType) {
        this.adType = adType;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public AddOffersBindingModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddOffersBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AddOffersBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }
}
