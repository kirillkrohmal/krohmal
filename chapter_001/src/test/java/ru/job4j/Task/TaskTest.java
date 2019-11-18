package ru.job4j.Task;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class TaskTest
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 07.06.2017
 */
public class TaskTest {
    /**
     * Test equals.
     */
    @Test
    public void whenSubIsEqualsOrigin() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "стих";
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }
    /**
     * Test equals.
     */
    @Test
    public void whenSubIsEqualsOrigin1() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "иховед";
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }
    /**
     * Test equals.
     */
    @Test
    public void whenSubIsEqualsOrigin2() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "стишок";
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }
    /**
     * Test equals.
     */
    @Test
    public void whenSubIsEqualsOrigin3() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "хо";
        boolean result = task.contains(sub, origin);
        boolean expected = false;
        assertThat(result, is(expected));
    }
    /**
     * Test equals.
     */
    @Test
    public void whenSubIsEqualsOrigin4() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "горец";
        boolean result = task.contains(sub, origin);
        boolean expected = false;
        assertThat(result, is(expected));
    }
    /**
     * Test equals.
     */
    @Test
    public void whenSubIsEqualsOrigin5() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "и";
        boolean result = task.contains(sub, origin);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}

