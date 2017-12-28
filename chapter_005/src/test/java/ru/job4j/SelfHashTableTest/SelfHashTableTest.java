package ru.job4j.SelfHashTableTest;

import org.junit.Test;
import ru.job4j.SelfHashTable.SelfHashTable;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by user on 15.12.2017.
 */
public class SelfHashTableTest {
    @Test
    public void iteratorTest2() {
        SelfHashTable selfHashTable = new SelfHashTable(new Object[1000]);
        selfHashTable.add(5);
        Object result = selfHashTable.remove(5);
        assertThat(result, is(true));
    }
    @Test
    public void iteratorTest3() {
        SelfHashTable selfHashTable = new SelfHashTable(new Object[1000]);
        selfHashTable.add(5);
        Object result = selfHashTable.contains(0);
        assertThat(result, is(true));
    }
}
