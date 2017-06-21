package ru.job4j.Tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","1", "test1", " this test Tracker1", 16/06/2017 );
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem1() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2","2", "test2", " this test Tracker2", 16/06/2017 );
        tracker.add(item);
        assertThat(tracker.findById("3"), is(item));
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem2() {
        Tracker tracker = new Tracker();
        Item item = new Item("test3","3", "test3", " this test Tracker3", 16/06/2017 );
        tracker.add(item);
        assertThat(tracker.findByName("test3"), is(item));

    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem3() {
        Tracker tracker = new Tracker();
        Item item = new Item("test4","4", "test4", " this test Tracker4", 16/06/2017 );
        tracker.add(item);
        assertThat(tracker.update(), is(item));
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem4() {
        Tracker tracker = new Tracker();
        Item item = new Item("test5","5", "test5", " this test Tracker5", 16/06/2017 );
        tracker.add(item);
        assertThat(tracker.delete("test5"), is(item));
    }
}
