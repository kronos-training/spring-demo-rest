package com.example.demorest.controller;

import com.example.demorest.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

    @ResponseBody
    @GetMapping("/message")
    Message send() {
        return new Message("First message");
    }
}
