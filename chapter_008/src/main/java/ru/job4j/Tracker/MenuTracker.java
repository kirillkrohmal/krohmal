package Tracker;

import Tracker.actions.BasedAction;
import Tracker.actions.UserAction;
import Tracker.input.Input;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Comp on 12.06.2017.
 */

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> userActionList = new ArrayList<>();
    private int position = 1;

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillAction() {
        userActionList.add(null);
        userActionList.add(position++, new AddItem(input, tracker));
        userActionList.add(position++, new FindItemByName(input, tracker));
        userActionList.add(position++, new FindItemById(input, tracker));
        userActionList.add(position++, new EditItem(input, tracker));
        userActionList.add(position++, new Exit(input, tracker));
        userActionList.add(position++, new ShowItem(input, tracker));
        userActionList.add(position++, new DeleteItem(input, tracker));
    }

    public void select(int key) {
        this.userActionList.get(key).execute(this.input, tracker);
    }

    public void show() {
        for (UserAction action : userActionList) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    public class AddItem extends BasedAction {
        public AddItem(Input input, Tracker tracker) {
            super(input, tracker);
        }

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please enter task's name: ");
            String id = input.ask("Please enter task's id: ");
            String desc = input.ask("Please enter task's desc: ");
            String key = input.ask("Please enter task's key: ");
            long creat = System.currentTimeMillis();
            Task task = new Task(id, name);
            tracker.add(new Task(key, id, name, desc, creat));
            System.out.println(String.format("%s", task));
        }

        @Override
        public String name() {
            return null;
        }
    }

    private class FindItemByName extends BasedAction {
        public FindItemByName(Input input, Tracker tracker) {
            super(input, tracker);
        }

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(id, name);
            tracker.findByName(task.getName());
            System.out.println(String.format("%s", task));
        }

        @Override
        public String name() {
            return null;
        }
    }

    private class FindItemById extends BasedAction {
        public FindItemById(Input input, Tracker tracker) {
            super(input, tracker);
        }

        @Override
        public int key() {
            return 4;
        }

        @Override
        public String name() {
            return null;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            Task task = new Task(id, id);
            tracker.findById(task.getId());
            System.out.println(String.format("%s", task));
        }
    }

    private class EditItem extends BasedAction {
        public EditItem(Input input, Tracker tracker) {
            super(input, tracker);
        }

        @Override
        public int key() {
            return 2;
        }

        @Override
        public String name() {
            return null;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            String desc = input.ask("Please enter task's desc: ");
            String key = input.ask("Please enter task's key: ");
            long creat = System.currentTimeMillis();
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(key, id, name, desc, creat);
            task.setId(String.valueOf(id));
            tracker.update(task);
        }
    }

    private class DeleteItem extends BasedAction {
        DeleteItem(Input input, Tracker tracker) {
            super(input, tracker);
        }

        @Override
        public int key() {
            return 3;
        }

        @Override
        public String name() {
            return null;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter task's id: ");
            tracker.delete(id);
        }
    }

    private class Exit extends BasedAction {
        public Exit(Input input, Tracker tracker) {
            super(input, tracker);
        }

        @Override
        public int key() {
            return 6;
        }

        @Override
        public String name() {
            return null;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.exit();
        }
    }

    private class ShowItem extends BasedAction {
        public ShowItem(Input input, Tracker tracker) {
            super(input, tracker);
        }

        @Override
        public int key() {
            return 1;
        }

        @Override
        public String name() {
            return null;
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
