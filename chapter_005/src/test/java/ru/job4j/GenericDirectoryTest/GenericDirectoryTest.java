package ru.job4j.GenericDirectoryTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.GenericDirectory.GenericDirectory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class GenericDirectoryTest {
    GenericDirectory<Integer, String> directory;

    @Test
    public void iteratorTest() {
        GenericDirectory<Integer, String> directory = new GenericDirectory();
        directory.insert(1, "Вася");
        directory.insert(2, "Петя");
        directory.insert(3, "Женя");
        directory.insert(4, "Иван");
        Object result = directory.get(1);
        assertThat(result, is("Вася"));
    }
    @Test
    public void iteratorTest2() {
        GenericDirectory<Integer, String> directory = new GenericDirectory();
        directory.insert(1, "Вася");
        boolean result = directory.delete(1);
        assertThat(result, is(true));
    }

    @Before
    public void iteratorTest3() {
        directory = new GenericDirectory();

        directory.insert(1, "Вася");
        directory.insert(2, "Петя");
        directory.insert(3, "Женя");
        directory.insert(4, "Иван");
    }

    @Test
    public void iteratorTest4() {
        assertThat(directory.iterator().hasNext(), is(true));
        assertThat(directory.iterator().next(), is("Вася"));
        assertThat(directory.iterator().hasNext(), is(true));
        assertThat(directory.iterator().next(), is("Петя"));
        assertThat(directory.iterator().hasNext(), is(true));
        assertThat(directory.iterator().next(), is("Женя"));
        assertThat(directory.iterator().hasNext(), is(true));
        assertThat(directory.iterator().next(), is("Иван"));
        assertThat(directory.iterator().hasNext(), is(false));
    }
}
