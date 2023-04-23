package com.ex.booksworld.web;


import com.ex.booksworld.model.entity.BookEntity;
import com.ex.booksworld.model.entity.GenreEntity;
import com.ex.booksworld.model.service.BookServiceModel;
import com.ex.booksworld.model.service.UserServiceModel;

import com.ex.booksworld.service.BookService;
import com.ex.booksworld.service.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {
    private final GenreService genreService;
    private final BookService bookService;
    public HomeController(GenreService genreService, BookService bookService) {

        this.genreService = genreService;
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model) {
        UserServiceModel user = (UserServiceModel) httpSession.getAttribute("user");

        if(user == null){
            return "index";
        }

        List<GenreEntity>genres= genreService.getAll();
        List<BookEntity> books= bookService.findAll();
        model.addAttribute("genres",genres);
        model.addAttribute("username", user.getUsername());
        model.addAttribute("books", books);
        model.addAttribute("book",new BookServiceModel());


        return "home";
    }




}
