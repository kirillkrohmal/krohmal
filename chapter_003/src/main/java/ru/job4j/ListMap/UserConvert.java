package ru.job4j.ListMap;

import java.util.*;
import java.util.stream.Collectors;

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> users = new HashMap<>();

        for (User i : list) {
            users.put(i.getId(), i);
        }

        return users;
    }
}


