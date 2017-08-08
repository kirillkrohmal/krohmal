package ru.job4j.UserSort2;

import java.util.Comparator;

/**
 * Created by Comp on 08.08.2017.
 */
public class SolutionComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        int compare = o1.name.compareTo(o2.name);
        return compare != 0 ? compare : Integer.compare(o1.age, o2.age);
    }
}



