package ru.job4j.models;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


public class EngineTest {
    @Test
    public void whenTryCreateCommentShouldCheckThatAllOK() {
        Engine engine = new Engine();
        assertThat(engine, is(notNullValue()));
    }

    @Test
    public void whenTrySetIdShouldCheckThatIdSaved() {
        Engine engine = new Engine();
        engine.setId(1);
        assertThat(engine.getId(), is(1));
    }
}