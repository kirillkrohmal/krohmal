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
    public void whenUserFindAllItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Item item = new Item("key001", "1", "test name1", "desc1", 2017);
        tracker.add(item);
        Input input = new StubInput(new String[]{
                "1", "key001", "1", "test name1", "desc1", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name1"));
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        //Item item = new Item("key001", "1", "test name1", "desc1", 2017);
        //tracker.add(item);
        Input input = new StubInput(new String[]{
                "0", "key001", "1", "test name1", "desc1", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name1"));
    }

    @Test
    public void whenUserFindByIdItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Item item = new Item("key002", "2", "test name2", "desc2", 2017);
        tracker.add(item);
        Input input = new StubInput(new String[]{
                "4", "key002", item.getId(), "test name2", "desc2", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name2"));
    }


    @Test
    public void whenUserDeleteItemThenTrackerHasNullItem() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Item item = new Item("key003", "3", "test name3", "desc3", 2017);
        tracker.add(item);
        Item item2 = new Item("key004", "4", "test name4", "desc4", 2017);
        tracker.add(item2);
        Item[] items = {null};
        Input input = new StubInput(new String[]{
                "3", "key003", item.getId(), "test name3", "desc3", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll(), is(items));
    }

    @Test
    public void whenUserUpdateItemThenTrackerHasAnotherItem() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Item item = new Item("key004", "9", "test name4", "desc4", 2017);
        tracker.add(item);
        Input input = new StubInput(new String[]{
                "2", "key006", item.getId(), "test name6", "desc6", "6",
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name6"));
    }

    @Test
    public void whenUserFindByNameItemThenTrackerHasItemWithName() {
        Tracker tracker = new Tracker();//key, id, name, desc, creat
        Item item = new Item("key004", "9", "test name4", "desc4", 2017);
        tracker.add(item);
        Input input = new StubInput(new String[]{
                "5", "key004", item.getId(), "test name4", "desc4", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name4"));
    }
}
