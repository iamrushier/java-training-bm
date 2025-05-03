package com.example.feign_demo.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
