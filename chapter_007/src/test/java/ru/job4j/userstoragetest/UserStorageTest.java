package ru.job4j.userstoragetest;


import org.junit.Test;
import ru.job4j.userstorage.User;
import ru.job4j.userstorage.UserStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Comp on 22.06.2017.
 */
public class UserStorageTest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        UserStorage userStorage = new UserStorage();//key, id, name, desc, creat

        List<User> result = Arrays.asList(new User(1, 100));
        List<User> expected = Arrays.asList(new User(1, 100));
        User user = new User(1, 100);
        userStorage.add(user);
        assertThat(expected, is(new User(1, 100)));
    }

    @Test
    public void whenUserUpdateItemThenTrackerHasNewItemWithSameName() {
        UserStorage userStorage = new UserStorage();//key, id, name, desc, creat

        List<User> result = Arrays.asList(new User(1, 100));
        List<User> expected = Arrays.asList(new User(2, 200));
        User user = new User(2, 200);
        userStorage.update(user, 2);
        assertThat(expected, is(result));
    }

    @Test
    public void whenUserDeleteItemThenTrackerHasNewItemWithSameName() {
        UserStorage userStorage = new UserStorage();//key, id, name, desc, creat

        List<User> result = Arrays.asList(new User(1, 100));
        List<User> expected = Arrays.asList(new User(1, 100));
        User user = new User(1, 100);
        userStorage.add(user);
        assertThat(expected, is(result));
    }

    @Test
    public void whenUserTransferItemThenTrackerHasNewItemWithSameName() {
        UserStorage userStorage = new UserStorage();//key, id, name, desc, creat

        List<User> result = Arrays.asList(new User(1, 100));
        List<User> expected = Arrays.asList(new User(1, 100));
        User user = new User(1, 100);
        userStorage.add(user);
        assertThat(expected, is(result));
    }

}
