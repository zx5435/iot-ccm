package com.zx5435.gim;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.zx5435.gim.jpa.UserDAO;
import com.zx5435.gim.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserQuery implements GraphQLQueryResolver {

    @Autowired
    UserDAO userDAO;

    public UserDO getUserById(Integer id) {
        long a = System.currentTimeMillis();
        Optional<UserDO> byId = userDAO.findById(id);

        long b = System.currentTimeMillis();

        System.out.println(b - a);
        return byId.orElse(null);
    }

    public List<UserDO> listUser() {
        return userDAO.findAll();
    }

}
