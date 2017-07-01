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
    public void whenSubIsEqualsOrigin() {
        ArrayTask2 task = new ArrayTask2();
        String[] sub = {"стиховедческий, стих, стиховед"};
        String[] origin = {"стих"};
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
