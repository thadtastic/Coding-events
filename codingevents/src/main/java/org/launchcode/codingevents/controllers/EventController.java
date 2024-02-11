package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    //handler method for GET requests wth single parameter
@GetMapping
    public String requests(Model model){
        List<String> events = new ArrayList<>();
        events.add("Fun Mudder");
        events.add("Rise and Grind");
        events.add("The Road to Victory");
        model.addAttribute("events", "events");
        return "events/index";
    }
    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
    return "events/create";
    }


}
