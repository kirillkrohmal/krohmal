package ru.job4j.Tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "1", "test1", "1", 16-06-2015);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenFindByIdNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "1", "test1", "1", 16-06-2015);
        tracker.add(item);
        assertThat(tracker.findById("1"), is(item));
    }

    @Test
    public void whenFindByNameNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "1", "test1", "1", 16-06-2015);
        tracker.add(item);
        assertThat(tracker.findByName("1"), is(item));
    }

    @Test
    public void whenUpdateNewItemThenTrackerHasOtherItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "1", "test1", "1", 16-06-2015);
        Item item1 = new Item("1", "1", "test1", "1", 16-06-2015);
        tracker.add(item);
        tracker.update(item1);
        assertThat(tracker.findById("4"), is(item1));
    }

    @Test
    public void whenDeleteNewItemThenTrackerHasNullItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "1", "test1", "1", 16-06-2015);
        tracker.delete("5");
        assertThat(tracker.findById("5"), is(item));
    }
}
