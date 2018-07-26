package ru.job4j.ProducerCustomerTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.ProducerConsumer.SimpleBlockingQueue;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.07.2018.
 */
public class ProducerConsumerTest {
    SimpleBlockingQueue simpleBlockingQueue;

    @Test
    public void iteratorTest() {


        assertThat(simpleBlockingQueue, is("test name1"));

    }

    @Before
    public void iteratorTest2() {


        assertThat(simpleBlockingQueue, is("test name2"));
    }

    @Test
    public void iteratorTest3() {

        assertThat(simpleBlockingQueue, is("test name3"));
    }
}
