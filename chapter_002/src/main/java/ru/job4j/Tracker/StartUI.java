package ru.job4j.Tracker;

import java.util.Scanner;

/**
 * Created by Comp on 12.06.2017.
 */
public class StartUI {
    private static int num;
    private Input input = new ValidateInput();
    private Tracker tracker;
    private MenuTracker menuTracker= new MenuTracker(input, tracker);
    private int range[] = {1, 2, 3, 4, 5, 6};
    private UserAction[] userAction = new UserAction[7];


    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
       /* Tracker tracker = new Tracker();
        MenuTracker menuTracker = new MenuTracker(this.input, tracker);
        *//*UserAction deleteAction = new UserAction() {
            @Override
            public int key() {
                return 3;
            }

            @Override
            public String info() {
                return "Delete";
            }

            @Override
            public void execute(Input input, Tracker tracker) {

            }
        };
        menuTracker.addAction(deleteAction);*//*
        menuTracker.fillActions();
        do {
            menuTracker.show();
            //int key = Integer.parseInt(input.ask("Select: "));
            menuTracker.select(input.ask("Select: ", range));

        }
        while (!"y".equals(this.input.ask("Exit? y")));*/

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
            case 6:
                break;
        }
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new ValidateInput();
        //Input inputCons = new ConsoleInput();
        new StartUI(input,tracker).init();

    }
}
