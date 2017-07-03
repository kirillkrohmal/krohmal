package ru.job4j.TestTask;

/**
 * Created by Comp on 03.07.2017.
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


    public class TaskTest {
        @Test
        public void whenAddNewItemThenTrackerHasSameItem() {
            Board tracker = new Board();
           /* Item item = new Item("1", "1", "test1", "1", 2017);
            tracker.add(item);
            assertThat(tracker.findAll()[0], is(item));*/
        }
}
