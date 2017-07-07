package ru.job4j.Tracker;

import ru.job4j.Tracker.action.BaseAction;
import ru.job4j.Tracker.action.UserAction;
import ru.job4j.Tracker.inputs.Input;

/**
 * Created by Comp on 12.06.2017.
 */

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] userAction = new UserAction[7];

    private int position = 1;

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.userAction[position++] = this.new AddItem(this.input, this.tracker);
        this.userAction[position++] = new MenuTracker.ShowItem();
        this.userAction[position++] = new EditItem();
        this.userAction[position++] = new DeleteItem();
        this.userAction[position++] = new FindItemById();
        this.userAction[position++] = new FindItemByName();
        //this.userAction[position++] = new Exit();

    }

    public void addAction(UserAction action) {
        this.userAction[position++] = action;
    }

    /*  public static void test () {
          MenuTracker tr = new MenuTracker()
          AddItem addItem = tr.new AddItem();
      }
  */
    public void select(int key) {
        this.userAction[key].execute(this.input, tracker);
    }

    public void show() {
        for (UserAction action : userAction) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    class FindItemByName extends BaseAction {

        @Override
        public int key() {
            return 6;
        }

        @Override
        public String name() {
            return "Find items by name.";
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(id, name);
            tracker.findByName(task.getName());
            System.out.println(String.format("%s", task));
        }
    }

    class FindItemById extends BaseAction {

        @Override
        public int key() {
            return 5;
        }

        @Override
        public String name() {
            return "Find item by Id.";
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            Task task = new Task(id);
            tracker.findById(task.getId());
            System.out.println(String.format("%s", task));
        }
    }

    class EditItem extends BaseAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public String name() {
            return "Edit item.";
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            String desc = input.ask("Please enter task's desc: ");
            String key = input.ask("Please enter task's key: ");
            long creat = System.currentTimeMillis();
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(key, id, name, desc, creat);
            task.setId(id);
            tracker.update(task);
        }
    }

    class DeleteItem extends BaseAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public String name() {
            return "Delete item.";
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            Task task = new Task(id);
            tracker.delete(task.getId());
        }
    }


/*class Exit extends BaseAction {

    @Override
    public int key() {
        return 7;
    }

    @Override
    public String name() {
        return "Exit Program";
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println(String.format("Введите: y/n"));
        tracker.exit();
    }
}*/

    private class AddItem extends BaseAction {
        public AddItem(Input input, Tracker tracker) {
        }

        @Override
        public int key() {
            return 1;
        }

        @Override
        public String name() {
            return "Add the new Item.";
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            String desc = input.ask("Please enter task's desc: ");
            String key = input.ask("Please enter task's key: ");
            long creat = System.currentTimeMillis();
            String name = input.ask("Please enter task's name: ");
            tracker.add(new Task(key, id, name, desc, creat));
        }
    }

    private static class ShowItem extends BaseAction {

        @Override
        public int key() {
            return 2;
        }

        @Override
        public String name() {
            return "Show all Item.";
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("%s. %s. %s. %s. %s", item.getId(), item.getName(), item.getKey(), item.getDesc(), item.getCreated())
                );
            }
        }
    }
}
