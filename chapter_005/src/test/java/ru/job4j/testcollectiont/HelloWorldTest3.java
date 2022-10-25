package ru.job4j.testcollectiont;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest3 {
    @Test
    public void checkNumberHelloWorld() {
        String s = HelloWorld3.checkNumber(15);
        assertThat(s, is("Hello, World!!!"));
    }

    @Test
    public void checkNumberHello() {
        String s = HelloWorld3.checkNumber(9);
        assertThat(s, is("Hello"));
    }

    @Test
    public void checkNumberWorld() {
        String s = HelloWorld3.checkNumber(25);
        assertThat(s, is("World"));
    }

    @Test
    public void checkNumberDefault() {
        String s = HelloWorld3.checkNumber(14);
        assertThat(s, is("Operation not support"));
    }
}
