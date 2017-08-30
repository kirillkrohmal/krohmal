package ru.job4j.TestTask2Testing;

import org.junit.Test;
import ru.job4j.TestTask2.FirmsCode;
import ru.job4j.TestTask2.TestTask2;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 22.08.2017.
 */


public class TestTask2Testing {

    @Test
    public void whenGetFirmsCodeAndSortingIt() {
        TestTask2 testTask2 = new TestTask2();
        Map<String, Integer> result = testTask2.codeArray(new FirmsCode("K1", "SK1", "SSK1"));
        String[] expected = new String[]{};
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt2() {
        TestTask2 testTask2 = new TestTask2();
        Map<String, Integer> result = testTask2.codeArray(new FirmsCode("K1", "SK1", "SSK1"));
        String[] expected = new String[]{};
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt3() {
        TestTask2 testTask2 = new TestTask2();
        Map<String, Integer> result = testTask2.codeArray(new FirmsCode("K1", "SK1", "SSK1"));
        String[] expected = new String[]{};
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt4() {
        TestTask2 testTask2 = new TestTask2();
        Map<String, Integer> result = testTask2.codeArray(new FirmsCode("K1", "SK1", "SSK1"));
        String[] expected = new String[]{};
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt5() {
        TestTask2 testTask2 = new TestTask2();
        Map<String, Integer> result = testTask2.codeArray(new FirmsCode("K1", "SK1", "SSK1"));
        String[] expected = new String[]{};
        assertThat(result, is(expected));
    }
    @Test
    public void whenGetFirmsCodeAndSortingIt6() {
        TestTask2 testTask2 = new TestTask2();
        Map<String, Integer> result = testTask2.codeArray(new FirmsCode("K1", "SK1", "SSK1"));
        String[] expected = new String[]{};
        assertThat(result, is(expected));
    }
}


