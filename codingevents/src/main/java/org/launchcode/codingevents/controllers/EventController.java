package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    //handler method for GET requests wth single parameter
@GetMapping("/")
    public String displayAllEvents(Model model){
        model.addAttribute("events", events);
        return "events/index";
    }
    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
    return "events/create";
    }
    // method below handles a different kind of request and can be placed at the same path
@PostMapping("create")
public String createEvent(@RequestParam String eventName){
        events.add(eventName);
        //the return redirects to the root path, which is events
        return "redirect: ";
    }

}
