package com.ex.booksworld.web;


import com.ex.booksworld.model.service.UserServiceModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    public HomeController() {

    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model) {
        UserServiceModel user = (UserServiceModel) httpSession.getAttribute("user");

        if(user == null){
            return "index";
        }

        model.addAttribute("username", user.getUsername());
        return "home";
    }




}
