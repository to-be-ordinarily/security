package com.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class Main {

    @GetMapping
    public String index(){
        log.debug("debug");
        log.info("info");
        log.error("error");
        return "index";
    }
}