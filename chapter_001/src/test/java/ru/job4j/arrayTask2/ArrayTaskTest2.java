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
        String sub1 = "стиховедческий";
        String sub2 = "стих";
        String sub3 = "стиховед";
        String[] sub = {sub1, sub2, sub3};
        String[] origin = {"стих"};
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubIsEqualsOrigin1() {
        ArrayTask2 task = new ArrayTask2();
        String sub1 = "стихи";
        String sub2 = "стихотворение";
        String sub3 = "стиховед";
        String[] sub = {sub1, sub2, sub3};
        String[] origin = {"стих"};
        boolean result = task.contains(sub, origin);
        boolean expected = false;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubIsEqualsOrigin2() {
        ArrayTask2 task = new ArrayTask2();
        String sub1 = "стиховедческий";
        String sub2 = "стишки";
        String sub3 = "стишок";
        String[] sub = {sub1, sub2, sub3};
        String[] origin = {"стишок"};
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin3() {
        ArrayTask2 task = new ArrayTask2();
        String sub1 = "стиховедческий";
        String sub2 = "cn";
        String sub3 = "cn";
        String[] sub = {sub1, sub2, sub3};
        String[] origin = {"cn"};
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin4() {
        ArrayTask2 task = new ArrayTask2();
        String sub1 = "стиховедческий";
        String sub2 = "стишки";
        String sub3 = "стишок";
        String[] sub = {sub1, sub2, sub3};
        String[] origin = {"стишок"};
        boolean result = task.contains(sub, origin);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin5() {
        ArrayTask2 task = new ArrayTask2();
        String sub1 = "стиховедческий";
        String sub2 = "стишки";
        String sub3 = "стишок";
        String[] sub = {sub1, sub2, sub3};
        String[] origin = {"стишок1"};
        boolean result = task.contains(sub, origin);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubIsEqualsOrigin6() {
        ArrayTask2 task = new ArrayTask2();
        String sub1 = "000";
        String sub2 = "01";
        String sub3 = "002";
        String[] sub = {sub1, sub2, sub3};
        String[] origin = {"001"};
        boolean result = task.contains(sub, origin);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}
