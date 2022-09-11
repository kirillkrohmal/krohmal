package ru.job4j.testcollection;

import org.junit.Test;
import testcollection.PredicateCheckPositive;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PredicateCheckPositiveTest {
    @Test
    public void whenPositive() {
        assertTrue(PredicateCheckPositive.verification(1));
        assertFalse(PredicateCheckPositive.verification(-1));
        assertFalse(PredicateCheckPositive.verification(0));
    }
}
