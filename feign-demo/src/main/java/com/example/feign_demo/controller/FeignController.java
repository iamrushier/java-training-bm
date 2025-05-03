package com.example.feign_demo.controller;

import com.example.feign_demo.client.FeignApiClient;
import com.example.feign_demo.dto.PostDTO;
import com.example.feign_demo.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class FeignController {

    private final FeignApiClient feignApiClient;

    @GetMapping("/posts")
    public List<PostDTO> getPosts(){
        return feignApiClient.getPosts();
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        return feignApiClient.getUsers();
    }
}
