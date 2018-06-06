package ru.job4j.TestTaskTestIt;

import org.junit.Test;
import ru.job4j.TestTask.TestTask;
import ru.job4j.TestTask.TestTask2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.05.2018.
 */
public class TestTaskTestIt {
    private TestTask testTask = new TestTask();
    private TestTask2 testTask2 = new TestTask2();

    @Test
    public void iteratorTest() {
        String[] expected = new String[0];
        String result = testTask.showAlgorithm(new String[]{"xcv"}, new String[]{"sdf"});

        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest2() {
        String[] expected = new String[0];
        String result  = testTask2.showAlgorithm("xcvw", new String[]{"sdfqew"});

        assertThat(result, is(expected));
    }
}
