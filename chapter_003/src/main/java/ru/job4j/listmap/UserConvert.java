package ru.job4j.listmap;

import java.util.HashMap;
import java.util.List;

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> users = new HashMap<>();

        for (User i : list) {
            users.put(i.getId(), i);
        }
        return users;
    }
}


