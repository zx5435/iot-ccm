package com.zx5435.gim.controllers;

import com.zx5435.gim.jpa.UserDAO;
import com.zx5435.gim.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Optional;

@RestController
public class Card {

    @Autowired
    UserDAO userDAO;

    @RequestMapping("aaa")
    public Object qwe() {
        HashMap<String, Object> m = new HashMap<>();

        m.put("asd", "asdfsaf");

        Optional<UserDO> asd = userDAO.findById(1);

        System.out.println("asd = " + asd);

        return m;

    }

}
