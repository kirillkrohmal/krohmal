package ru.job4j.TrackerList;

import ru.job4j.TrackerList.action.BaseAction;
import ru.job4j.TrackerList.action.UserAction;
import ru.job4j.TrackerList.inputs.Input;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp on 12.06.2017.
 */

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    List<UserAction> userAction = new ArrayList<>(9);

    private int position = 1;

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void addAction() {
        userAction.add(null);

        /*this.userAction.add(position++, action);
        for (int i = 0; i < this.position; i++) {
            this.userAction.add(null);
        }*/
    }

    public void fillActions() {
        this.userAction.add(position++, new AddItem(input, tracker));
        this.userAction.add(position++, new ShowItem(input, tracker));
        this.userAction.add(position++, new EditItem(input, tracker));
        this.userAction.add(position++, new DeleteItem(input, tracker));
        this.userAction.add(position++, new FindItemById(input, tracker));
        this.userAction.add(position++, new FindItemByName(input, tracker));
        this.userAction.add(position++, new Exit(input, tracker));
    }

    public void select(int key) {
        this.userAction.get(key).execute(this.input, tracker);
    }

    public void show() {
        for (UserAction action : userAction) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class FindItemByName extends BaseAction {

        public FindItemByName(Input input, Tracker tracker) {
            super(input, tracker);
        }

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

    private class FindItemById extends BaseAction {

        public FindItemById(Input input, Tracker tracker) {
            super(input, tracker);
        }

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
            Task task = new Task(id, id);
            tracker.findById(task.getId());
            System.out.println(String.format("%s", task));
        }
    }

    private class EditItem extends BaseAction {

        public EditItem(Input input, Tracker tracker) {
            super(input, tracker);
        }

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
            task.setId(String.valueOf(id));
            tracker.update(task);
        }
    }

    private class DeleteItem extends BaseAction {
        public DeleteItem(Input input, Tracker tracker) {
            super(input, tracker);
        }

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
            Task task = new Task(id, id);
            tracker.delete(id);
        }
    }

    private class Exit extends BaseAction {
        public Exit(Input input, Tracker tracker) {
            super(input, tracker);
        }

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
            tracker.exit();
        }
    }

    private class AddItem extends BaseAction {

        public AddItem(Input input, Tracker tracker) {
            super(input, tracker);
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
        public ShowItem(Input input, Tracker tracker) {
            super(input, tracker);
        }

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
