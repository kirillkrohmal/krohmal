package ru.job4j.ExtraTasksTest.task_010;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_009.CountChr;
import ru.job4j.ExtraTasks.task_010.TestBrks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class TestBrksTest {
    @Test
    public void whenBraketsHavePairInOneSentence() {
        String brkts = "()";
        TestBrks testBrks = new TestBrks();
        boolean result = testBrks.braketsChoice(brkts);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenBraketsNotHavePairInOneSentence() {
        String brkts = "()(()((())))";
        TestBrks testBrks = new TestBrks();
        boolean result = testBrks.braketsChoice(brkts);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenBraketsHavePairInOneSentence2() {
        String brkts = "()(()((())))";
        TestBrks testBrks = new TestBrks();
        boolean result = testBrks.braketsChoice(brkts);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenBraketsHavePairInOneSentence3() {
        String brkts = "()(()((())))";
        TestBrks testBrks = new TestBrks();
        boolean result = testBrks.braketsChoice(brkts);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}


