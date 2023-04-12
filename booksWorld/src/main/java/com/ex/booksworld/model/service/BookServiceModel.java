package com.ex.booksworld.model.service;

import com.ex.booksworld.model.entity.AuthorEntity;
import com.ex.booksworld.model.entity.GenreEntity;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

public class BookServiceModel {


    private String title;


    private String description;


    private String imageUrl;


    private List<AuthorEntity> author ;


    private List<GenreEntity> genre;

    public BookServiceModel() {
        author = new ArrayList<>();
        genre = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public BookServiceModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BookServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public BookServiceModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public List<AuthorEntity> getAuthor() {
        return author;
    }

    public BookServiceModel setAuthor(List<AuthorEntity> author) {
        this.author = author;
        return this;
    }

    public List<GenreEntity> getGenre() {
        return genre;
    }

    public BookServiceModel setGenre(List<GenreEntity> genre) {
        this.genre = genre;
        return this;
    }
}
