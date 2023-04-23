package com.ex.booksworld.model.entity;

import com.ex.booksworld.model.entity.enums.AdEntityEnum;


import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "ads")
public class AdEntity extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private AdEntityEnum adType;

    @ManyToOne
    private UserEntity user;

    @Column(columnDefinition = "text")
    private String description;

    @Email
    private String email;

    public AdEntity setAdType(AdEntityEnum adType) {
        this.adType = adType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AdEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AdEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public AdEntity() {
    }

    public AdEntityEnum getAdType() {
        return adType;
    }

    public AdEntity setAdEnum(AdEntityEnum adType) {
        this.adType = adType;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public AdEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }
}
