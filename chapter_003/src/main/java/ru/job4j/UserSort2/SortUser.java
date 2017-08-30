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
    }
}
