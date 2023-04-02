package com.ex.booksworld.model.entity;

import com.ex.booksworld.model.entity.enums.AdEntityEnum;


import javax.persistence.*;

@Entity
@Table(name = "ads")
public class AdEntity extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private AdEntityEnum adType;

    @ManyToOne
    private UserEntity user;

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
