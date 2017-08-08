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
    public void whenSortLengthUser() {
        SortUser sort = new SortUser();
        List<User> list = new ArrayList<>();
        list = Arrays.asList(
                new User("Геннадий", 25),
                new User("Ден", 35),
                new User("Хулио", 18));
        List<User> result = sort.sortNameLength(list);
        List<User> expected = Arrays.asList(
                new User("Ден", 35),
                new User("Хулио", 18),
                new User("Геннадий", 25));
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortAgeUser() {
        SortUser sort = new SortUser();
        List<User> list = new ArrayList<>();
        list = Arrays.asList(
                new User("Геннадий", 25),
                new User("Хулио", 18),
                new User("Ден", 35));
        List<User> result = sort.sortByAllFields(list);
        List<User> expected = Arrays.asList(
                new User("Геннадий", 25),
                new User("Ден", 35),
                new User("Хулио", 18));
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortAgeUser2() {
        SortUser sort = new SortUser();
        List<User> list = new ArrayList<>();
        list = Arrays.asList(
                new User("Гена", 18),
                new User("Хулио", 25),
                new User("Дениска", 35));
        List<User> result = sort.sortByAllFields(list);
        List<User> expected = Arrays.asList(
                new User("Гена", 18),
                new User("Дениска", 35),
                new User("Хулио", 25));
        assertThat(result, is(expected));
    }
}
