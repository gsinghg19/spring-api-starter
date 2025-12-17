package com.codewithmosh.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithmosh.store.entities.Message;

@RestController
public class MessageController {
    @RequestMapping("/hello")
    public Message SayHello() {
        return new Message("Hello, this is a simple project for showing backend data from a java spring boot project");
    }
}
