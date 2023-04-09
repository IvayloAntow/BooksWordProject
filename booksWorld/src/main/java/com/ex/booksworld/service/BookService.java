package com.ex.booksworld.service;

import com.ex.booksworld.model.entity.BookEntity;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface BookService {
    void initBooks();
    List<BookEntity> findAll();
}
