package com.gazgeek.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RequestMapping(value = "/api/dataFactory")
public class HomeController {

    @RequestMapping("/index")
    String home() {
        return "Hello from GazGeek!";
    }

}
