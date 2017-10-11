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
        Base base = new Role("r", 3);
        Base result = abstractStore.add(base);
        Base expected = base;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest2() {
        AbstractStore abstractStore = new RoleStore();
        Base base = new Base(){};
        base.setId("2");
        abstractStore.add(base);
        Object result = abstractStore.update(base);
        Object expected = new Object();
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest3() {
        AbstractStore abstractStore = new RoleStore();
        Base base = null;
        abstractStore.add(base);
        String id = "121214";
        Object result = abstractStore.delete(id);
        Object expected = new Object();
        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest4() {
        AbstractStore abstractStore = new UserStore();
        Base base = new Base(){};
        base.setId("2");
        Object result = abstractStore.add(base);
        Object expected = new Object();
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest5() {
        AbstractStore abstractStore = new UserStore();
        Base base = new Base(){};
        base.setId("2");
        abstractStore.add(base);
        Object result = abstractStore.update(base);
        Object expected = new Object();
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest6() {
        AbstractStore abstractStore = new UserStore();
        Base base = null;
        abstractStore.add(base);
        String id = "121214";
        Object result = abstractStore.delete(id);
        Object expected = new Object();
        assertThat(result, is(expected));
    }
}

