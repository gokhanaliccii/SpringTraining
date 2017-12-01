package com.gokhanaliccii.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/basic")
public class BasicController {

    @RequestMapping("/getName")
    public String getName() {

        return "name";
    }
}
