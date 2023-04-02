package com.ex.booksworld.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class AuthorEntity extends BaseEntity{

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @DateTimeFormat
    private Integer birthdate;

    @DateTimeFormat
    private Integer dateOfDeath;

    public AuthorEntity() {
    }

    public String getFirstName() {
        return firstName;
    }

    public AuthorEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public AuthorEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getBirthdate() {
        return birthdate;
    }

    public AuthorEntity setBirthdate(Integer birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    public Integer getDateOfDeath() {
        return dateOfDeath;
    }

    public AuthorEntity setDateOfDeath(Integer dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
        return this;
    }
}
