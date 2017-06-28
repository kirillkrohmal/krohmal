package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */

class EditItem implements UserAction {

    @Override
    public int key() {
        return 3;
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

class DeleteItem implements UserAction {

    @Override
    public int key() {
        return 4;
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

class FindItemByName implements UserAction {

    @Override
    public int key() {
        return 6;
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Find ByName Item.");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please enter task's id: ");
        String desc = input.ask("Please enter task's desc: ");
        String key = input.ask("Please enter task's key: ");
        long creat = System.currentTimeMillis();
        String name = input.ask("Please enter task's name: ");
        Task task = new Task(key, id, name, desc, creat);
        tracker.findByName(String.valueOf(new Task(key, id, name, desc, creat)));
    }
}

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] userAction = new UserAction[20];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.userAction[1] = this.new AddItem(this.input, this.tracker);
        this.userAction[2] = new MenuTracker.ShowItem();
        this.userAction[3] = new EditItem();
        this.userAction[4] = new DeleteItem();
        this.userAction[5] = new FindItemById();
        this.userAction[6] = new FindItemByName();
        //this.userAction[7] = new UserAction();

    }

    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menuTracker = new MenuTracker(this.input, tracker);
        menuTracker.fillActions();
        do {
            menuTracker.show();
            int key = Integer.parseInt(input.ask("Select: "));
            menuTracker.select(key);
        }
        while (!"y".equals(this.input.ask("Exit? y")));
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

    private class FindItemById implements UserAction {

        @Override
        public int key() {
            return 5;
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
            return 1;
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
            return 2;
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
