package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
// GET handler method below: returns index
    @GetMapping
    public String index(){
        return "index";
    }
}
