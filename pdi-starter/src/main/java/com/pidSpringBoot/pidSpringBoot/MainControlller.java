package com.pidSpringBoot.pidSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControlller {

    @GetMapping("")
    public String showHomePage() {
        return "index";
    }
}
