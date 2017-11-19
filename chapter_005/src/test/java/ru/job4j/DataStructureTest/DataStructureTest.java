package ru.job4j.DataStructureTest;

import org.junit.Test;
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
    V value;
    private Class<? extends Object> expected;


    @Test
    public void iteratorTest() {
        dataStructure = new DataStructure();
        dataStructure.get(value);
        expected = null;
        //assertThat(value, is());
    }
}
