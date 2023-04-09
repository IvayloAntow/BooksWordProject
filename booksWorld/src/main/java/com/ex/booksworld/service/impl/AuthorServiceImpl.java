package com.ex.booksworld.service.impl;

import com.ex.booksworld.model.entity.AuthorEntity;
import com.ex.booksworld.model.entity.BookEntity;
import com.ex.booksworld.model.entity.GenreEntity;
import com.ex.booksworld.repository.AuthorRepository;
import com.ex.booksworld.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public void initAuthors() {
        if (authorRepository.count() == 0) {
            AuthorEntity author = new AuthorEntity();
            author.setFirstName("J.K.").setLastName("Rowling");
            authorRepository.save(author);

            AuthorEntity author2 = new AuthorEntity();
            author2.setFirstName("Alexandre").setLastName("Dumas");
            authorRepository.save(author2);

            AuthorEntity author3 = new AuthorEntity();
            author3.setFirstName("Harper").setLastName("Lee");
            authorRepository.save(author3);



        }
    }
}
