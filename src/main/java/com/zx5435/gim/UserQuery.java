package com.zx5435.gim;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserQuery implements GraphQLQueryResolver {

    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        userMap.put(1, new User(1, "asdfadf"));
        userMap.put(2, new User(2, "adsvcv"));
        userMap.put(3, new User(3, "hgfesd"));
        userMap.put(4, new User(4, "wqer"));
    }

    public User getUserById(Integer id) {
        return userMap.get(id);
    }

    public List<User> listUser() {
        return new ArrayList<>(userMap.values());
    }

}
