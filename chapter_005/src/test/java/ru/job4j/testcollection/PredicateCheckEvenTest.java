package ru.job4j.testcollection;

import org.junit.Test;
import testcollection.PredicateCheckEven;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PredicateCheckEvenTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }
}
