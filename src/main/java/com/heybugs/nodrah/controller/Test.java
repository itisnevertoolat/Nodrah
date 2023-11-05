package com.heybugs.nodrah.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Test {

    @GetMapping("/bezo")
    public String getUser(){
        return "hello bezo and ass of ezzo";
    }
}
