package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */

class EditItem implements UserAction {

    @Override
    public int key() {
        return 2;
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Edit Item.");
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

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] userAction = new UserAction[5];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.userAction[0] = this.new AddItem(this.input, this.tracker);
        this.userAction[1] = new MenuTracker.ShowItem();
        this.userAction[2] = new EditItem();
        this.userAction[3] = new DeleteItem();
        this.userAction[4] = new FindItemById();
        /*;

        this.userAction[5] = new EditItem();*/

        //how to fill it
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

    private class DeleteItem implements UserAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete Item.");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            String desc = input.ask("Please enter task's desc: ");
            String key = input.ask("Please enter task's key: ");
            long creat = System.currentTimeMillis();
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(key, id, name, desc, creat);
            tracker.delete(String.valueOf(new Task(key, id, name, desc, creat)));
        }
    }

    private class FindItemById implements UserAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find Item.");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            String desc = input.ask("Please enter task's desc: ");
            String key = input.ask("Please enter task's key: ");
            long creat = System.currentTimeMillis();
            String name = input.ask("Please enter task's name: ");
            tracker.findById(String.valueOf(new Task(key, id, name, desc, creat)));
        }
    }

        private class AddItem implements UserAction {

        public AddItem(Input input, Tracker tracker) {
        }

        @Override
        public int key() {
            return 0;
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new Item.");
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

    private static class ShowItem implements UserAction {

        @Override
        public int key() {
            return 1;
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all Item.");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("%s. %s", item.getId(), item.getName())
                );
            }
        }
    }
}
