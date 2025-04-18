package com.example.springboot_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public String getGreeting() {
        return greetingRepository.getGreeting();
    }
}
