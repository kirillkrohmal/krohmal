package ru.job4j.testcollectiont;

import org.junit.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PredicateCheckEvenAndPositiveTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEvenAndPositive.check(2));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
        assertFalse(PredicateCheckEvenAndPositive.check(1));
    }
}
