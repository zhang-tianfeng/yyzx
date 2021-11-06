package com.zhangtianfeng.yyzx.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("hello")
    @Secured({"ROLE_boss"})
    public String hello() {
        return "hello";
    }
}
