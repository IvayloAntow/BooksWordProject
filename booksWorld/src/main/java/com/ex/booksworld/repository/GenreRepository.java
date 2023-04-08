package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity ,String> {
    GenreEntity getGenreEntityByGenre(String genre);
}
