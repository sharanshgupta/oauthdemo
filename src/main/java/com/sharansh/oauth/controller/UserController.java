package com.sharansh.oauth.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Home " + name;
    }
}
