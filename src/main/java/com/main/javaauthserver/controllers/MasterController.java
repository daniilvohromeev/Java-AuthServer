package com.main.javaauthserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MasterController {
    @GetMapping
    public String returnAdminMenu(Model model){
        return "settings";
    }
}
