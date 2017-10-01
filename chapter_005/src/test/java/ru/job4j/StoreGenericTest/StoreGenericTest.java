package ru.job4j.StoreGenericTest;

import org.junit.Test;
import ru.job4j.SimpleArray.SimpleArray;
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
        RoleStore roleStore = new RoleStore();
        Base base = new Base(){};
        base.setId("2");
        Object result = roleStore.add(base);
        Object expected = null;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest2() {
        RoleStore roleStore = new RoleStore();
        Base base = new Base(){};
        base.setId("2");
        roleStore.add(base);
        Object result = roleStore.update(base);
        Object expected = null;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest3() {
        RoleStore roleStore = new RoleStore();
        Base base = null;
        roleStore.add(base);
        String id = "121214";
        Object result = roleStore.delete(id);
        Object expected = null;
        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest4() {
        UserStore userStore = new UserStore();
        Base base = null;
        Object result = userStore.add(base);
        Object expected = null;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest5() {
        UserStore userStore = new UserStore();
        Base base = null;
        userStore.add(base);
        Object result = userStore.update(base);
        Object expected = null;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest6() {
        UserStore userStore = new UserStore();
        Base base = null;
        userStore.add(base);
        String id = "121214";
        Object result = userStore.delete(id);
        Object expected = null;
        assertThat(result, is(expected));
    }
}
