package com.drk.ssl.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/server")
public class ServerController {
	
    @RequestMapping(value = "/ssl", method = RequestMethod.GET)
    public String ssl() {
        System.out.println("Entering server ssl test method");
        return "server hello";
    }
}