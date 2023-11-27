package com.tunix.kubik.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PingController {
    @GetMapping("/ping")
    public String ping() {
        log.info("Ping kubik controller");
        return "Kubik service is running";
    }

}
