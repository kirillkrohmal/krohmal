package ru.job4j.models;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


public class HistoryOwnerTest {
    @Test
    public void whenTryCreateCommentShouldCheckThatAllOK() {
        HistoryOwner historyOwner = new HistoryOwner();
        assertThat(historyOwner, is(notNullValue()));
    }

    @Test
    public void whenTrySetIdShouldCheckThatIdSaved() {
        HistoryOwner historyOwner = new HistoryOwner();
        historyOwner.setId(1);
        assertThat(historyOwner.getId(), is(1));
    }

/*
    @Test
    public void whenTrySetTextShouldCheckThatTextSaved() {
        HistoryOwner historyOwner = new HistoryOwner();
        Set<Driver> driver = new HashSet<>();
        historyOwner.setDriver(driver);
        assertThat(historyOwner.getDriver(), is(driver));
    }

    @Test
    public void whenTrySetTextShouldCheckThatTextSaved2() {
        HistoryOwner historyOwner = new HistoryOwner();
        Set<Car> cars = new HashSet<>();
        historyOwner.setCar(cars);
        assertThat(historyOwner.getCar(), is(cars));
    }*/
}