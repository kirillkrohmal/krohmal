package ru.job4j.Tracker;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 22.06.2017.
 */
public class StubInputTest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Input input = new StubInput(new String[]{"0", "key001", "1", "test name1", "desc1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name1"));
    }

    @Test
    public void whenShowAllItemsThenTrackerHasShowItemWithSameName() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Input input = new StubInput(new String[]{"0", "key001", "1", "test name1", "desc1", "6", "1", "key001", "1", "test name1", "desc1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name1"));
    }
    @Test
    public void whenUserFindByIdItemThenTrackerHasItemWithName() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Input input = new StubInput(new String[]{"0", "key002", "2", "test name2", "desc2", "6", "4", "key002", "2", "test name2", "desc2", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name2"));
    }

    @Test
    public void whenUserDeleteItemThenTrackerHasNullItem() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Input input = new StubInput(new String[]{"0", "key002", "2", "test name2", "desc2", "6", "0", "key003", "3", "test name3", "desc3", "6", "3", "key003", "3", "test name3", "desc3", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name2"));
    }

    @Test
    public void whenUserUpdateItemThenTrackerHasAnotherItem() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Input input = new StubInput(new String[]{"0", "key004", "4", "test name4", "desc4", "6", "2", "key006", "6", "test name6", "desc6", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name6"));
    }

    @Test
    public void whenUserFindByNameItemThenTrackerHasItemWithName() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Input input = new StubInput(new String[]{"0", "key005", "5", "test name5", "desc5", "6", "5", "key005", "5", "test name5", "desc5", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name5"));
    }
}
