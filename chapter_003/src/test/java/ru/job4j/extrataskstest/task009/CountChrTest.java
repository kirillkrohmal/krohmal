package ru.job4j.extrataskstest.task009;

import org.junit.Test;
import ru.job4j.extratasks.task009.CountChr;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class CountChrTest {
    @Test
    public void whenCountCharAndHaveUniqChars() {
        char[] array = {'c', 's', 'd'};
        CountChr countChr = new CountChr();
        int expected = 1;
        assertThat(countChr.countIt(array, 'c'), is(expected));
    }

    @Test
    public void whenCountCharAndHaveUniqChars2() {
        char[] array = {'q', 'c', 'z'};
        CountChr countChr = new CountChr();
        int expected = 1;
        assertThat(countChr.countIt(array, 'c'), is(expected));
    }

    @Test
    public void whenCountCharAndHaveUniqChars3() {
        char[] array = {'t', 'j', 'k'};
        CountChr countChr = new CountChr();
        int expected = 0;
        assertThat(countChr.countIt(array, 'c'), is(expected));
    }

    @Test
    public void whenCountCharAndHaveUniqChars4() {
        char[] array = {'c', 'c', 'c', 'c', 'c', 'c'};
        CountChr countChr = new CountChr();
        int expected = 6;
        assertThat(countChr.countIt(array, 'c'), is(expected));
    }

    @Test
    public void whenCountCharAndHaveUniqChars5() {
        char[] array = {'d', 'c', 'z', 'c', 'c', 'c'};
        CountChr countChr = new CountChr();
        int expected = 4;
        assertThat(countChr.countIt(array, 'c'), is(expected));
    }

    @Test
    public void whenCountCharAndHaveUniqChars6() {
        char[] array = {'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'a', 'c', 'c', 'c', 'c', 'c', 'c'};
        CountChr countChr = new CountChr();
        int expected = 17;
        assertThat(countChr.countIt(array, 'c'), is(expected));
    }
}


