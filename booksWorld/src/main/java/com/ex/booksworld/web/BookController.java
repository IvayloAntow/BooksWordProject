package com.ex.booksworld.web;

import com.ex.booksworld.model.service.BookServiceModel;
import com.ex.booksworld.model.service.UserServiceModel;
import com.ex.booksworld.repository.BookRepository;
import com.ex.booksworld.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {

        this.bookService = bookService;
    }

    @GetMapping("/details/{id}")
    public String bookDetails(@PathVariable(value="id") String id, HttpSession httpSession , Model model){
        UserServiceModel user = (UserServiceModel) httpSession.getAttribute("user");

        BookServiceModel book = bookService.findBookById(id);

        model.addAttribute("book" ,book);
        //Todo fix query genres
        model.addAttribute("genres" ,book.getGenre());

        if (user == null) {

            return "register";
        }
        return "book-details";

    }

}
