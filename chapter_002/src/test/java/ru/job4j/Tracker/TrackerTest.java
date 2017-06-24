package ru.job4j.Tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "1");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenFindByIdNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2", "2");
        tracker.add(item);
        assertThat(tracker.findById("2"), is(item));
    }

    @Test
    public void whenFindByNameNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test3", "3");
        tracker.add(item);
        assertThat(tracker.findByName("test3"), is(item));
    }

    @Test
    public void whenUpdateNewItemThenTrackerHasOtherItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test4", "4");
        Item item1 = new Item("test94", "8");
        tracker.add(item);
        tracker.update(item1);
        assertThat(tracker.findById("4"), is(item1));
    }

    @Test
    public void whenDeleteNewItemThenTrackerHasNullItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test5", "5");
        tracker.delete("5");
        assertThat(tracker.findById("5"), is(item));
    }
}
