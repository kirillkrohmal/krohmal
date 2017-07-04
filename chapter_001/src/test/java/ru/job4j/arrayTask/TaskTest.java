package ru.job4j.arrayTask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TaskTest {
    @Test
    public void whenSubIsEqualsOrigin() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "стих";
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin1() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "иховед";
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin2() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "стишок";
        boolean result = task.contains(sub, origin);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin3() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "хо";
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin4() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "стих1111";
        boolean result = task.contains(sub, origin);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin5() {
        Task task = new Task();
        String sub = "стиховедческий";
        String origin = "и";
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }


}

