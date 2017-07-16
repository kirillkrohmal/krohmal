package ru.job4j.UserSortTest;

import org.junit.Test;
import ru.job4j.UserSort.UserSort;

import java.util.Arrays;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserSortTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        UserSort sorted = new UserSort();
        TreeSet<UserSort.User> sort = new TreeSet<>();

    }
}
