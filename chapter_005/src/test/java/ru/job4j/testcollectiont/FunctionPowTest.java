package ru.job4j.testcollectiont;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class FunctionPowTest {
    @Test
    public void test() {
        assertEquals(4, FunctionPow.calculate(2), 0.01);
        assertEquals(9, FunctionPow.calculate(3), 0.01);
    }
}
