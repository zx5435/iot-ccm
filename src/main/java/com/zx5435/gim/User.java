package com.zx5435.gim;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private int age;

    public User(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

}
