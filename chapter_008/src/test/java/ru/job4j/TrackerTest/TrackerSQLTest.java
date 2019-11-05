package ru.job4j.TrackerTest;

import org.jetbrains.annotations.NotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.TrackerSQL.Item;
import ru.job4j.TrackerSQL.TrackerSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 09.11.2017.
 */
public class TrackerSQLTest {
    @NotNull
    private Connection connection;
    TrackerSQL tracker = new TrackerSQL();

    @Before
    public void before() {
        try {
            String url = "jdbc:postgresql://127.0.0.1:5432/java_a_from_z";
            String username = "postgres";
            String password = "root";
            DriverManager.registerDriver(new org.postgresql.Driver());
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        try {
           connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() throws SQLException {
        Item item = new Item("1", "1", "test1", 1, "test1");
        tracker.add(item);
        assertThat(tracker.findAll(), is(item));
    }

    @Test
    public void whenFindByIdNewItemThenTrackerHasSameItem() throws SQLException {
        Item item = new Item("1", "1", "test1", 1, "test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }

    @Test
    public void whenFindByNameNewItemThenTrackerHasSameItem() throws SQLException {
        Item item = new Item("1", "1", "test1", 1, "test1");
        Item[] item2 = {item};
        String name = "test1";
        tracker.add(item);
        item2 = tracker.findByName(name);
        assertThat(item2, is(item));
    }

    @Test
    public void whenUpdateNewItemThenTrackerHasOtherItem() throws SQLException {
        Item item = new Item("1", "1", "test1", 1, "test1");
        Item item1 = new Item("1", "1", "test1", 1, "test1");
        tracker.add(item);
        item1.setId(item.getId());

        tracker.update(item1);
        assertThat(tracker.findAll(), is(item1));
    }

    @Test
    public void whenReplaceNewItemThenTrackerHasOtherItem() throws SQLException {
        Item item = new Item("1", "1", "test1", 1, "test1");
        Item item1 = new Item("1", "1", "test1", 1, "test1");
        tracker.add(item);
        item.setId(item.getId());

        tracker.replace("1", item1);
        assertThat(tracker.findAll(), is(item1));
    }

    @Test
    public void whenDeleteNewItemThenTrackerHasNullItem() throws SQLException {
        Item item = new Item("1", "1", "test1", 1, "test1");
        Item item1 = new Item("1", "1", "test1", 1, "test1");
        Item[] test = {item};

        tracker.add(item);
        tracker.add(item1);
        tracker.delete(item1.getId());
        assertThat(tracker.findAll(), is(test));
    }
}
