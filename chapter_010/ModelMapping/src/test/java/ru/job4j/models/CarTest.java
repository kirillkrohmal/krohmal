package ru.job4j.models;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


public class CarTest {
    @Test
    public void whenTryCreateCommentShouldCheckThatAllOK() {
        Car car = new Car();
        assertThat(car, is(notNullValue()));
    }

    @Test
    public void whenTrySetIdShouldCheckThatIdSaved() {
        Car car = new Car();
        car.setId(1);
        assertThat(car.getId(), is(1));
    }


    @Test
    public void whenTrySetTextShouldCheckThatTextSaved() {
        Car car = new Car();
        Engine engine = new Engine();
        car.setEngine(engine);
        assertThat(car.getEngine(), is(engine));
    }
}