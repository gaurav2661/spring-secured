package com.spring.secured.uspa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class SecurityCheckController {
    @GetMapping
    public String checkSecurity() {
        return "Checked";
    }
}
