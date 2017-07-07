package ru.job4j.arrayTask2;

import org.junit.Test;
import ru.job4j.arrayTask.Task;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 30.06.2017.
 */
public class ArrayTaskTest2 {
    @Test
    public void whenTwo() {
        ArrayTask2 task = new ArrayTask2();
        boolean result = task.contains(new String[] {"a", "b"}, new String[] {"a", "c"});
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwo2() {
        ArrayTask2 task = new ArrayTask2();
        boolean result = task.contains(new String[] {"a", "b"}, new String[] {"b", "c"});
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwo3() {
        ArrayTask2 task = new ArrayTask2();
        boolean result = task.contains(new String[] {"abc"}, new String[] {"ac"});
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwo4() {
        ArrayTask2 task = new ArrayTask2();
        boolean result = task.contains(new String[] {"000"}, new String[] {"001"});
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwo5() {
        ArrayTask2 task = new ArrayTask2();
        boolean result = task.contains(new String[] {"стишок"}, new String[] {"стишок1"});
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwo6() {
        ArrayTask2 task = new ArrayTask2();
        boolean result = task.contains(new String[] {"стих"}, new String[] {"стих"});
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwo7() {
        ArrayTask2 task = new ArrayTask2();
        boolean result = task.contains(new String[] {"cn"}, new String[] {"cn"});
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwo8() {
        ArrayTask2 task = new ArrayTask2();
        boolean result = task.contains(new String[] {"стишок"}, new String[] {"стишок"});
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
