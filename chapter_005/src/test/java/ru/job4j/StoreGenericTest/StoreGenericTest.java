package ru.job4j.StoreGenericTest;

import org.junit.Test;
import ru.job4j.StoreGeneric.*;

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
    public void iteratorTest2() {
        AbstractStore abstractStore = new RoleStore();

        Base base = new Role("врач", 3);
        Base expected = new Role("дантист", 5);
        abstractStore.add(base);
        abstractStore.add(expected);
        Base result = abstractStore.update(expected);

        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest3() {
        AbstractStore abstractStore = new RoleStore();

        Base base = new Role("врач", 3);
        Base expected = new Role("дантист", 5);
        abstractStore.add(base);
        abstractStore.add(expected);
        boolean result = abstractStore.delete("1");

        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest4() {
        AbstractStore<Base> abstractStore = new UserStore();

        Base expected = new User("Иван", 30);
        Base result = abstractStore.add(expected);

        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest5() {
        AbstractStore<Base> abstractStore = new UserStore();

        Base base = new User("Иван", 30);
        Base expected = new User("Федр", 34);
        abstractStore.add(base);
        abstractStore.add(expected);
        Base result = abstractStore.update(expected);

        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest6() {
        AbstractStore<Base> abstractStore = new UserStore();

        Base base = new User("Иван", 30);
        Base base2 = new User("Федр", 34);
        abstractStore.add(base);
        abstractStore.add(base2);
        boolean result = abstractStore.delete("Иван");
        boolean expected = true;

        assertThat(result, is(expected));
    }
}

