package com.example.hello.controller;


import com.example.hello.POJO.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class controller {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello This my page");
        System.out.println("hello");
        log.warn("Started api");
        return "hello";
    }

    User user1 = new User("Chunyu", 22);

    @RequestMapping("/user")
    public String user(Model model) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String userJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user1);

        model.addAttribute("user", userJson);
        return "user";
    }

}
