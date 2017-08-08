package ru.job4j.UserSort2;

import java.util.Collections;
import java.util.List;

/**
* Created by Comp on 08.08.2017.
*/
public class SortUser {
    public List<User> sortNameLength(List<User> list) {
        Collections.sort(list, new NameComparator());
        return list;
    }

    public List<User> sortByAllFields(List<User> list) {
        Collections.sort(list, new SolutionComparator());
        return list;

        /*
        new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name);
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        System.out.println(list);*/
    }

}
