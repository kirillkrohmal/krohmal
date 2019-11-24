package ru.job4j.usermaptest;

import org.junit.Test;
import ru.job4j.usermap.OverLap;
import ru.job4j.usermap.User;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;

/**
 * Created by Comp on 21.09.2017.
 */
public class UserMapTest {
    /*Объявим две переменные date1, date2 (например вот так Calendar date1 = new GregorianCalendar();)
     присвойм им одинаковые значения дат, и убедимся, что они равны по equals.
     А затем добавим в Map две пары ключ-значение User, Object, т.к. User будут эквивалентны по equals, то в Map'е окажется
     лишь одна пара.*/

    @Test
    public void iteratorTest2() {
        User user1 = new User("Fedor", 2, Calendar.getInstance());
        User user2 = new User("Fedor", 2, Calendar.getInstance());


        OverLap overLap = new OverLap();
        Map<User, Object> result = overLap.map();

        result.put(user1, "first");
        result.put(user2, "first");

        System.out.println(user1.equals(user2));
    }

    @Test
    public void iteratorTest3() {
        Calendar date1 = new GregorianCalendar();
        Calendar date2 = new GregorianCalendar();

        User user1 = new User("Fedor", 2, date1);
        User user2 = new User("Fedor", 2, date2);

        OverLap overLap = new OverLap();
        Map<User, Object> result = overLap.map();

        result.put(user1, "first");
        result.put(user2, "first");

        System.out.println(user1.equals(user2));
    }
}

