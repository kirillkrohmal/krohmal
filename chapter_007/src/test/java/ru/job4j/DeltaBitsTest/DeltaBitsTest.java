package ru.job4j.DeltaBitsTest;

import org.junit.Test;
import ru.job4j.DeltaBits.DeltaBits;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 10.10.2018.
 */
public class DeltaBitsTest {
    @Test
    public void test() throws Exception {
        assertThat(DeltaBits.convertBits(31, 14), is(2));
    }
}
