package ru.job4j.Game;

import org.junit.Test;
import ru.job4j.Game.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 08.07.2017.
 */

public class GameTest {
    @Test
    public void whenThreeEquals() {
        StartUI task = new StartUI();
        String[] cell = new String[]{"0", "2", "2", "2", "0", "0"};
        String[] sameElements = new String[]{"2"};
        boolean result = task.isTrueOrFalse(cell, sameElements);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenThreeNotEquals() {
        StartUI task = new StartUI();
        String[] cell = new String[]{"0", "2", "2", "0", "0", "0"};
        String[] sameElements = new String[]{"2"};
        boolean result = task.isTrueOrFalse(cell, sameElements);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenThreeNotEquals2() {
        StartUI task = new StartUI();
        String[] cell = new String[]{"0", "2", "2", "0", "2", "0"};
        String[] sameElements = new String[]{"2"};
        boolean result = task.isTrueOrFalse(cell, sameElements);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenThreeNotEquals3() {
        StartUI task = new StartUI();
        String[] cell = new String[]{"0", "2", "2", "0", "0", "0", "1", "2"};
        String[] sameElements = new String[]{"0"};
        boolean result = task.isTrueOrFalse(cell, sameElements);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
