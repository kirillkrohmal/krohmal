package ru.job4j.UserSortTest2;

import org.junit.Test;

import ru.job4j.UserSort2.User;
import ru.job4j.UserSort2.SortUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 08.08.2017.
 */
public class UserSortTest2 {
    @Test
    public void whenSortLengthNewUser() {
        SortUser sort = new SortUser();
        List<User> list = new ArrayList<>();
        list = Arrays.asList(
                new User("Геннадий", 25),
                new User("Ден", 35),
                new User("Хулио", 18));
        List<User> result = sort.sortNameLength(list);
        List<User> expected = Arrays.asList(
                new User("Хулио", 18),
                new User("Геннадий", 25),
                new User("Денис", 35));
        assertThat(result, is(expected));
    }
}
