package ru.job4j.usersort2;

import java.util.Comparator;

/**
 * Created by Comp on 08.08.2017.
 */
public class NameComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}
