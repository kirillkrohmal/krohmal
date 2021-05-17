package ru.job4j;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.job4j.storages.JdbcStorage;
import ru.job4j.storages.UserStorage;
import ru.job4j.storages.entity.User;

import static org.junit.Assert.assertEquals;


public class JdbcStorageTest {

    @Test
    public void whenAddUserToTheSystemShouldCheckThatStorageSafeIt() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        JdbcStorage jdbcStorage = applicationContext.getBean(JdbcStorage.class);
        UserStorage userStorage = new UserStorage(jdbcStorage);

        User user = new User();

        user.setFirstName("test1");
        user.setLastName("test2");
        user.setEmail("test3");

        userStorage.add(user);

        assertEquals(userStorage.get(0), user);
    }
}