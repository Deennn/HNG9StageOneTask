package com.deenn.deenn.entity;


import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class User {

    private String slackUsername;
    private boolean backend;
    private int age;
    private String bio;
}
