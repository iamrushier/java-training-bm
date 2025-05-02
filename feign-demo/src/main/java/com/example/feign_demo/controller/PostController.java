package com.example.feign_demo.controller;

import com.example.feign_demo.client.PostClient;
import com.example.feign_demo.dto.PostDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PostController {

    private final PostClient postClient;

    @GetMapping("/posts")
    public List<PostDTO> getPosts(){
        return postClient.getPosts();
    }
}
