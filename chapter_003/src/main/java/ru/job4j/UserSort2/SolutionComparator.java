package ru.job4j.UserSort2;

import java.util.Comparator;

/**
 * Created by Comp on 08.08.2017.
 */
public class SolutionComparator implements Comparator<User> {

    public Comparator<User> NameComparator = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public Comparator<User> AgeComparator = new Comparator<User>() {

        @Override
        public int compare(User o1, User o2) {
            return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
        }
    };

    @Override
    public int compare(User o1, User o2) {
        return 0;
    }
}




/*
    private boolean nameComparator(User o1, User o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if (len1 > len2) {
            return true;
        }
        return false;
    }

    public int compare(User o1, User o2) {
        if (nameComparator(o1, o2) == true) {

        } else {
            return -1;
        }
        return 0;
    }*/

