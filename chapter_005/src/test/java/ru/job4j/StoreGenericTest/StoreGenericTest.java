package ru.job4j.StoreGenericTest;

import org.junit.Test;
import ru.job4j.SimpleArray.SimpleArray;
import ru.job4j.StoreGeneric.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StoreGenericTest {
    @Test
    public void iteratorTest() {
        AbstractStore<Base> abstractStore = new RoleStore<>();
        Base base = new Role("врач", 3);
        Base result = abstractStore.add(base);
        Base expected = base;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest2() {
        AbstractStore abstractStore = new RoleStore();
        Base base = new Role("врач", 3);
        Base base2 = new Role("дантист", 5);
        abstractStore.add(base);
        abstractStore.add(base2);
        Base result = abstractStore.update(base2);
        Base expected = base2;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest3() {
        AbstractStore abstractStore = new RoleStore();
        Base base = new Role("врач", 3);
        Base base2 = new Role("дантист", 5);
        abstractStore.add(base);
        abstractStore.add(base2);
        boolean result = abstractStore.delete("1");
        Base expected = base2;
        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest4() {
        AbstractStore<Base> abstractStore = new UserStore();
        Base base = new User("Иван", 30);
        Base result = abstractStore.add(base);
        Base expected = base;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest5() {
        AbstractStore<Base> abstractStore = new UserStore();
        Base base = new User("Иван", 30);
        Base base2 = new User("Федр", 34);
        abstractStore.add(base);
        abstractStore.add(base2);
        Base result = abstractStore.update(base2);
        Base expected = base2;
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

