package ru.job4j;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StartUiTest {
    @Test
    public void whenFindByName() {
        StartUI startUi = new StartUI();
        startUi.add("Petr");

        assertThat(startUi.print(), is("Petr"));
    }
}
