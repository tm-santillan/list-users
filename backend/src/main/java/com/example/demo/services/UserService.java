package com.example.demo.services;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getUsers(int page);
}
