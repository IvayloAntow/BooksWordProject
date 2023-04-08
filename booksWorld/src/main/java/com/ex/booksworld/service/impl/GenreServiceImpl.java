package com.ex.booksworld.service.impl;

import com.ex.booksworld.model.entity.GenreEntity;
import com.ex.booksworld.repository.GenreRepository;
import com.ex.booksworld.service.GenreService;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public void initGenre() {
        if (genreRepository.count()==0){
            genreRepository.save(new GenreEntity().setGenre("Biography"));
            genreRepository.save(new GenreEntity().setGenre("Crime"));
            genreRepository.save(new GenreEntity().setGenre("Technology"));
            genreRepository.save(new GenreEntity().setGenre("Adventure"));
            genreRepository.save(new GenreEntity().setGenre("Classics"));
            genreRepository.save(new GenreEntity().setGenre("Fantasy"));
        }

    }
}
