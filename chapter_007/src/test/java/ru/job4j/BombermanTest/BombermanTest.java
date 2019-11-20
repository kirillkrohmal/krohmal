package ru.job4j.BombermanTest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 25.08.2018.
 */
public class BombermanTest {
    @Test
    public void whenExecute2ThreadThen2() throws InterruptedException {


        assertThat(null, is(2));
    }
}
