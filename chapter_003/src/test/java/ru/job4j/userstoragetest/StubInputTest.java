package ru.job4j.userstoragetest;


/**
 * Created by Comp on 22.06.2017.
 */
public class StubInputTest {
    /*@Test
    public void whenUserFindAllItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Item item = new Item("key001", "1", "test name1", "desc1", 2017);
        tracker.add(item);
        Input input = new StubInput(new String[]{
                "1", "key001", "1", "test name1", "desc1", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name1"));
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{
                "0", "key001", "1", "test name1", "desc1", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name1"));
    }

    @Test
    public void whenUserFindByIdItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Item item = new Item("key002", "2", "test name2", "desc2", 2017);
        tracker.add(item);
        Input input = new StubInput(new String[]{
                "4", "key002", item.getId(), "test name2", "desc2", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name2"));
    }

    @Test
    public void whenUserDeleteItemThenTrackerHasItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("key003", "3", "test name3", "desc3", 2017);
        tracker.add(item);
        Item item2 = new Item("key004", "4", "test name4", "desc4", 2017);
        tracker.add(item2);
        Item item3 = new Item("key005", "5", "test name5", "desc5", 2017);
        tracker.add(item3);
        Item item4 = new Item("key006", "6", "test name6", "desc6", 2017);
        tracker.add(item4);
        Item item5 = new Item("key007", "7", "test name7", "desc7", 2017);
        tracker.add(item5);
        Item item6 = new Item("key008", "8", "test name8", "desc8", 2017);
        tracker.add(item6);
        Item item7 = new Item("key009", "9", "test name9", "desc9", 2017);
        tracker.add(item7);
        Item[] items = {item, item2, item3, item7, item5, item6};
        Input input = new StubInput(new String[]{
                "3", "key006", item4.getId(), "test name6", "desc6", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll(), is(items));
    }

    @Test
    public void whenUserDeleteItemThenTrackerHasItems2() {
        Tracker tracker = new Tracker();
        Item item = new Item("key003", "3", "test name3", "desc3", 2017);
        tracker.add(item);
        Item item2 = new Item("key004", "4", "test name4", "desc4", 2017);
        tracker.add(item2);
        Item item7 = new Item("key009", "9", "test name9", "desc9", 2017);
        tracker.add(item7);
        Item[] items = {item, item7};
        Input input = new StubInput(new String[]{
                "3", "key004", item2.getId(), "test name4", "desc4", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll(), is(items));
    }

    @Test
    public void whenUserDeleteItemThenTrackerHasItems3() {
        Tracker tracker = new Tracker();
        Item item = new Item("key003", "3", "test name3", "desc3", 2017);
        tracker.add(item);
        Item item2 = new Item("key004", "4", "test name4", "desc4", 2017);
        tracker.add(item2);
        Item item7 = new Item("key009", "9", "test name9", "desc9", 2017);
        tracker.add(item7);
        //Item[] items = {item2};
        Input input = new StubInput(new String[]{
                "3", "key003", item.getId(), "test name3", "desc3", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item2.getId()), is(item2));
    }

    @Test
    public void whenUserUpdateItemThenTrackerHasAnotherItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("key004", "9", "test name4", "desc4", 2017);
        tracker.add(item);
        Input input = new StubInput(new String[]{
                "2", "key006", item.getId(), "test name6", "desc6", "6",
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name6"));
    }

    @Test
    public void whenUserFindByNameItemThenTrackerHasItemWithName() {
        Tracker tracker = new Tracker();
        Item item = new Item("key004", "9", "test name4", "desc4", 2017);
        tracker.add(item);
        Input input = new StubInput(new String[]{
                "5", "key004", item.getId(), "test name4", "desc4", "6"
        });
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name4"));
    }*/
}
