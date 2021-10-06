package ru.sbrf.bhub.dashboard.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TeamController {

    @GetMapping("/")
    public String index() {
        return "OK!";
    }

}
