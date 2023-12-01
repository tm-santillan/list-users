package com.example.demo.controllers;

import com.example.demo.DTO.SupportDTO;
import com.example.demo.DTO.UserResponseDTO;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Set;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<UserResponseDTO> getAllUsers(@RequestParam(defaultValue = "0") int page) {
        UserResponseDTO response = UserResponseDTO.builder()
                .page(page)
                .perPage(6)
                .total(Math.multiplyExact(page, 6))
                .totalPages(page)
                .data(userService.getUsers(page))
                .support(new SupportDTO())
                .build();
        if(response.getData() == null || response.getData().size() == 0) {
            ResponseEntity.notFound();
        }
        return ResponseEntity.ok(response);
    }
}
