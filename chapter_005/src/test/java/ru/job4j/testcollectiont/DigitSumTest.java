package ru.job4j.testcollectiont;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DigitSumTest {
    @Test
    public void test() {
        assertEquals(1, DigitSum.sum(1));
        assertEquals(3, DigitSum.sum(12));
        assertEquals(6, DigitSum.sum(123));
        assertEquals(10, DigitSum.sum(1234));
        assertEquals(15, DigitSum.sum(12345));
    }
}
