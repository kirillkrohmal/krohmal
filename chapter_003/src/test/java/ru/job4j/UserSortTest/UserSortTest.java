package ru.job4j.UserSortTest;

import org.junit.Test;
import ru.job4j.UserSort.UserSort;
import ru.job4j.UserSort.UserSort.User;

import java.util.Arrays;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserSortTest {
    @Test
    public void whenSortNewUser() {
        UserSort sorted = new UserSort();

        /*TreeSet<User> sort = new TreeSet<>();
        sort.addAll(Arrays.asList(
                new User("Gena", 25),
                new User("Denis", 35),
                new User("Hulio", 18)
        ));*/
        //TreeSet<UserSort.User> sort = new TreeSet<>();

    }
}
