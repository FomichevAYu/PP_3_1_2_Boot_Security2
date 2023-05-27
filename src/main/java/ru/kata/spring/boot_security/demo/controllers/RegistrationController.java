package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.models.User;

@Controller
@RequestMapping("/reg")
public class RegistrationController {
    @GetMapping("/")
    public String showNewUserPage(@ModelAttribute("user") User user) {
        return "NewUserPage";
    }
}
