package com.example.rabbitlog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("test")
@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("test")
    public String test() {
        String toString = UUID.randomUUID().toString();
        for (int i = 0; i < 10000; i++) {
            logger.info(UUID.randomUUID().toString() + " >>>>>>>>>>>>>> " + i);
        }
        return "ok " + toString;
    }
}
