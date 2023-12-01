package com.example.demo.services;

import com.example.demo.repositories.UserFakeRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserFakeRepository fakeRepo;

    @Autowired
    public UserServiceImpl(UserFakeRepository fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public List<User> getUsers(int page) {
        //Normalmente usa pagination del lado de repo por ahora es fake
        return fakeRepo.getHardCodeUsers(page);
    }
}
