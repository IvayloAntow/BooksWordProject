package com.ex.booksworld.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class BookEntity extends BaseEntity{

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "text")
    private String description;

    @ManyToMany
    List<AuthorEntity> author ;

    @ManyToMany
    List<GenreEntity> genre;

    public BookEntity() {
        genre = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public BookEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BookEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<AuthorEntity> getAuthor() {
        return author;
    }

    public BookEntity setAuthor(List<AuthorEntity> author) {
        this.author = author;
        return this;
    }

    public List<GenreEntity> getGenre() {
        return genre;
    }

    public BookEntity setGenre(List<GenreEntity> genre) {
        this.genre = genre;
        return this;
    }
}
