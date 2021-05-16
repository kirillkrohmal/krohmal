package ru.job4j.models;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


public class DriverTest {
    @Test
    public void whenTryCreateCommentShouldCheckThatAllOK() {
        Driver driver = new Driver();
        assertThat(driver, is(notNullValue()));
    }

    @Test
    public void whenTrySetIdShouldCheckThatIdSaved() {
        Driver driver = new Driver();
        driver.setId(1);
        assertThat(driver.getId(), is(1));
    }
}