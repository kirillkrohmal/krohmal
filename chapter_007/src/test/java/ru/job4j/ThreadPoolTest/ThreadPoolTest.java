package ru.job4j.ThreadPoolTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.ProducerConsumer.SimpleBlockingQueue;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 30.07.2018.
 */
public class ThreadPoolTest {

    @Test
    public void iteratorTest() {


        assertThat(true, is("test name1"));

    }

    @Before
    public void iteratorTest2() {


        assertThat(true, is("test name2"));
    }

    @Test
    public void iteratorTest3() {

        assertThat(true, is("test name3"));
    }
}
