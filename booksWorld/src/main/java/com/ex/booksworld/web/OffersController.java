package com.ex.booksworld.web;

import com.ex.booksworld.model.biding.AddOffersBindingModel;
import com.ex.booksworld.model.biding.UserRegisterBindingModel;
import com.ex.booksworld.model.service.UserServiceModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/offers")
public class OffersController {

    @GetMapping("/details")
    public String getOffers(HttpSession httpSession){

        UserServiceModel user = (UserServiceModel) httpSession.getAttribute("user");
        if (user == null) {

            return "register";
        }

        return "offers";
    }

    @GetMapping("/addOffers")
    public String addOffers(Model model){

        if (!model.containsAttribute("addOffersBindingModel")) {
            model.addAttribute("addOffersBindingModel", new AddOffersBindingModel());

        }

        return "add-offers";
    }

}
