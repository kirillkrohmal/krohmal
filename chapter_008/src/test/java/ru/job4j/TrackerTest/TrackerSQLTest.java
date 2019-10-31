package ru.job4j.TrackerTest;

import org.junit.Test;
import ru.job4j.TrackerSQL.Item;
import ru.job4j.TrackerSQL.TrackerSQL;

import java.sql.SQLException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 09.11.2017.
 */
public class TrackerSQLTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() throws SQLException {
        TrackerSQL tracker = new TrackerSQL();
        Item item = new Item("1", "1", "test1", 1, "test1");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenFindByIdNewItemThenTrackerHasSameItem() throws SQLException {
        TrackerSQL tracker = new TrackerSQL();
        Item item = new Item("1", "1", "test1", 1, "test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }

    @Test
    public void whenFindByNameNewItemThenTrackerHasSameItem() throws SQLException {
        TrackerSQL tracker = new TrackerSQL();
        Item item = new Item("1", "1", "test1", 1, "test1");
        Item[] item2 = {item};
        tracker.add(item);
        //Item result = tracker.findByName(item2);
        //assertThat(result, is(item));
    }

    @Test
    public void whenUpdateNewItemThenTrackerHasOtherItem() throws SQLException {
        TrackerSQL tracker = new TrackerSQL();
        Item item = new Item("1", "1", "test1", 1, "test1");
        Item item1 = new Item("1", "1", "test1", 1, "test1");
        tracker.add(item);
        item1.setId(item.getId());

        tracker.update(item1);
        assertThat(tracker.findAll()[0], is(item1));
    }

    @Test
    public void whenReplaceNewItemThenTrackerHasOtherItem() throws SQLException {
        TrackerSQL tracker = new TrackerSQL();
        Item item = new Item("1", "1", "test1", 1, "test1");
        Item item1 = new Item("1", "1", "test1", 1, "test1");
        tracker.add(item);
        item.setId(item.getId());

        //Item result = tracker.replace();

        tracker.update(item1);
        assertThat(tracker.findAll()[0], is(item1));
    }

    @Test
    public void whenDeleteNewItemThenTrackerHasNullItem() throws SQLException {
        TrackerSQL tracker = new TrackerSQL();
        Item item = new Item("1", "1", "test1", 1, "test1");
        Item item1 = new Item("1", "1", "test1", 1, "test1");
        Item[] test = {item};

        tracker.add(item);
        tracker.add(item1);
        tracker.delete(item1.getId());
        assertThat(tracker.findAll(), is(test));
    }
}
