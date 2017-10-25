package ru.job4j.CountSpaceTest;

import org.junit.Test;
import ru.job4j.CountSpace.CountThread;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */


public class CountSpaceTest {
    @Test
    public void threadTest() {
        //new Thread(new CountThread("Пример использования Java Thread Join()")).start();
        //Thread result = new Thread(new CountSpace("Пример использования Java Thread Join()")).start();
        Thread expected = new Thread();
        //assertThat(result, is(expected));
    }
}
