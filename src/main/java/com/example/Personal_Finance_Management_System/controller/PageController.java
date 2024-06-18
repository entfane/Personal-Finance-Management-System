package com.example.Personal_Finance_Management_System.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegistrationPage() {
        return "registration";
    }

    @GetMapping("/dashboard")
    public String getDashboardPage() {
        return "dashboard";
    }

    @GetMapping("/transaction")
    public String getTransactionsPage() {
        return "transaction";
    }

}
