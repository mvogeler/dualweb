package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class WebController {

    @RequestMapping("/user")
    public String user() {
        return "user";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping("/")
    public String defaultPage(ModelMap map) {
        map.addAttribute("time", LocalDateTime.now().toString());
        return "page";
    }

    @RequestMapping("/page")
    public String userPage(ModelMap map) {
        map.addAttribute("time", LocalDateTime.now().toString());
        return "page";
    }
}
