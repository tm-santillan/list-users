package com.example.demo.repositories;

import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public interface UserFakeRepository {
    default List<User> getHardCodeUsers(int page) {
        //No hacer esto bajo ninguna circunstancia solo para rapido crear datos dummy
        return generateUsers(page);
    }
    default List<User> generateUsers(long id){
        List<User> users = new ArrayList<>();
        users.add(User.builder()
                .id(id)
                .email("tobias.funke@reqres.in")
                .firstName("Tobias")
                .lastName("Funke")
                .avatarURL("https://reqres.in/img/faces/9-image.jpg")
                .build());
        id++;
        users.add(User.builder()
                .id(id)
                .email("lindsay.ferguson@reqres.in")
                .firstName("Lindsay")
                .lastName("Ferguson")
                .avatarURL("https://reqres.in/img/faces/8-image.jpg")
                .build());
        id++;
        users.add(User.builder()
                .id(id)
                .email("michael.lawson@reqres.in")
                .firstName("Michael")
                .lastName("Lawson")
                .avatarURL("https://reqres.in/img/faces/7-image.jpg")
                .build());
        id++;
        users.add(User.builder()
                .id(id)
                .email("george.edwards@reqres.in")
                .firstName("George")
                .lastName("Edwards")
                .avatarURL("https://reqres.in/img/faces/11-image.jpg")
                .build());
        id++;
        users.add(User.builder()
                .id(id)
                .email("rachel.howell@reqres.in")
                .firstName("Rachel")
                .lastName("Howell")
                .avatarURL("https://reqres.in/img/faces/12-image.jpg")
                .build());
        return users;
    }
}
