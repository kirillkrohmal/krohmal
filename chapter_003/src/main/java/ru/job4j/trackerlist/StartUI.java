package ru.job4j.trackerlist;

import ru.job4j.trackerlist.action.UserAction;
import ru.job4j.trackerlist.inputs.Input;
import ru.job4j.trackerlist.inputs.StubInput;
import ru.job4j.trackerlist.validator.ValidateInput;

import java.util.ArrayList;
import java.util.List;

/**
 * Измените код трекера (классы Tracker и MenuTracker) из 2-го модуля так, чтобы в
 * программе везде вместо массивов использовались ArrayLists.
 * После изменения убедитесь, что работают все тесты и внесите в них изменения при необходимости.
 */
public class StartUI {
    private static int num;
    private Input input = new ValidateInput();
    private Tracker tracker;
    private int position = 1;

    int[] range = {
            position++, position++, position++, position++, position++, position++, position++, position++
    };

    private List<UserAction> userAction = new ArrayList<UserAction>(9);

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menuTracker = new MenuTracker(this.input, tracker);
        menuTracker.fillActions();
        do {
            //menuTracker.addAction();
            menuTracker.show();
            //int key = Integer.parseInt(input.ask("Select: "));
            menuTracker.select(input.ask("Select: ", range));

        }
        while (!"y".equals(this.input.ask("Exit? y")));

        System.out.println("0. Add new Item;");
        System.out.println("1. Show all items;");
        System.out.println("2. Edit item;");
        System.out.println("3. Delete item;");
        System.out.println("4. Find item by Id;");
        System.out.println("5. Find items by name;");
        System.out.println("6. Exit Program.");

        num = Integer.valueOf(this.input.ask("Select: "));
        String key = input.ask("Please enter task's key: ");
        String id = input.ask("Please enter task's id: ");
        String name = input.ask("Please enter task's name: ");
        String desc = input.ask("Please enter task's desc: ");
        long creat = System.currentTimeMillis();

        Task task = new Task(key, id, name, desc, creat);

        switch (num) {
            case 0:
                tracker.add(task);
                break;
            case 1:
                tracker.findAll();
                break;
            case 2:
                tracker.update(task);
                break;
            case 3:
                tracker.delete(id);
                break;
            case 4:
                tracker.findById(id);
                break;
            case 5:
                tracker.findByName(name);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        //Input input = new ValidateInput();
        Input input = new StubInput(new String[]{});
        new StartUI(input, tracker).init();
    }
}
