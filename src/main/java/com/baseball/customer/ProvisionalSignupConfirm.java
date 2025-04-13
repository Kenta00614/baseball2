package com.baseball.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProvisionalSignupConfirm {

    @PostMapping("/customer/ProvisionalSignupConfirm")
    public String handleSignupConfirm(
            @RequestParam("mail") String mail,
            @RequestParam("name") String name,
            @RequestParam("password") String password,
            @RequestParam("tel") String tel,
            Model model) {

        // データをモデルに追加
        model.addAttribute("mail", mail);
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        model.addAttribute("tel", tel);

        // signupConfirm.html を表示
        return "customer/signupConfirm";
    }
}