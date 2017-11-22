package ru.job4j.DataStructureTest;

import org.junit.Test;
import ru.job4j.GenericDirectory.GenericDirectory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 19.11.2017.
 */
public class DataStructureTest<K, V> {
    GenericDirectory genericDirectory;
    K key;
    Class<?> value;
    private Class<?> expected;

    @Test
    public void iteratorTest() {
        genericDirectory = new GenericDirectory();
        genericDirectory.get(value);
        expected = null;
        //assertThat(value, is());
    }

    @Test
    public void iteratorTest2() {
        genericDirectory = new GenericDirectory();
        genericDirectory.insert(key, value);
        expected = value;
        assertThat(value, is(java.util.Optional.ofNullable(expected)));
    }

    @Test
    public void iteratorTest3() {
        genericDirectory = new GenericDirectory();
        genericDirectory.delete(key);
        expected = value;
        assertThat(value, is(java.util.Optional.ofNullable(expected)));
    }
}
