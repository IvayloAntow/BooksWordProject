package com.ex.booksworld.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;




@Entity
@Table(name = "genres")
public class GenreEntity extends BaseEntity{

    @Column(nullable = false)
    @Size(min = 4)
    private String genre;

    public GenreEntity() {
    }

    public String getGenre() {
        return genre;
    }

    public GenreEntity setGenre(String genre) {
        this.genre = genre;
        return this;
    }
}
