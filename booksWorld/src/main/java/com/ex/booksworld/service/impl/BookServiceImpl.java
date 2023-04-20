package com.ex.booksworld.service.impl;

import com.ex.booksworld.model.entity.AuthorEntity;
import com.ex.booksworld.model.entity.BookEntity;
import com.ex.booksworld.model.entity.GenreEntity;
import com.ex.booksworld.model.service.BookServiceModel;
import com.ex.booksworld.repository.AuthorRepository;
import com.ex.booksworld.repository.BookRepository;
import com.ex.booksworld.repository.GenreRepository;
import com.ex.booksworld.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;

    private final AuthorRepository authorRepository;

    private final ModelMapper modelMapper;

    public BookServiceImpl(BookRepository bookRepository, GenreRepository genreRepository, AuthorRepository authorRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
        this.authorRepository = authorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void initBooks() {
        if (bookRepository.count() == 0) {
            GenreEntity genre1 = genreRepository.getGenreEntityByGenre("Adventure");
            AuthorEntity author1 = authorRepository.getAuthorEntityByFirstNameAndLastName("J.K.", "Rowling");
            BookEntity book1 = new BookEntity();
            book1.setTitle("Harry Potter").setGenre(genre1).setAuthor(author1)
                    .setImageUrl("https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/710ESoXqVPL._AC_UF1000,1000_QL80_.jpg")
                    .setDescription("Harry Potter is a series of novels by British author J. K. Rowling." +
                            " The novels follow Harry Potter, an 11-year-old boy who discovers he is the son of " +
                            "famous wizards and will attend Hogwarts School of Witchcraft and Wizardry. " +
                            "Harry learns of an entire society of wizards and witches.");
            bookRepository.save(book1);

            BookEntity book2 = new BookEntity();

            AuthorEntity author2 = authorRepository.getAuthorEntityByFirstNameAndLastName("Alexandre", "Dumas");
            book2.setAuthor(author2).setTitle("The Three Musketeers").setGenre(genre1)
                    .setImageUrl("https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/91oRh3DsdUL.jpg")
                    .setDescription("A historical romance, it relates the adventures of four fictional swashbuckling heroes who lived under the French kings " +
                            "Louis XIII and Louis XIV, who reigned during the 17th and early 18th centuries.");
            bookRepository.save(book2);

            BookEntity book3 = new BookEntity();
            GenreEntity genre2 = genreRepository.getGenreEntityByGenre("Classics");
            AuthorEntity author3 = authorRepository.getAuthorEntityByFirstNameAndLastName("Harper", "Lee");
            book3.setAuthor(author3).setTitle("To Kill a Mockingbird").setGenre(genre2)
                    .setImageUrl("https://m.media-amazon.com/images/I/51p12agL5LL.jpg")
                    .setDescription("To Kill a Mockingbird is both a young girl's coming-of-age story and a darker drama" +
                            " about the roots and consequences of racism and prejudice, " +
                            "probing how good and evil can coexist within a single community or individual.");
            bookRepository.save(book3);

        }

    }

    @Override
    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public BookServiceModel findBookById(String id) {
        BookEntity book = bookRepository.findBookById(id);
        BookEntity book2 = bookRepository.findGenreByBookId(id);
        BookServiceModel bookServiceModel = new BookServiceModel();
        bookServiceModel.setAuthor(book.getAuthor());
        bookServiceModel.setDescription(book.getDescription());
        bookServiceModel.setTitle(book.getTitle());
        bookServiceModel.setImageUrl(book.getImageUrl());

        if (book2.getGenre().size() > 0) {
            bookServiceModel.setGenre(book2.getGenre());
        }

        return bookServiceModel;
    }
}
