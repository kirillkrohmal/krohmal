package ru.job4j.UserMapTest;

import org.junit.Test;
import ru.job4j.UserMap.OverLap;
import ru.job4j.UserMap.User;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class UserMapTest {
    @Test
    public void iteratorTest() {
        OverLap overLap = new OverLap();
        Map<User, Object> result = overLap.map();
        String[] expected =
                {
                        "User{name='Fedor', children=2, birthday=ru.job4j.UserMap.Calendar@deb6432} java.lang.Object@694f9431\n" + "User{name='Fedor', children=2, birthday=ru.job4j.UserMap.Calendar@deb6432} java.lang.Object@694f9431"
                };
        assertThat(result, is(expected));
    }
}
