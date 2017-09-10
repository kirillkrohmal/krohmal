package ru.job4j.TestTask2Testing;

import org.junit.Test;
import ru.job4j.TestTask2.FirmsCode;
import ru.job4j.TestTask2.TestTask2;

import java.util.List;
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
        List<FirmsCode> result = testTask2.codeArray();
        String[] expected = new String[]{
                "FirmsCode{primaryKey='K3', secondaryKey='K3\\SK1', tertiaryKey='K3\\SK1\\SSK2'}",
                "FirmsCode{primaryKey='K2', secondaryKey='K2\\SK1', tertiaryKey='K2\\SK1\\SSK2'}",
                "FirmsCode{primaryKey='K1', secondaryKey='K1\\SK1', tertiaryKey='K1\\SK1\\SSK1'}"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt2() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray2();
        String[] expected = new String[]{
                "FirmsCode{primaryKey='K1', secondaryKey='K1\\SK1', tertiaryKey='K1\\SK1\\SSK1'}\n" +
                "FirmsCode{primaryKey='K2', secondaryKey='K2\\SK1', tertiaryKey='K2\\SK1\\SSK2'}\n" +
                "FirmsCode{primaryKey='K3', secondaryKey='K3\\SK1', tertiaryKey='K3\\SK1\\SSK2'}"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt3() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray();
        String[] expected = new String[]{
                "FirmsCode{primaryKey='K1', secondaryKey='K1\\SK1', tertiaryKey='K1\\SK1\\SSK1'}\n" +
                "FirmsCode{primaryKey='K2', secondaryKey='K2\\SK1', tertiaryKey='K2\\SK1\\SSK2'}\n" +
                "FirmsCode{primaryKey='K3', secondaryKey='K3\\SK1', tertiaryKey='K3\\SK1\\SSK2'}"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt4() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray();
        String[] expected = new String[]{
                "FirmsCode{primaryKey='K1', secondaryKey='K1\\SK1', tertiaryKey='K1\\SK1\\SSK1'}\n" +
                "FirmsCode{primaryKey='K2', secondaryKey='K2\\SK1', tertiaryKey='K2\\SK1\\SSK2'}\n" +
                "FirmsCode{primaryKey='K3', secondaryKey='K3\\SK1', tertiaryKey='K3\\SK1\\SSK2'}"};
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirmsCodeAndSortingIt5() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray2();
        String[] expected = new String[]{
                "FirmsCode{primaryKey='K3', secondaryKey='K3\\SK1', tertiaryKey='K3\\SK1\\SSK2'}",
                "FirmsCode{primaryKey='K2', secondaryKey='K2\\SK1', tertiaryKey='K2\\SK1\\SSK2'}",
                "FirmsCode{primaryKey='K1', secondaryKey='K1\\SK1', tertiaryKey='K1\\SK1\\SSK1'}"};
        assertThat(result, is(expected));
    }
    @Test
    public void whenGetFirmsCodeAndSortingIt6() {
        TestTask2 testTask2 = new TestTask2();
        List<FirmsCode> result = testTask2.codeArray2();
        String[] expected = new String[]{
                "FirmsCode{primaryKey='K3', secondaryKey='K3\\SK1', tertiaryKey='K3\\SK1\\SSK2'}",
                "FirmsCode{primaryKey='K2', secondaryKey='K2\\SK1', tertiaryKey='K2\\SK1\\SSK2'}",
                "FirmsCode{primaryKey='K1', secondaryKey='K1\\SK1', tertiaryKey='K1\\SK1\\SSK1'}"};
        assertThat(result, is(expected));
    }
}


