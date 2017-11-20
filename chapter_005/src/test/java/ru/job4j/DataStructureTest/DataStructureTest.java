package ru.job4j.DataStructureTest;

import org.junit.Test;
import org.testng.annotations.Optional;
import ru.job4j.DataStructure.DataStructure;
import ru.job4j.DynamicList.DynamicList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 19.11.2017.
 */
public class DataStructureTest<K, V> {
    DataStructure dataStructure;
    K key;
    Class<?> value;
    private Class<?> expected;

    @Test
    public void iteratorTest() {
        dataStructure = new DataStructure();
        dataStructure.get(value);
        expected = null;
        //assertThat(value, is());
    }

    @Test
    public void iteratorTest2() {
        dataStructure = new DataStructure();
        dataStructure.insert(key, value);
        expected = value;
        assertThat(value, is(java.util.Optional.ofNullable(expected)));
    }

    @Test
    public void iteratorTest3() {
        dataStructure = new DataStructure();
        dataStructure.delete(key);
        expected = value;
        assertThat(value, is(java.util.Optional.ofNullable(expected)));
    }
}
