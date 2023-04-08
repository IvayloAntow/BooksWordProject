package com.ex.booksworld.service.impl;

import com.ex.booksworld.model.entity.BookEntity;
import com.ex.booksworld.model.entity.GenreEntity;
import com.ex.booksworld.repository.BookRepository;
import com.ex.booksworld.repository.GenreRepository;
import com.ex.booksworld.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;

    public BookServiceImpl(BookRepository bookRepository, GenreRepository genreRepository) {
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
    }

    @Override
    public void initBooks() {
        if (bookRepository.count()==0){
            GenreEntity genre1 = genreRepository.getGenreEntityByGenre("Adventure");
            BookEntity book1 = new BookEntity();
            book1.setTitle("Harry Potter").setGenre(genre1);

        }

    }
}
