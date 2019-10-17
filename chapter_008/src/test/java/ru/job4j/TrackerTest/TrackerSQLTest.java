package ru.job4j.TrackerTest;

import org.junit.Test;
import ru.job4j.Tracker.TrackerSQL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 09.11.2017.
 */
public class TrackerSQLTest {
    @Test
    public void checkConnection() {
        TrackerSQL sql = new TrackerSQL();
        assertThat(sql.init(), is(true));
    }
}
