package ru.job4j.testcollectiont;

import org.junit.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LogicAndTest {
    @Test
    public void test() {
        assertFalse(LogicAnd.check(2));
        assertTrue(LogicAnd.check(1));
        assertTrue(LogicAnd.check(-2));
    }
}
