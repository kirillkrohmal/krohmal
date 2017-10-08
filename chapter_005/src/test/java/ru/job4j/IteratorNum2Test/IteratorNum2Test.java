package ru.job4j.IteratorNum2Test;

import org.junit.Test;
import ru.job4j.IteratorNum.IteratorNum;
import ru.job4j.IteratorNum2.IteratorNum2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class IteratorNum2Test {
    @Test
    public void iteratorTest() {
        int[] value = {1, 2, 3, 4, 5, 6, 7};
        IteratorNum2 iteratorNum2 = new IteratorNum2(value);
        int[] expected = {2, 3};
        iteratorNum2.next();
        iteratorNum2.next();
        iteratorNum2.next();
        Object result = iteratorNum2.next();
        assertThat(result, is(expected));
    }
    @Test
    public void iteratoTest3 () {
        IteratorNum2 iteratorNum2 = new IteratorNum2(new int[]{3, 4, 5, 6, 7});
        assertThat(iteratorNum2.hasNext(), is(true));
        assertThat(iteratorNum2.next(), is(3));
        assertThat(iteratorNum2.hasNext(), is(true));
        assertThat(iteratorNum2.next(), is(5));
        assertThat(iteratorNum2.hasNext(), is(true));
        assertThat(iteratorNum2.next(), is(7));
        assertThat(iteratorNum2.hasNext(), is(false));
    }

}