package ru.job4j.ListMapTest;

import org.junit.Test;
import ru.job4j.ListMap.User;
import ru.job4j.ListMap.UserConvert;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 13.07.2017.
 */
public class ListMapTest {

    @Test
    public void whenConvertListToMap() {
        UserConvert listMap = new UserConvert();
        HashMap<Integer, User> result = listMap.process(Arrays.asList(
                new User(1, "Victor", "Moscow"),
                new User(2, "Vanya", "Moscow"),
                new User(3, "Irina", "Volgograd"),
                new User(4, "Madina", "Voroneg")));
        List<User> expected = Arrays.asList(
                new User(1, "Victor", "Moscow"),
                new User(2, "Vanya", "Moscow"),
                new User(3, "Irina", "Volgograd"),
                new User(4, "Madina", "Voroneg"));
        assertThat(result, is(expected));
    }
}

