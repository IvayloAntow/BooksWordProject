package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity ,String> {
    GenreEntity getGenreEntityByGenre(String genre);


    List<GenreEntity> findAll();
}
