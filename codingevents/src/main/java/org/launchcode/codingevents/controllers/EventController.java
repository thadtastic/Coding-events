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
    // root path is defined at the class leve with @GetMapping("events")
@GetMapping("/")
    public String displayAllEvents(Model model){
        model.addAttribute("events", events);
        return "events/index";
    }
    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
    return "create";
    }
    // method below handles a different kind of request and can be placed at the same path
    // processes form after user clicks submit, PostMapping annotation needed for this
@PostMapping("create")
public String createEvent(@RequestParam String eventName){ // eventName must match name attribute of input elements:  <input type ="text" name="eventName">
        events.add(eventName);
        //the return redirects to the root path, which is events
        return "redirect:/events";
    }

}
