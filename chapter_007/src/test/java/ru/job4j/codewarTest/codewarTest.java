package ru.job4j.codewarTest;

import org.junit.Test;
import ru.job4j.codewar.codewar;

import static org.junit.Assert.assertEquals;
/**
 * Created by Comp on 10.10.2018.
 */
public class codewarTest {
    @Test public void test4a() {
        assertEquals("aaaa", codewar.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", codewar.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", codewar.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", codewar.repeatStr(0, "kata"));
    }
    @Test public void testNegativeRepeat() {
        assertEquals("", codewar.repeatStr(-10, "kata"));
    }
}

