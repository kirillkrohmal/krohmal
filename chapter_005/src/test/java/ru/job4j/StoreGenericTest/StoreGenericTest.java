package ru.job4j.StoreGenericTest;

import org.junit.Test;
import ru.job4j.SimpleArray.SimpleArray;
import ru.job4j.StoreGeneric.AbstractStore;
import ru.job4j.StoreGeneric.Base;
import ru.job4j.StoreGeneric.RoleStore;
import ru.job4j.StoreGeneric.UserStore;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StoreGenericTest {
    @Test
    public void iteratorTest() {
        AbstractStore abstractStore = new AbstractStore();
        Base base = new Base(){};
        base.setId("2");
        Object result = abstractStore.add(base);
        Object expected = null;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest2() {
        AbstractStore abstractStore = new AbstractStore();
        Base base = new Base(){};
        base.setId("2");
        abstractStore.add(base);
        Object result = abstractStore.update(base);
        Object expected = null;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest3() {
        AbstractStore abstractStore = new AbstractStore();
        Base base = null;
        abstractStore.add(base);
        String id = "121214";
        Object result = abstractStore.delete(id);
        Object expected = null;
        assertThat(result, is(expected));
    }
}

