package ru.job4j.extrataskstest.task014;

import org.junit.Test;
import ru.job4j.extratasks.task014.RearranStr;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.08.2017.
 */
public class RearranStrTest {
    @Test
    public void whenWriteSentenceAndHaveReverse2() {
        String sentence = "Он может программировать и зарабатывать";
        String expected = "зарабатывать и программировать может Он ";
        RearranStr rearranStr = new RearranStr();
        String result = rearranStr.reverse(sentence);
        assertThat(result, is(expected));
    }

    @Test
    public void whenWriteSentenceAndHaveReverse3() {
        String sentence = "программируй";
        String expected = "программируй ";
        RearranStr rearranStr = new RearranStr();
        String result = rearranStr.reverse(sentence);
        assertThat(result, is(expected));
    }
}
