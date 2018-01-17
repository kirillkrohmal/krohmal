package ru.job4j.GenericDirectoryTest;

import org.junit.Test;
import ru.job4j.GenericDirectory.GenericDirectory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class GenericDirectoryTest {
    @Test
    public void iteratorTest() {
        GenericDirectory directory = new GenericDirectory();
        //Map<User, Object> result = directory.map();
        directory.insert(1, "Вася");
        directory.insert(2, "Петя");
        directory.insert(3, "Женя");
        directory.insert(4, "Иван");
        Object result = directory.get(1);
        assertThat(result, is(true));
    }
    @Test
    public void iteratorTest2() {
        GenericDirectory directory = new GenericDirectory();
        //Map<User, Object> result = directory.map();
        directory.insert(1, "Вася");
        directory.insert(2, "Петя");
        directory.insert(3, "Женя");
        directory.insert(4, "Иван");
        directory.delete(1);
        directory.delete(2);
        directory.delete(3);
        directory.delete(4);
        Object result = directory.get(1);
        assertThat(result, is(true));
    }

    @Test
    public void iteratorTest3() {
        GenericDirectory directory = new GenericDirectory();
        //Map<User, Object> result = directory.map();
        directory.insert(1, "Вася");
        directory.insert(2, "Петя");
        directory.insert(3, "Женя");
        directory.insert(4, "Иван");

        assertThat(directory.iterator().hasNext(), is(true));
        assertThat(directory.iterator().next(), is(1));
        assertThat(directory.iterator().hasNext(), is(true));
        assertThat(directory.iterator().next(), is(2));
        assertThat(directory.iterator().hasNext(), is(true));
        assertThat(directory.iterator().next(), is(3));
        assertThat(directory.iterator().hasNext(), is(true));
        assertThat(directory.iterator().next(), is(4));
        assertThat(directory.iterator().hasNext(), is(true));
    }
}
