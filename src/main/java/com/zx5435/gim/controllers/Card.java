package com.zx5435.gim.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Card {

    @RequestMapping("aaa")
    public Object qwe() {
        HashMap<String, Object> m = new HashMap<>();

        m.put("asd", "asdfsaf");
        return m;

    }

}
