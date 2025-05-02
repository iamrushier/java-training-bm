package com.example.feign_demo.client;

import com.example.feign_demo.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "postClient", url = "https://jsonplaceholder.typicode.com")
public interface PostClient {
    @GetMapping("/posts")
    List<PostDTO> getPosts();
}
