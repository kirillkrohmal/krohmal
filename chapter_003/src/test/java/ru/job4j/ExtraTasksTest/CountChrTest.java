package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.CountChr;

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
        boolean result = countChr.countIt(array);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCountCharAndHaveUniqChars2() {
        char[] array = {'q', 'c', 'z'};
        CountChr countChr = new CountChr();
        boolean result = countChr.countIt(array);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCountCharAndHaveUniqChars3() {
        char[] array = {'t', 'j', 'k'};
        CountChr countChr = new CountChr();
        boolean result = countChr.countIt(array);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCountCharAndHaveUniqChars4() {
        char[] array = {'c', 'z', 'z'};
        CountChr countChr = new CountChr();
        boolean result = countChr.countIt(array);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}


