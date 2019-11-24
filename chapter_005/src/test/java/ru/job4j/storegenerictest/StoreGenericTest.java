package ru.job4j.storegenerictest;

import org.junit.Test;
import ru.job4j.storegeneric.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StoreGenericTest {
    @Test
    public void iteratorTest() {
        AbstractStore<Base> abstractStore = new RoleStore<>();

        Base expected = new Role("врач", 3);
        Base result = abstractStore.add(expected);

        assertThat(result, is(expected));
    }


    @Test
    public void iteratorTest4() {
        AbstractStore<Base> abstractStore = new UserStore();

        Base expected = new User("Иван", 30);
        Base result = abstractStore.add(expected);

        assertThat(result, is(expected));
    }
}

