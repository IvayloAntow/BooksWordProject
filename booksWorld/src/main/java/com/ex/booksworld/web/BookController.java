package com.ex.booksworld.web;

import com.ex.booksworld.model.entity.BookEntity;
import com.ex.booksworld.model.service.UserServiceModel;
import com.ex.booksworld.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/books")
public class BookController {
    private  final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/details/{id}")
    public String bookDetails(@PathVariable(value="id") String id, HttpSession httpSession){
        UserServiceModel user = (UserServiceModel) httpSession.getAttribute("user");

        BookEntity book = bookRepository.findBookById(id);

        if (user == null) {

            return "register";
        }
        return "book-details";

    }

}
