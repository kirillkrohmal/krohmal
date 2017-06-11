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
}

