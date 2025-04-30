package com.example.mail_send_demo.controller;

import com.example.mail_send_demo.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    private final EmailService emailService;

    public ContactController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/contact")
    public String submitForm(@RequestParam String name, @RequestParam String email, @RequestParam String message) {
        emailService.sendHtmlEmail( name,email, "Contact form Confirmation", message);
        return "confirmation";
    }
}
