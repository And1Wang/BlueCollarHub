package com.bluecollarhub.controller;

import com.bluecollarhub.model.User;
import com.bluecollarhub.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Users")
public class UserController {
    private final UserService UserService;

    public UserController(UserService UserService) {
        this.UserService = UserService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> Users = UserService.getAllUsers();
        return ResponseEntity.ok(Users);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User User) {
        User savedUser = UserService.addUser(User);
        return ResponseEntity.ok(savedUser);
    }
}