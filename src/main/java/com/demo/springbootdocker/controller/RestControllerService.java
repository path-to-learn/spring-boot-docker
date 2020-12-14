package com.demo.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerService {

    /**
     * e.g. command -> curl http://localhost:8080/message?name\=prashant
     *
     * @param name
     * @return
     */
    @GetMapping("/message")
    public String message(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hello " + name;
    }
}
