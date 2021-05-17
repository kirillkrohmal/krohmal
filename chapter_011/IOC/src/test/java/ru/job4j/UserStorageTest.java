package ru.job4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import ru.job4j.storages.UserStorage;
import ru.job4j.storages.entity.User;

import static org.junit.Assert.assertEquals;


public class UserStorageTest {

    @Test
    public void whenAddUserToTheSystemShouldCheckThatStorageSafeIt() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage userStorage = applicationContext.getBean(UserStorage.class);

        User user = new User();

        user.setId(0);
        user.setLastName("Michael");
        user.setFirstName("Gutov");
        user.setEmail("michael@gmail.com");

        userStorage.add(user);

        assertEquals(userStorage.get(0), user);
    }
}