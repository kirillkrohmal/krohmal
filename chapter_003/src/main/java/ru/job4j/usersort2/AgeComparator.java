package ru.job4j.usersort2;

import java.util.Comparator;

/**
 * Created by Comp on 08.08.2017.
 */
public class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}
