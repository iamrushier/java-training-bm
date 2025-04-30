package com.example.mail_send_demo.controller;

import com.example.mail_send_demo.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class LoginController {
    private final EmailService emailService;

    private final String EMAIL = "t210256@famt.ac.in";
    private final String PASSWORD = "password";

    public LoginController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        if (Objects.equals(email, EMAIL) && Objects.equals(password, PASSWORD)) {
            emailService.sendSimpleEmail(email, "Login success.", "You have successfully logged in.");
            return ResponseEntity.ok("Login successful. Email sent");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }
}
