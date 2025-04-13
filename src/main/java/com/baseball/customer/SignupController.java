package com.baseball.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {

    @GetMapping("/customer/signup")
    public String showSignupForm() {
        return "customer/signup"; // templates/customer/signup.html を表示
    }
}