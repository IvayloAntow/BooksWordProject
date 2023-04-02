package com.ex.booksworld.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class MessagesEntity extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String message;

    public MessagesEntity() {
    }

    public String getMessage() {
        return message;
    }

    public MessagesEntity setMessage(String message) {
        this.message = message;
        return this;
    }
}
