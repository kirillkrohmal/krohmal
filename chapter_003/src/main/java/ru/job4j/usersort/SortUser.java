package ru.job4j.usersort;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Comp on 08.08.2017.
 */
public class SortUser {
    public Set<User> sort() {
        TreeSet<User> sort = new TreeSet<>();
        sort.addAll(Arrays.asList(
                new User("Gena", 25),
                new User("Denis", 35),
                new User("Hulio", 18)
        ));
        System.out.println(String.format("%s", sort));
        return sort;
    }

    public static void main(String[] args) {
        SortUser sortUser = new SortUser();
        sortUser.sort();
    }
}
