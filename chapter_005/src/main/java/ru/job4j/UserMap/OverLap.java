package ru.job4j.UserMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Comp on 29.09.2017.
 */
public class OverLap {
    User user1 = new User("Fedor", 2, new Calendar());
    User user2 = new User("Andru", 7, new Calendar());;
    HashMap<User, Object> userObjectMap = new HashMap<>();

    public Map<User, Object> map() {
        userObjectMap.put(user1, new Object());
        userObjectMap.put(user2, new Object());

        for (Map.Entry<User, Object> userObjectEntry : userObjectMap.entrySet()) {
            User key = userObjectEntry.getKey();
            Object value = userObjectEntry.getValue();
            System.out.println(key + " " + value);
        }
        return userObjectMap;
    }
}
