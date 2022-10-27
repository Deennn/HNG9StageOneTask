package com.deenn.deenn.controller;

import com.deenn.deenn.entity.User;
import com.deenn.deenn.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api")
public class userController {

    private final UserService userService;

    @GetMapping("/v1/user")
    public ResponseEntity<User> getUser() {
        return ResponseEntity.ok(userService.create());
    }
}
