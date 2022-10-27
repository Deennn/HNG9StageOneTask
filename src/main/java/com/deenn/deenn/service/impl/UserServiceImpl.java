package com.deenn.deenn.service.impl;

import com.deenn.deenn.entity.User;
import com.deenn.deenn.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {



    @Override
    public User create() {
        return User.builder()
                .slackUsername("Deenn")
                .backend(true)
                .age(24)
                .bio("I'm a Self-motivated Software Engineer learning how to build and develop " +
                        "aesthetic products to satisfy user requirements. Highly analytical, detail-oriented and skilled at solving programming problems")
                .build();
    }
}
