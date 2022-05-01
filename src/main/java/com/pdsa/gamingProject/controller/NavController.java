package com.pdsa.gamingProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sachith Harshamal
 */
@Controller
public class NavController {

    @GetMapping(value = "/")
    public String getIndexPage() {
        return "index";
    }
}
