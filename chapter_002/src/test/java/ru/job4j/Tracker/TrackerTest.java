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
        Item[] test = {item};
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(test));
    }

    @Test
    public void whenFindByNameNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name1", "1", "test1", "1", 16-06-2015);
        Item[] test = {item};
        tracker.add(item);
        assertThat(tracker.findByName("test1"), is(test));
    }

    @Test
    public void whenUpdateNewItemThenTrackerHasOtherItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "1", "test1", "1", 16-06-2015);
        Item item1 = new Item("2", "2", "test2", "2", 16-06-2015);
        tracker.add(item);
        item1.setId(item.getId());
        tracker.update(item1);
        assertThat(tracker.findById(item.getId()), is(item1));
    }

    @Test
    public void whenDeleteNewItemThenTrackerHasNullItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "1", "test1", "1", 16-06-2015);
        Item item1 = new Item("2", "2", "test2", "2", 16-06-2015);
        Item[] test = {item};

        tracker.add(item);
        tracker.add(item1);
        tracker.delete(item1.getId());
        assertThat(tracker.findAll(), is(test));
    }
}
