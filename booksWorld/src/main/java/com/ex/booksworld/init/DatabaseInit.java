package com.ex.booksworld.init;

import com.ex.booksworld.service.AuthorService;
import com.ex.booksworld.service.BookService;
import com.ex.booksworld.service.GenreService;
import com.ex.booksworld.service.UserRoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit implements CommandLineRunner {

    private final UserRoleService roleService;
    private final GenreService genreService;

    private final AuthorService authorService;

    private final BookService bookService;

    public DatabaseInit(UserRoleService roleService, GenreService genreService, AuthorService authorService, BookService bookService) {
        this.roleService = roleService;
        this.genreService = genreService;
        this.authorService = authorService;
        this.bookService = bookService;
    }


    @Override
    public void run(String... args) throws Exception {
        roleService.initRoles();
        authorService.initAuthors();
        genreService.initGenre();
        bookService.initBooks();

    }

}
