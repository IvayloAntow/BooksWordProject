package com.ex.booksworld.service.impl;

import com.ex.booksworld.model.entity.AuthorEntity;
import com.ex.booksworld.model.entity.BookEntity;
import com.ex.booksworld.model.entity.GenreEntity;
import com.ex.booksworld.repository.AuthorRepository;
import com.ex.booksworld.repository.BookRepository;
import com.ex.booksworld.repository.GenreRepository;
import com.ex.booksworld.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;

    private final AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository, GenreRepository genreRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void initBooks() {
        if (bookRepository.count()==0){
            GenreEntity genre1 = genreRepository.getGenreEntityByGenre("Adventure");
            AuthorEntity author1 = authorRepository.getAuthorEntityByFirstNameAndLastName("J.K.","Rowling");
            BookEntity book1 = new BookEntity();
            book1.setTitle("Harry Potter").setGenre(genre1).setAuthor(author1)
                    .setImageUrl("https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/710ESoXqVPL._AC_UF1000,1000_QL80_.jpg");
            bookRepository.save(book1);

            BookEntity book2 = new BookEntity();

            AuthorEntity author2 = authorRepository.getAuthorEntityByFirstNameAndLastName("Alexandre","Dumas");
            book2.setAuthor(author2).setTitle("The Three Musketeers").setGenre(genre1)
                    .setImageUrl("https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/91oRh3DsdUL.jpg");
            bookRepository.save(book2);

            BookEntity book3 = new BookEntity();
            GenreEntity genre2 = genreRepository.getGenreEntityByGenre("Classics");
            AuthorEntity author3 = authorRepository.getAuthorEntityByFirstNameAndLastName("Harper","Lee");
            book3.setAuthor(author3).setTitle("To Kill a Mockingbird").setGenre(genre2)
                    .setImageUrl("https://m.media-amazon.com/images/I/51p12agL5LL.jpg");
            bookRepository.save(book3);

        }

    }

    @Override
    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }
}
