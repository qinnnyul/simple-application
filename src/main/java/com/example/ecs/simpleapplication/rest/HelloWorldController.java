package com.example.ecs.simpleapplication.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloWorldController {

    @Value("${hello.word}")
    private String words;

    @RequestMapping(value = "api/v1/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello....";
    }

    @RequestMapping(value = "api/v2/hello", method = RequestMethod.GET)
    public String hello2() {
        return "how are you, there";
    }

    @RequestMapping(value = "api/v3/hello", method = RequestMethod.GET)
    public String hello3() {
        return "how do you do?";
    }

    @RequestMapping(value = "api/v4/hello", method = RequestMethod.GET)
    public String hello4() {
        return "say something: " + words;
    }
}
