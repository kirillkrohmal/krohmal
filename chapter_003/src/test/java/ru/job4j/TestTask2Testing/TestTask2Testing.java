package ru.job4j.TestTask2Testing;

import org.junit.Test;
import ru.job4j.TestTask2.FirmsCode;
import ru.job4j.TestTask2.TestTask2;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 22.08.2017.
 */


public class TestTask2Testing {

    @Test
    public void whenGetFirmsCodeAndSortingIt() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray();
        List<FirmsCode> expected = new ArrayList<>();
        expected.add(new FirmsCode("K3", "K3\\SK1", "K3\\SK1\\SSK2"));
        expected.add(new FirmsCode("K2", "K2\\SK1", "K2\\SK1\\SSK2"));
        expected.add(new FirmsCode("K1", "K1\\SK1", "K1\\SK1\\SSK1"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt2() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray2();
        List<FirmsCode> expected = new ArrayList<>();
        expected.add(new FirmsCode("K1", "K1\\SK1", "K1\\SK1\\SSK1"));
        expected.add(new FirmsCode("K2", "K2\\SK1", "K2\\SK1\\SSK2"));
        expected.add(new FirmsCode("K3", "K3\\SK1", "K3\\SK1\\SSK2"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt3() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray();
        List<FirmsCode> expected = new ArrayList<>();
        expected.add(new FirmsCode("K3", "K3\\SK1", "K3\\SK1\\SSK2"));
        expected.add(new FirmsCode("K2", "K2\\SK1", "K2\\SK1\\SSK2"));
        expected.add(new FirmsCode("K1", "K1\\SK1", "K1\\SK1\\SSK1"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt4() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray();
        List<FirmsCode> expected = new ArrayList<>();
        expected.add(new FirmsCode("K3", "K3\\SK1", "K3\\SK1\\SSK2"));
        expected.add(new FirmsCode("K2", "K2\\SK1", "K2\\SK1\\SSK2"));
        expected.add(new FirmsCode("K1", "K1\\SK1", "K1\\SK1\\SSK1"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt5() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray2();
        List<FirmsCode> expected = new ArrayList<>();
        expected.add(new FirmsCode("K1", "K1\\SK1", "K1\\SK1\\SSK1"));
        expected.add(new FirmsCode("K2", "K2\\SK1", "K2\\SK1\\SSK2"));
        expected.add(new FirmsCode("K3", "K3\\SK1", "K3\\SK1\\SSK2"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt6() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray2();
        List<FirmsCode> expected = new ArrayList<>();
        expected.add(new FirmsCode("K1", "K1\\SK1", "K1\\SK1\\SSK1"));
        expected.add(new FirmsCode("K2", "K2\\SK1", "K2\\SK1\\SSK2"));
        expected.add(new FirmsCode("K3", "K3\\SK1", "K3\\SK1\\SSK2"));
        assertThat(result, is(expected));
    }
}


