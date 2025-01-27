package se.caroline.projektspring.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user") //INTE REST API - TWITTER, FACEBOOK, EJ JASON webb application
public class UserController {
    @GetMapping
    public String showMyUsername (Model model) {
        Authentication manager = SecurityContextHolder.getContext().getAuthentication();
        String username = manager.getName();
        model.addAttribute("username", username);
        return "user";
    }

}
