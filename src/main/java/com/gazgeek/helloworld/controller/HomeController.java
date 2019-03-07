package com.gazgeek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping(value = "/api/dataFactory")
public class HomeController {

    @RequestMapping("/index")
    String home() {
        return "Hello from GazGeek!";
    }

}
