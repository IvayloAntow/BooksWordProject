package com.ex.booksworld.service;

import com.ex.booksworld.model.entity.GenreEntity;

import java.util.List;

public interface GenreService {

    void initGenre();
    List<GenreEntity> getAll();
}
